package com.biz.grade;

public class Array_03 {
	
	/*
	 * 1~100까지 범위의 수 중 짝수의 개수는 몇 개인가
	 * 1~100까지 범위의 수 중 3의 배수의 개수는 몇 개인가
	 */
	
	public static void main(String[] args) {
		int intNum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // 짝수 판별
				intNum++;
			}
		}

		System.out.println("짝수의 개수: " + intNum);

		intNum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) { // 3의 배수 판별
				intNum++;
			}
		}

		System.out.println("3의 배수의 개수: " + intNum);
	}
}
