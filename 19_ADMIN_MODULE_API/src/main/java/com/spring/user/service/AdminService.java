package com.spring.user.service;

import java.util.List;

import com.spring.user.binding.AdminAccountData;
import com.spring.user.binding.PlanData;
import com.spring.user.entities.AdminAccountEntity;
import com.spring.user.entities.PlanDetailsEntity;

public interface AdminService {
	
	/******* Case Worker Account Manegment **********/
	
	public String createAccount(AdminAccountData data);
	
	public List<AdminAccountEntity> getAccounts();
	
	public String deleteAccount(Integer userId);
	
	public String accStatus(Integer userId);
	
	
	
	/************plan management*****************/
	
	public String createPlan(PlanData data);
	
	public List<PlanDetailsEntity> getAllPlans();
	
	public String deleteById(Integer planId);
	
	public String planStatus(Integer planId);
	

}
