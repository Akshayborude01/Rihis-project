package com.spring.user.binding;

import java.util.Map;

import lombok.Data;

@Data
public class PlanSelectionData {
	
	private Integer planId;
	private long caseNum;
	
	
	private Map<Integer, String> plansInfo;

	/**

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
	 * @return the caseNum
	 */
	public long getCaseNum() {
		return caseNum;
	}

	/**
	 * @param caseNum the caseNum to set
	 */
	public void setCaseNum(long caseNum) {
		this.caseNum = caseNum;
	}

	/**
	 * @return the plansInfo
	 */
	public Map<Integer, String> getPlansInfo() {
		return plansInfo;
	}

	/**
	 * @param plansInfo the plansInfo to set
	 */
	public void setPlansInfo(Map<Integer, String> plansInfo) {
		this.plansInfo = plansInfo;
	}

	@Override
	public String toString() {
		return "PlanSelectionData [planId=" + planId + ", caseNum=" + caseNum + ", plansInfo=" + plansInfo + "]";
	}

	public PlanSelectionData(Integer planId, long caseNum, Map<Integer, String> plansInfo) {
		super();
		this.planId = planId;
		this.caseNum = caseNum;
		this.plansInfo = plansInfo;
	}

	public PlanSelectionData() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
