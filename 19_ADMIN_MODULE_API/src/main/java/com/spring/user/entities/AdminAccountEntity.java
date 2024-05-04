package com.spring.user.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ADMIN_ACCOUNT")

public class AdminAccountEntity {
	
	@Id
	@GeneratedValue
	private Integer userId;
	private String fname;
	private String email;
	private long moNo;
	private String gender;
	private LocalDate dob;
	private long ssn;
	private String activeSw;
	private String userPwd;
	private String accStatus;
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the moNo
	 */
	public long getMoNo() {
		return moNo;
	}
	/**
	 * @param moNo the moNo to set
	 */
	public void setMoNo(long moNo) {
		this.moNo = moNo;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	/**
	 * @return the ssn
	 */
	public long getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(long ssn) {
		this.ssn = ssn;
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
	/**
	 * @return the userPwd
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	 * @param userPwd the userPwd to set
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/**
	 * @return the accStatus
	 */
	public String getAccStatus() {
		return accStatus;
	}
	/**
	 * @param accStatus the accStatus to set
	 */
	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}
	@Override
	public String toString() {
		return "AdminAccountEntity [userId=" + userId + ", fname=" + fname + ", email=" + email + ", moNo=" + moNo
				+ ", gender=" + gender + ", dob=" + dob + ", ssn=" + ssn + ", activeSw=" + activeSw + ", userPwd="
				+ userPwd + ", accStatus=" + accStatus + "]";
	}
	public AdminAccountEntity(Integer userId, String fname, String email, long moNo, String gender, LocalDate dob,
			long ssn, String activeSw, String userPwd, String accStatus) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.email = email;
		this.moNo = moNo;
		this.gender = gender;
		this.dob = dob;
		this.ssn = ssn;
		this.activeSw = activeSw;
		this.userPwd = userPwd;
		this.accStatus = accStatus;
	}
	public AdminAccountEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
