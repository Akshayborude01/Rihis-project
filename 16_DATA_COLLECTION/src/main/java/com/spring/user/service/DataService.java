package com.spring.user.service;

import com.spring.user.binding.Education;
import com.spring.user.binding.Income;
import com.spring.user.binding.KidsInfo;
import com.spring.user.binding.PlanSelectionData;
import com.spring.user.binding.Summary;

public interface DataService {

	public PlanSelectionData createCase(Integer id); 
	
	public long updateCitizenPlan(PlanSelectionData PlanSelection);
	
	public long saveIncomeInfo(Income income);
	
	public long saveEducationInfo(Education education);
	
	public Summary savekids(KidsInfo kidsinfo);
	
	public default void m1() {

	}

	public default void m2() {

	}

	public static void clean() {
		System.out.println("cleaning completed...");
	}
}
	