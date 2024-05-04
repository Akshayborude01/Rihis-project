package com.spring.user.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.user.entities.AppUser;
import com.spring.user.entities.CoTrgEntity;
import com.spring.user.entities.DcCaseEntity;
import com.spring.user.entities.DcEducationEntity;
import com.spring.user.entities.DcIncomeEntity;
import com.spring.user.entities.DcKidEntity;
import com.spring.user.entities.EligibilityResponse;
import com.spring.user.entities.PlanSelection;
import com.spring.user.repository.AppUserRepository;
import com.spring.user.repository.CoTrgRepository;
import com.spring.user.repository.DcCaseRepository;
import com.spring.user.repository.DcEducationRepo;
import com.spring.user.repository.DcIncomeRepo;
import com.spring.user.repository.DcKidRepo;
import com.spring.user.repository.EligiblityRepository;
import com.spring.user.repository.PlanSelectionRepository;

@Service
public class EdServiceImpl implements EdService {

	@Autowired
	private DcCaseRepository CaseRepository;

	@Autowired
	private PlanSelectionRepository planRepository;

	@Autowired
	private DcIncomeRepo incomeRepo;

	@Autowired
	private AppUserRepository userRepository;

	@Autowired
	private DcKidRepo kidRepo;

	@Autowired
	private EligiblityRepository EligibilitRepository;

	@Autowired
	private DcEducationRepo educationRepo;

	@Autowired
	private CoTrgRepository trgRepository;

	boolean ageFlag = true;
	boolean noKidsFlag = true;

	@Override
	public EligibilityResponse checkEligibility(long caseNum) {

		Integer planId = null;
		String planName = null;
		Integer appId = null;

		EligibilityResponse response = new EligibilityResponse();

		Optional<DcCaseEntity> dcCaseEntity = CaseRepository.findById(caseNum);

		if (dcCaseEntity.isPresent()) {

			planId = dcCaseEntity.get().getPlanId();
			appId = dcCaseEntity.get().getAppId();
		}

		Optional<PlanSelection> planEntity = planRepository.findById(planId);

		if (planEntity.isPresent()) {
			planName = planEntity.get().getPlanName();
		}

		DcIncomeEntity income = incomeRepo.findByCaseNum(caseNum);
		List<DcKidEntity> kids = kidRepo.findByCaseNum(caseNum);
		Optional<AppUser> citizenApp = userRepository.findById(appId);
		AppUser CitizenApp = citizenApp.get();

		if ("SNAP".equals(planName)) {

			if (income.getSalaryIncome() > 300) {
				response.setDeniedReason("income is high");
				response.setPlanStatus("Denied");

			}
		} else if ("CCAP".equals(planName)) {

			if (!kids.isEmpty()) {
				kids.forEach(kid -> {
					LocalDate dob = kid.getKidDob();
					LocalDate today = LocalDate.now();
					Period p = Period.between(dob, today);
					int years = p.getYears();

					if (years > 16) {
						ageFlag = false;
					}

				});
			} else
				response.setDeniedReason("No Kids Available");
			noKidsFlag = false;

			if (income.getSalaryIncome() > 300) {

				response.setDeniedReason("income is high");
			}
			if (!ageFlag) {
				response.setDeniedReason("age is >16");
			}

			if (income.getSalaryIncome() > 300 && !ageFlag) {
				{
					response.setDeniedReason("income is high + age status is > 16");
				}
			}
		} else if ("Medicaid".equals(planName)) {

			if (income.getSalaryIncome() > 300) {

				response.setDeniedReason("Salary income is high");

				if (income.getPropertyIncome() > 0) {
					response.setDeniedReason("property income is high");
				}
				if (income.getRentIncome() > 0) {
					response.setDeniedReason("rent income is high");

				}
				if (income.getPropertyIncome() > 0 && income.getRentIncome() > 0 && income.getSalaryIncome() > 0) {
					response.setDeniedReason("property + rent + salary income is high");

				}
			}
			if (income.getPropertyIncome() > 0 && income.getRentIncome() > 0) {
				response.setDeniedReason("property + rent income is high");
			}

		} else if ("Medicare".equals(planName)) {

			LocalDate dob = CitizenApp.getDob();
			LocalDate now = LocalDate.now();
			Period between = Period.between(dob, now);
			int years = between.getYears();

			if (years < 65) {
				response.setDeniedReason("The Age is less than 60");
			}

		} else if ("RIW".equals(planName)) {

			DcEducationEntity educationEntity = educationRepo.findByCaseNum(caseNum);
			Integer graduationYear = educationEntity.getGraduationYear();
			if (graduationYear < 0) {
				response.setDeniedReason("Not Graduated");
			}
			if (income.getSalaryIncome() > 0) {
				response.setDeniedReason("Already Employe");
			}
		}

		response.setPlanName(planName);
		if (response.getDeniedReason() != null) {
			response.setPlanStatus("Denied");
		} else {
			response.setBenfitAmount(350);
			response.setPlanStatus("Approved");
			response.setPlanStartDate(LocalDate.now().plusDays(1));
			response.setPlanEndDate(LocalDate.now().plusMonths(3));
			response.setCaseNum(caseNum);

		}

		EligibilityResponse edResp = new EligibilityResponse();

		BeanUtils.copyProperties(response, edResp);

		EligibilitRepository.save(edResp);

		CoTrgEntity trgEntity = new CoTrgEntity();
		trgEntity.setCaseNum(caseNum);
		trgEntity.setTrgStatus("pending");

		trgRepository.save(trgEntity);

		return response;
	}

}
