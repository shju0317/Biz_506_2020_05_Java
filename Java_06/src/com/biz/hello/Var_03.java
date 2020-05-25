package com.biz.hello;

import java.util.Random;

public class Var_03 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int y = (rnd.nextInt(10) + 1) * 100;
		System.out.println("VAT 포함가격: " + y);
		System.out.println("VAT 별도가격: " + (int) (y / 1.1));
		System.out.println("VAT: " + (y - (int) (y / 1.1)));

	}
}
