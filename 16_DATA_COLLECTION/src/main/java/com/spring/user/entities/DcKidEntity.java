package com.spring.user.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_KIDS")
@Data
public class DcKidEntity {
	@Id
	@GeneratedValue
	private Integer kidId;
	private String kidName;
	private LocalDate kidDob;
	
	private long kidSsn;
	private String kidGender;
	private long caseNum;
	/**
	 * @return the kidId
	 */
	public Integer getKidId() {
		return kidId;
	}
	/**
	 * @param kidId the kidId to set
	 */
	public void setKidId(Integer kidId) {
		this.kidId = kidId;
	}
	/**
	 * @return the kidName
	 */
	public String getKidName() {
		return kidName;
	}
	/**
	 * @param kidName the kidName to set
	 */
	public void setKidName(String kidName) {
		this.kidName = kidName;
	}
	/**
	 * @return the kidDob
	 */
	public LocalDate getKidDob() {
		return kidDob;
	}
	/**
	 * @param kidDob the kidDob to set
	 */
	public void setKidDob(LocalDate kidDob) {
		this.kidDob = kidDob;
	}
	/**
	 * @return the kidSsn
	 */
	public long getKidSsn() {
		return kidSsn;
	}
	/**
	 * @param kidSsn the kidSsn to set
	 */
	public void setKidSsn(long kidSsn) {
		this.kidSsn = kidSsn;
	}
	/**
	 * @return the kidGender
	 */
	public String getKidGender() {
		return kidGender;
	}
	/**
	 * @param kidGender the kidGender to set
	 */
	public void setKidGender(String kidGender) {
		this.kidGender = kidGender;
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
		return "DcKidEntity [kidId=" + kidId + ", kidName=" + kidName + ", kidDob=" + kidDob + ", kidSsn=" + kidSsn
				+ ", kidGender=" + kidGender + ", caseNum=" + caseNum + "]";
	}
	public DcKidEntity(Integer kidId, String kidName, LocalDate kidDob, long kidSsn, String kidGender, long caseNum) {
		super();
		this.kidId = kidId;
		this.kidName = kidName;
		this.kidDob = kidDob;
		this.kidSsn = kidSsn;
		this.kidGender = kidGender;
		this.caseNum = caseNum;
	}
	public DcKidEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
