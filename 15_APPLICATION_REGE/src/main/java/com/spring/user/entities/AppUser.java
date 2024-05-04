package com.spring.user.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "APPLICATION_REGISTRAION")
public class AppUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	private String fname;
	private String email;
	private long moNumber;
	private String gender;
	private LocalDate dob;
	private long ssn;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	private Integer createdBy;
	private Integer updatedBy;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
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
	
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
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
		return "User [id=" + id + ", fname=" + fname + ", email=" + email + ", moNumber=" + moNumber + ", gender="
				+ gender + ", dob=" + dob + ", ssn=" + ssn + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}
	public AppUser(Integer id, String fname, String email, long moNumber, String gender, LocalDate dob, long ssn,
			LocalDate createdDate, LocalDate updatedDate, Integer createdBy, Integer updatedBy) {
		super();
		this.id = id;
		this.fname = fname;
		this.email = email;
		this.moNumber = moNumber;
		this.gender = gender;
		this.dob = dob;
		this.ssn = ssn;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}
	public AppUser() {
		super();
	}
	
	
}

