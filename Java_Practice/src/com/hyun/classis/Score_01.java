package com.hyun.classis;

public class Score_01 {
	public String name;
	
	public int intKor;
	public int intEng;
	public int intMath;
	
	public int intSum;
	public float fAvg;
	
	public int Sum() {
		intSum = intKor + intEng + intMath;
		return intSum;
	}
	
	public float Avg() {
		fAvg = intSum / 3;
		return fAvg;
	}
}
