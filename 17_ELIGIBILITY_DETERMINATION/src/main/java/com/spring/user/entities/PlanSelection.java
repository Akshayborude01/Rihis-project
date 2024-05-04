package com.spring.user.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAN_SELECTION")

public class PlanSelection {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer planId;
	private String planName;
	
	public Integer getPlanId() {
		return planId;
	}
	
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	
	public String getPlanName() {
		return planName;
	}

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
		
	}
	
	

}
