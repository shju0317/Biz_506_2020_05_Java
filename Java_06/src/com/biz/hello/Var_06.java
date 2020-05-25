package com.biz.hello;

public class Var_06 {
	public static void main(String[] args) {
//		int num1 = 0;
//		int num2 = 0;
//
//		for (num1 = 2; num1 <= 100; num1++) { //2~100 반복
//			for (num2 = 2; num2 < num1; num2++) {
//				if (num1 % num2 == 0) {
//					break;
//				}
//			}
//
//			//System.out.println("num1: " + num1);
//			//System.out.println("num2: " + num2);
//
//			if (num1 > num2) {
//				//System.out.println(num1 + "은(는) 소수가 아님.");
//			} else {
//				System.out.println(num1 + "은(는) 소수");
//			}
//		}
		
		
		for(int i =2;i<=100;i++) { // 2~100 반복
			int j = 2;
			for(j=2;j<i;j++) { // 2부터 i-1까지 반복
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.println(i+"는 소수");
			}
		}
	}
}
