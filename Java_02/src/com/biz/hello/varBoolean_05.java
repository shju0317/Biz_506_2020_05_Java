package com.biz.hello;

public class varBoolean_05 {
	public static void main(String[] args) {
		int num1 = 34;
		boolean bVar1 = (num1 % 2) == 0;
		
		if(bVar1 == true) {
			System.out.println(num1 + "는 짝수입니다.");
		}
		
		if(bVar1 == false) {
			System.out.println(num1 + "는 짝수가 아닙니다.");
		}
		
		if(bVar1) {
			System.out.println("bVarl은 true입니다.");
		}
		if(!bVar1) {
			System.out.println("bVarl은 false입니다.");
		}
		
		if(num1 % 2 == 0) {
			System.out.println(num1+"는(은) 짝수");
		}
		if(num1 % 2 != 0) {
			System.out.println(num1 + "는(은) 짝수 아님");
		}
		
		if(num1 % 3 == 0) {
			System.out.println(num1 + "는(은) 3의 배수에여'ㅁ'");
		}
		if(num1 % 3 != 0) {
			System.out.println(num1 + "는(은) 3의 배수가 아니에여'ㅁ'");
		}
	}
}