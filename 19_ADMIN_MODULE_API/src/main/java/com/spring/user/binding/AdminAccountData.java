package com.spring.user.binding;

import java.time.LocalDate;

public class AdminAccountData {

	private String fname;
	private String email;
	private long moNo;
	private String gender;
	private LocalDate dob;
	private long ssn;
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getMoNo() {
		return moNo;
	}
	
	public void setMoNo(long moNo) {
		this.moNo = moNo;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
		public long getSsn() {
		return ssn;
	}
	
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "AdminAccountData [fname=" + fname + ", email=" + email + ", moNo=" + moNo + ", gender=" + gender
				+ ", dob=" + dob + ", ssn=" + ssn + "]";
	}
	public AdminAccountData(String fname, String email, long moNo, String gender, LocalDate dob, long ssn) {
		super();
		this.fname = fname;
		this.email = email;
		this.moNo = moNo;
		this.gender = gender;
		this.dob = dob;
		this.ssn = ssn;
	}
	public AdminAccountData() {
		super();
		
	}
	
	
	
}
