package com.biz.hello;

import java.util.Random;

public class Var_01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(100) + 1;

		if ((num % 3) == 0) {
			System.out.println(num + "은(는) 3의 배수입니다.");
		} else {
			System.out.println(num + "은(는) 3의 배수가 아닙니다.");
		}

		if ((num % 5) == 0) {
			System.out.println(num + "은(는) 5의 배수입니다.");
		} else {
			System.out.println(num + "은(는) 5의 배수가 아닙니다.");
		}
	}
}