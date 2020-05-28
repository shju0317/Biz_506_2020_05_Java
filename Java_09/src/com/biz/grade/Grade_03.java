package com.biz.grade;

import java.util.Random;

public class Grade_03 {
	public static void main(String[] args) {
		int intNum1 = 0;
		Random random = new Random();
		
		intNum1 = random.nextInt();
		
		int intNum2 = intNum1 * 55;
		
		System.out.println(intNum2);
	}
}
