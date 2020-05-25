package com.biz.hello;

public class Var_08 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 2; i <= 100; i++) { 
			int j = 2;
			
			for (j = 2; j < i; j++) { 
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				sum += i;
			}
		}

		System.out.println("소수들의 합: " + sum);
	}
}
