package com.biz.test;

/*
 * 구구단 7단을 출력하는 코드를 생성
 */
public class GuGuEx {
	public static void main(String[] args) {
		
		int num = 7;
		
		System.out.println("============================");
		System.out.println("7단 구구단");
		System.out.println("============================");
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
		
		System.out.println("============================");
		
//		for (int i = 0; i < 9; i++) {
//			System.out.printf("%d x %d = %d\n", num, i + 1, num * (i + 1));
//		}
//		System.out.println("============================");
	}
}
