package com.biz.grade;

import java.util.Random;

public class Grade_06 {
	public static void main(String[] args) {
		int intKor = 0;
		int intSum = 0;
		int intAvg = 0;

		Random random = new Random();

		for (int i = 1; i <= 10; i++) {
			intKor = random.nextInt(50) + 51;
			System.out.println(i + "번 학생의 국어점수: " + intKor);
			intSum += intKor;
		}

		intAvg = intSum / 10;

		System.out.println("==================================");
		System.out.println("총점: " + intSum);
		System.out.println("평균: " + intAvg);
	}
}
