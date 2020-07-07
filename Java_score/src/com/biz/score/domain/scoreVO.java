package com.biz.score.domain;

public class scoreVO {
	private int intStudentId;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private int intAvg;
	
	public scoreVO() {

	}
	
	public scoreVO(int intStudentId, int intKor, int intEng, int intMath, int intSum, int intAvg) {
		this.intStudentId = intStudentId;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.intSum = intSum;
		this.intAvg = intAvg;
	}
	
	public int getIntStudentId() {
		return intStudentId;
	}
	public void setIntStudentId(int intStudentId) {
		this.intStudentId = intStudentId;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}
	
	
}
