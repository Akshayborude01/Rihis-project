package com.spring.user.bindings;

import java.time.LocalDate;

public class UserData {

	private String fname;
	private String email;
	private long moNumber;
	private String gender;
	private LocalDate dob;
	private long ssn;

	private Integer createdBy;
	private Integer updatedBy;

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

	public long getMoNumber() {
		return moNumber;
	}

	public void setMoNumber(long moNumber) {
		this.moNumber = moNumber;
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

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "UserData [fname=" + fname + ", email=" + email + ", moNumber=" + moNumber + ", gender=" + gender
				+ ", dob=" + dob + ", ssn=" + ssn + ", createdDate=" + ", updatedDate=" + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + "]";
	}

	public UserData(String fname, String email, long moNumber, String gender, LocalDate dob, long ssn,
			LocalDate createdDate, LocalDate updatedDate, Integer createdBy, Integer updatedBy) {
		super();
		this.fname = fname;
		this.email = email;
		this.moNumber = moNumber;
		this.gender = gender;
		this.dob = dob;
		this.ssn = ssn;

		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public UserData() {
		super();
	}
}
