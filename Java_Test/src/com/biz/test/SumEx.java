package com.biz.test;

public class SumEx {
	public static void main(String[] args) {
		
		int intSum = 0;
		
		/*
		 * id값이 0~99까지 변동되며 반복문이 실행된다.
		 */
		for(int i = 0; i<100;i++) {
			/*
			 * id값에 1을 더하면 결과는 1~100까지 변동되며 반복문이 실행될 것이고
			 * 그 결과를 intSum변수에 누적연산을 수행하여 1~100까지 덧셈을 수행하는 코드를 생성
			 */
			intSum += (i+1);
	
		}
	}
}
