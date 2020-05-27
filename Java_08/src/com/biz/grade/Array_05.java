package com.biz.grade;

import java.util.Random;

/*
 * 100개의 배열을 만들고
 * 1~100까지 임의의 수를 배열요소에 저장하고
 * 100개의 배열을 Console에 표시하되
 * 한줄에 5개씩 출력
 */

public class Array_05 {
	public static void main(String[] args) {
		int[] intNum = new int[100];
		Random random = new Random();

		for (int i = 0; i < 100; i++) { // 임의의 정수를 배열 요소에 할당(저장)
			intNum[i] = random.nextInt(100) + 1;
		}

		for (int i = 0; i < 100; i++) {
			System.out.printf("%d\t", intNum[i]); // 배열에 담긴 요소 출력

			if ((i + 1) % 5 == 0) { // 요소 5개마다 엔터
				System.out.println();
			}
		}
	}
}
