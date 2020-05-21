package com.biz.hello;

import java.util.*;

public class varBoolean_05 {
	public static void main(String[] args) {
		Random rnd = new Random(); // 난수
		int num1 = rnd.nextInt(100);
		boolean bVar = (num1 % 2) == 0;

		if (bVar) {
			System.out.println(num1 + "은(는) 짝수지롱");
		}
		if(!bVar){
			System.out.println(num1 + "은(는) 짝수아니지롱");
		}
	}
}
