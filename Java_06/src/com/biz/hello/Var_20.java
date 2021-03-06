package com.biz.hello;

import java.util.Random;

public class Var_20 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int sum = 0;
		int index = 0;
		
		for(index = 1;index<10;index++) { // 임의수 10개를 만들어서
			sum += rnd.nextInt(50)+51; // sum변수에 덧셈하기
		}		
		
		/*
		 * index변수는 for반복문이 모두 끝나면
		 * 최대값(10)만큼의 값이 저장되어 있으므로 
		 * 총점/index로 나누면 평균을 구할 수 있다.
		 * 
		 * 평균을 구할 때 직접 숫자를 사용하지 않고
		 * for()반복문에서 만들어진 index값을 사용해서 평균 구하기
		 */
		System.out.println("총점: "+sum);
		System.out.println("평균: "+sum/index);
	}
}
