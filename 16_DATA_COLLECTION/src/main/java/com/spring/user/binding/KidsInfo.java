package com.spring.user.binding;

import java.util.List;

import lombok.Data;

@Data
public class KidsInfo {

	private List<Kid> kids;
	private long caseNum;
	/**
	 * @return the kids
	 */
	public List<Kid> getKids() {
		return kids;
	}
	/**
	 * @param kids the kids to set
	 */
	public void setKids(List<Kid> kids) {
		this.kids = kids;
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
		return "KidsInfo [kids=" + kids + ", caseNum=" + caseNum + "]";
	}
	public KidsInfo(List<Kid> kids, long caseNum) {
		super();
		this.kids = kids;
		this.caseNum = caseNum;
	}
	public KidsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
