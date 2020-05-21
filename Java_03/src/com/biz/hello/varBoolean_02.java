package com.biz.hello;

public class varBoolean_02 {
	/*
	 * 코드 작성할 때 들여쓰기 생활화
	 */
	public static void main(String[] args) {
		int num1 = 45;
		int num2 = 25;
		
		int numP = num1 + num2;
		int numM = num1 - num2;
		int numT = num1 * num2;
		int numD = num1 / num2;

		if (numP % 2 == 0) {
			System.out.println(num1 + " + " + num2 + "은 짝수입니다.");
		}
		if (numM % 2 == 0) {
			System.out.println(num1 + " - " + num2 + "은 짝수입니다.");
		}
		if (numT % 2 == 0) {
			System.out.println(num1 + " * " + num2 + "은 짝수입니다.");
		}
		if (numD % 2 == 0) {
			System.out.println(num1 + " / " + num2 + "은 짝수입니다.");
		}
	}
}