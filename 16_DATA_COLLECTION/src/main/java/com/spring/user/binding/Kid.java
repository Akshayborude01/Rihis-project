package com.spring.user.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Kid {

	private Integer kidId;
	private String kidName;
	private LocalDate kidDob;
	private long kidSsn;
	private String kidGender;
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
	@Override
	public String toString() {
		return "Kid [kidId=" + kidId + ", kidName=" + kidName + ", kidDob=" + kidDob + ", kidSsn=" + kidSsn
				+ ", kidGender=" + kidGender + "]";
	}
	public Kid(Integer kidId, String kidName, LocalDate kidDob, long kidSsn, String kidGender) {
		super();
		this.kidId = kidId;
		this.kidName = kidName;
		this.kidDob = kidDob;
		this.kidSsn = kidSsn;
		this.kidGender = kidGender;
	}
	public Kid() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
