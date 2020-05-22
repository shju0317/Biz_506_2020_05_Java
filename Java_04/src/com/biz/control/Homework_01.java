package com.biz.control;

import java.util.Random;

public class Homework_01 {
	public static void main(String[] args) {
		Random rnd = new Random();

		int num1 = rnd.nextInt(51) + 50;

		for (int i = 0; i < 20; i++) {
			num1 = rnd.nextInt(51) + 50;
			System.out.println(num1);
		}
	}
}
