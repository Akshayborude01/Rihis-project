package com.spring.user.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PLAN_SELECTION")
@Data
public class PlanSelection {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer planId;
	private String planName;
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
		return planName;
	}
	/**
	 * @param planName the planName to set
	 */
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	@Override
	public String toString() {
		return "PlanSelection [planId=" + planId + ", planName=" + planName + "]";
	}
	public PlanSelection(Integer planId, String planName) {
		super();
		this.planId = planId;
		this.planName = planName;
	}
	public PlanSelection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
