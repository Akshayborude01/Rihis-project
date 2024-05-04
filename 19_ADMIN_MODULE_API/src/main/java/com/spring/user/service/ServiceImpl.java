package com.spring.user.service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.user.binding.AdminAccountData;
import com.spring.user.binding.PlanData;
import com.spring.user.entities.AdminAccountEntity;
import com.spring.user.entities.PlanDetailsEntity;
import com.spring.user.repositories.AdminRepo;
import com.spring.user.repositories.PlanDetailsRepo;

@Service
public class ServiceImpl implements AdminService {

	@Autowired
	private AdminRepo adminrepo;

	@Autowired
	private PlanDetailsRepo planRepo;

	@Override
	public String createAccount(AdminAccountData data) {

		AdminAccountEntity entity = new AdminAccountEntity();

		entity.setActiveSw("Y");

		entity.setUserPwd(randomPwd());

		entity.setAccStatus("locked");

		BeanUtils.copyProperties(data, entity);

		adminrepo.save(entity);

		return "Account Created Successfully";
	}

	@Override
	public List<AdminAccountEntity> getAccounts() {

		// List<AdminAccountEntity> list = adminrepo.findAll();

		List<AdminAccountEntity> list = adminrepo.findByActiveSw("Y");

		return list;
	}

	@Override
	public String deleteAccount(Integer userId) {

		Optional<AdminAccountEntity> findById = adminrepo.findById(userId);

		if (findById.isPresent()) {

			adminrepo.deleteById(userId);

			return "Id Deleted Success";
		}
		return "Id Not Found";
	}

	@Override
	public String accStatus(Integer userId) {

		Optional<AdminAccountEntity> findById = adminrepo.findById(userId);

		if (findById.isPresent()) {

			AdminAccountEntity account = findById.get();

			account.setActiveSw("N");

			AdminAccountEntity save = adminrepo.save(account);

			return "Record Deleted";
		}

		return "No Record Found";
	}

	@Override
	public String createPlan(PlanData data) {

		PlanDetailsEntity entity = new PlanDetailsEntity();

		entity.setActiveSw("Y");
		
		BeanUtils.copyProperties(data, entity);

		planRepo.save(entity);

		return "Plan Creation Success";
	}

	@Override
	public List<PlanDetailsEntity> getAllPlans() {

		List<PlanDetailsEntity> findByActiveSw = planRepo.findByActiveSw("Y");

		return findByActiveSw;
	}

	@Override
	public String deleteById(Integer planId) {

		Optional<PlanDetailsEntity> findById = planRepo.findById(planId);

		if (findById.isPresent()) {

			planRepo.deleteById(planId);

			return "Delete Success";
		}

		return "id not found";
	}

	@Override
	public String planStatus(Integer planId) {

		Optional<PlanDetailsEntity> findById = planRepo.findById(planId);

		if (findById.isPresent()) {

			PlanDetailsEntity detailsEntity = findById.get();

			detailsEntity.setActiveSw("Y");

			planRepo.save(detailsEntity);

			return "soft Delete Success";
		}

		return "Id Not Found";
	}

	public String randomPwd() {

		String text = "abcdefghijklmnopqrSTUVWXYZ1234567890";

		Random random = new Random();

		StringBuffer sb = new StringBuffer();

		int pwdLength = 8;

		for (int i = 0; i <= pwdLength; i++) {
			int index = random.nextInt(text.length());
			sb.append(text.charAt(index));

		}
		return sb.toString();
	}

	private String readEmailBody(String filename, AdminAccountEntity user) {

		StringBuffer sb = new StringBuffer();

		try (Stream<String> lines = Files.lines(Paths.get(filename))) {

			lines.forEach(line -> {
				line = line.replace("${fname} ", user.getFname());
				line = line.replace("${Temp_pwd} ", user.getUserPwd());
				line = line.replace("{EMAIL} ", user.getEmail());
				line = line.replace("${pwd} ", user.getUserPwd());

				sb.append(line);

			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		return sb.toString();

	}

}
