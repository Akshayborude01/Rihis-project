package com.spring.user.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DC_EDUCATION")

public class DcEducationEntity {

	@Id
	@GeneratedValue
	private Integer educationId;
	private String highestDegree;
	private Integer graduationYear;
	private String universityName;
    private long caseNum;
	/**
	 * @return the educationId
	 */
	public Integer getEducationId() {
		return educationId;
	}
	/**
	 * @param educationId the educationId to set
	 */
	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
	}
	/**
	 * @return the highestDegree
	 */
	public String getHighestDegree() {
		return highestDegree;
	}
	/**
	 * @param highestDegree the highestDegree to set
	 */
	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}
	/**
	 * @return the graduationYear
	 */
	public Integer getGraduationYear() {
		return graduationYear;
	}
	/**
	 * @param graduationYear the graduationYear to set
	 */
	public void setGraduationYear(Integer graduationYear) {
		this.graduationYear = graduationYear;
	}
	/**
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}
	/**
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
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
		return "DcEducationEntity [educationId=" + educationId + ", highestDegree=" + highestDegree
				+ ", graduationYear=" + graduationYear + ", universityName=" + universityName + ", caseNum=" + caseNum
				+ "]";
	}
	public DcEducationEntity(Integer educationId, String highestDegree, Integer graduationYear, String universityName,
			long caseNum) {
		super();
		this.educationId = educationId;
		this.highestDegree = highestDegree;
		this.graduationYear = graduationYear;
		this.universityName = universityName;
		this.caseNum = caseNum;
	}
	public DcEducationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
