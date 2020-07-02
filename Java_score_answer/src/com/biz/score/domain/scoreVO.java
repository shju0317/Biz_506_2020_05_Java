package com.biz.score.domain;

/*
 * 성적처리 과정에서 한 학생의 성적을 담는 Object 변수
 * Value Object 클래스라고 한다.
 * VO, DTO 클래스들을 domain클래스라고 한다.
 */
public class scoreVO {
	private String num;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float fAvg;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getIntKor() {
		return intKor;
	}
	
	
	// 정보의 유효성 검사
	// 현재 국어점수 필드에 저장하려고 하는 값이 유효한 값인지
	
	// 성적은 0~100 까지가 기본값인데
	// 만약 성적을 0 미만, 100 초과된 값을 저장하려고 하면
	// 거부하도록 setKor() 변경
	public boolean setIntKor(int intKor) {
		if(intKor < 0 || intKor > 100) {
			return false;
		}
		this.intKor = intKor;
		return true;
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
	public float getfAvg() {
		return fAvg;
	}
	public void setfAvg(float fAvg) {
		this.fAvg = fAvg;
	}
	
	

}
