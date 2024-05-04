package com.spring.user.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_INCOME")
@Data
public class DcIncomeEntity {

	@Id
	@GeneratedValue
	private Integer incomeId;
	private Double salaryIncome;
	private Double rentIncome;
	private Double propertyIncome;
	
	private long caseNum;

	/**
	 * @return the incomeId
	 */
	public Integer getIncomeId() {
		return incomeId;
	}

	/**
	 * @param incomeId the incomeId to set
	 */
	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}

	/**
	 * @return the salaryIncome
	 */
	public Double getSalaryIncome() {
		return salaryIncome;
	}

	/**
	 * @param salaryIncome the salaryIncome to set
	 */
	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	/**
	 * @return the rentIncome
	 */
	public Double getRentIncome() {
		return rentIncome;
	}

	/**
	 * @param rentIncome the rentIncome to set
	 */
	public void setRentIncome(Double rentIncome) {
		this.rentIncome = rentIncome;
	}

	/**
	 * @return the propertyIncome
	 */
	public Double getPropertyIncome() {
		return propertyIncome;
	}

	/**
	 * @param propertyIncome the propertyIncome to set
	 */
	public void setPropertyIncome(Double propertyIncome) {
		this.propertyIncome = propertyIncome;
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

	@Override
	public String toString() {
		return "DcIncomeEntity [incomeId=" + incomeId + ", salaryIncome=" + salaryIncome + ", rentIncome=" + rentIncome
				+ ", propertyIncome=" + propertyIncome + ", caseNum=" + caseNum + "]";
	}

	public DcIncomeEntity(Integer incomeId, Double salaryIncome, Double rentIncome, Double propertyIncome,
			long caseNum) {
		super();
		this.incomeId = incomeId;
		this.salaryIncome = salaryIncome;
		this.rentIncome = rentIncome;
		this.propertyIncome = propertyIncome;
		this.caseNum = caseNum;
	}

	public DcIncomeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
