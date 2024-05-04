package com.spring.user.binding;

import java.time.LocalDate;

public class PlanData {

	private String PlanName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String planCategory;
	/**
	 * @return the planName
	 */
	public String getPlanName() {
		return PlanName;
	}
	/**
	 * @param planName the planName to set
	 */
	public void setPlanName(String planName) {
		PlanName = planName;
	}
	/**
	 * @return the planStartDate
	 */
	public LocalDate getPlanStartDate() {
		return planStartDate;
	}
	/**
	 * @param planStartDate the planStartDate to set
	 */
	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}
	/**
	 * @return the planEndDate
	 */
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	/**
	 * @param planEndDate the planEndDate to set
	 */
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	/**
	 * @return the planCategory
	 */
	public String getPlanCategory() {
		return planCategory;
	}
	/**
	 * @param planCategory the planCategory to set
	 */
	public void setPlanCategory(String planCategory) {
		this.planCategory = planCategory;
	}
	@Override
	public String toString() {
		return "PlanData [PlanName=" + PlanName + ", planStartDate=" + planStartDate + ", planEndDate=" + planEndDate
				+ ", planCategory=" + planCategory + "]";
	}
	public PlanData(String planName, LocalDate planStartDate, LocalDate planEndDate, String planCategory) {
		super();
		PlanName = planName;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
		this.planCategory = planCategory;
	}
	public PlanData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
