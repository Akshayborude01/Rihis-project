package com.spring.user.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "PLAN_DETAILS_ENTITY")
public class PlanDetailsEntity {
	
	@Id
	@GeneratedValue
	private Integer planId;
	private String PlanName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String planCategory;
	private String activeSw;
	/**
	 * @return the planId
	 */
	public Integer getPlanId() {
		return planId;
	}
	/**
	 * @param planId the planId to set
	 */
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
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
	/**
	 * @return the activeSw
	 */
	public String getActiveSw() {
		return activeSw;
	}
	/**
	 * @param activeSw the activeSw to set
	 */
	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}
	@Override
	public String toString() {
		return "PlanDetailsEntity [planId=" + planId + ", PlanName=" + PlanName + ", planStartDate=" + planStartDate
				+ ", planEndDate=" + planEndDate + ", planCategory=" + planCategory + ", activeSw=" + activeSw + "]";
	}
	public PlanDetailsEntity(Integer planId, String planName, LocalDate planStartDate, LocalDate planEndDate,
			String planCategory, String activeSw) {
		super();
		this.planId = planId;
		PlanName = planName;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
		this.planCategory = planCategory;
		this.activeSw = activeSw;
	}
	public PlanDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	
}
