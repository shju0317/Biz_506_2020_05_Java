package com.biz.grade;

import java.util.Random;

public class Grade_11 {
	public static void main(String[] args) {
		int[] intNum = new int[10];
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			intNum[i] = random.nextInt(100) + 1;
		}

		// intNum배열에 저장된 정수가 짝수인지 판별하여 Console에 표시
		for (int i = 0; i < 10; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.println(intNum[i] + "은 짝수입니다.");
			} else {
				System.out.println(intNum[i] + "은 짝수가 아닙니다.");
			}
		}
	}
}
