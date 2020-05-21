package com.biz.hello;

public class VarGuGu_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2 = 0;
		num1 = 7;
		num2 = 0;

		for (int i = 0; i < 9; i++) {
			System.out.println(num1 + "x" + ++num2 + "=" + num1 * num2);
		}
	}
}
