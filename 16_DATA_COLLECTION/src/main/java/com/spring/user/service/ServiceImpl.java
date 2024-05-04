package com.spring.user.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.user.binding.Education;
import com.spring.user.binding.Income;
import com.spring.user.binding.Kid;
import com.spring.user.binding.KidsInfo;
import com.spring.user.binding.PlanSelectionData;
import com.spring.user.binding.Summary;
import com.spring.user.entities.AppUser;
import com.spring.user.entities.DcCaseEntity;
import com.spring.user.entities.DcEducationEntity;
import com.spring.user.entities.DcIncomeEntity;
import com.spring.user.entities.DcKidEntity;
import com.spring.user.entities.PlanSelection;
import com.spring.user.repositories.AppUserRepo;
import com.spring.user.repositories.DcCaseRepo;
import com.spring.user.repositories.DcEducationRepo;
import com.spring.user.repositories.DcIncomeRepo;
import com.spring.user.repositories.DcKidRepo;
import com.spring.user.repositories.PlanSelctionRepo;

@Service
public class ServiceImpl implements DataService {

	@Autowired
	private AppUserRepo appUsserRepo;

	@Autowired
	private DcCaseRepo dcCaseRepo;

	@Autowired
	private PlanSelctionRepo selectionRepo;

	@Autowired
	private DcIncomeRepo incomeRepo;

	@Autowired
	private DcEducationRepo educationRepo;

	@Autowired
	private DcKidRepo kidRepo;

	@Override
	public PlanSelectionData createCase(Integer id) {

		PlanSelectionData plansel = new PlanSelectionData();

		Optional<AppUser> findById = appUsserRepo.findById(id);

		if (findById.isPresent()) {

			DcCaseEntity entity = new DcCaseEntity();

			entity.setAppId(id);
			entity = dcCaseRepo.save(entity);

			plansel.setCaseNum(entity.getCaseNum());

			List<PlanSelection> plans = selectionRepo.findAll();

			Map<Integer, String> planmap = new HashMap<>();

			plans.forEach(plan ->

			planmap.put(plan.getPlanId(), plan.getPlanName()));

			plansel.setPlansInfo(planmap);
		}
		return plansel;
	}

	@Override
	public long updateCitizenPlan(PlanSelectionData plansel) {

		Integer planId = plansel.getPlanId();

		long caseNum = plansel.getCaseNum();

		Optional<DcCaseEntity> findById = dcCaseRepo.findById(caseNum);

		if (findById.isPresent()) {

			DcCaseEntity dcCaseEntity = findById.get();

			dcCaseEntity.setPlanId(planId);

			dcCaseRepo.save(dcCaseEntity);
		}
		return caseNum;
	}

	@Override
	public long saveIncomeInfo(Income income) {

		DcIncomeEntity entity = new DcIncomeEntity();

		BeanUtils.copyProperties(income, entity);

		incomeRepo.save(entity);

		long caseNum = income.getCaseNum();

		return caseNum;
	}

	@Override
	public long saveEducationInfo(Education education) {

		DcEducationEntity entity = new DcEducationEntity();

		BeanUtils.copyProperties(education, entity);

		educationRepo.save(entity);

		return education.getCaseNum();
	}

	@Override
	public Summary savekids(KidsInfo kidsinfo) {

		long caseNum = kidsinfo.getCaseNum();

		List<Kid> kids = kidsinfo.getKids();

		List<DcKidEntity> kidEntity = new ArrayList<>();

		kids.forEach(kid -> {
			DcKidEntity entity = new DcKidEntity();
			BeanUtils.copyProperties(kid, entity);
			entity.setCaseNum(caseNum);
			kidEntity.add(entity);

		});

		kidRepo.saveAll(kidEntity);

		return getSummary(caseNum);
	}

	private Summary getSummary(long caseNum) {

		Optional<DcCaseEntity> dcCase = dcCaseRepo.findById(caseNum);

		Integer appId = dcCase.get().getAppId();
		Integer planId = dcCase.get().getPlanId();

		Optional<PlanSelection> plan = selectionRepo.findById(planId);
		String planName = plan.get().getPlanName();

		Optional<AppUser> app = appUsserRepo.findById(appId);

		String fname = app.get().getFname();
		long ssn = app.get().getSsn();

		DcIncomeEntity dcIncome = incomeRepo.findByCaseNum(caseNum);
		DcEducationEntity dcEducation = educationRepo.findByCaseNum(caseNum);
		List<DcKidEntity> dckid = kidRepo.findByCaseNum(caseNum);

		Summary summary = new Summary();

		summary.setPlanName(planName);
		summary.setFname(fname);
		summary.setSsn(ssn);

		return summary;
	}
}
