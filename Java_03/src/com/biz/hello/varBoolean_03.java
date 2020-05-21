package com.biz.hello;

public class varBoolean_03 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 25;
		
		if ((num1 + num2) % 2 == 0) {
			System.out.println(num1 + " + " + num2 + "은 짝수입니다.");
		}
		if ((num1 - num2) % 2 == 0) {
			System.out.println(num1 + " - " + num2 + "은 짝수입니다.");
		}
		if ((num1 * num2) % 2 == 0) {
			System.out.println(num1 + " * " + num2 + "은 짝수입니다.");
		}
		if ((num1 / num2) % 2 == 0) {
			System.out.println(num1 + " / " + num2 + "은 짝수입니다.");
		}
	}
}
