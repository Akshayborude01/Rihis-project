package com.spring.user.binding;

public class Summary {

	private String fname;
	private long ssn;
	private String planName;
	private Income incomeInfo;
	private Education educationInfo;
	private KidsInfo kidsInfo;

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
	 * @return the planName
	 */
	public String getPlanName() {
		return planName;
	}

	/**
	 * @param planName the planName to set
	 */
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	/**
	 * @return the incomeInfo
	 */
	public Income getIncomeInfo() {
		return incomeInfo;
	}

	/**
	 * @param incomeInfo the incomeInfo to set
	 */
	public void setIncomeInfo(Income incomeInfo) {
		this.incomeInfo = incomeInfo;
	}

	/**
	 * @return the educationInfo
	 */
	public Education getEducationInfo() {
		return educationInfo;
	}

	/**
	 * @param educationInfo the educationInfo to set
	 */
	public void setEducationInfo(Education educationInfo) {
		this.educationInfo = educationInfo;
	}

	/**
	 * @return the kidsInfo
	 */
	public KidsInfo getKidsInfo() {
		return kidsInfo;
	}

	/**
	 * @param kidsInfo the kidsInfo to set
	 */
	public void setKidsInfo(KidsInfo kidsInfo) {
		this.kidsInfo = kidsInfo;
	}

	@Override
	public String toString() {
		return "Summary [fname=" + fname + ", ssn=" + ssn + ", planName=" + planName + ", incomeInfo=" + incomeInfo
				+ ", educationInfo=" + educationInfo + ", kidsInfo=" + kidsInfo + "]";
	}

	public Summary(String fname, long ssn, String planName, Income incomeInfo, Education educationInfo,
			KidsInfo kidsInfo) {
		super();
		this.fname = fname;
		this.ssn = ssn;
		this.planName = planName;
		this.incomeInfo = incomeInfo;
		this.educationInfo = educationInfo;
		this.kidsInfo = kidsInfo;
	}

	public Summary() {
		super();
	}

}
