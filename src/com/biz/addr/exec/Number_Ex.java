package com.biz.addr.exec;

public class Number_Ex {
	public static void main(String[] args) {
		
		/*
		 * 숫자형 wrapper class의 valueOf() method를 사용하면
		 * 숫자형 문자열을 숫자형 데이터로 변환시킬 수 있다.
		 * 
		 *  오래된 java 버전에서는 valueOf(), parse*() method의 성능차이가 있었으니ㅏ
		 *  java 1.6 이상에서는 내부 메커니즘이 같아져 성능 차이가 없다.
		 */
		
		// Integer.valueof(): 숫자형 문자열을 정수로 변환시키는 method
		Integer.valueOf("25"); // 정수 25
		
		Float.valueOf("5.25");
		Double.valueOf("5.25");
		Long.valueOf("555555555555555555");
		
		// Java 1.5 이전에 사용하던 메서드
		// 이런게 있다정도만 알아두기
		Integer.parseInt("25");
		Float.parseFloat("5.25");
		Double.parseDouble("5.25");
		Long.parseLong("555555555555555555"); 
		
		// 아래와 같은 경우는 모두 NumberFormatException을 일으키는 코드
		Integer.valueOf("");
		Integer.valueOf("25 "); // 숫자 앞,뒤에 whitespace문제
		Integer.valueOf("A25"); // 숫자 앞,뒤에 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("2 5"); // 숫자 중간에 space, 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("2+5"); // 하나의 문자열이 연산식처럼 보이는 경우
	}
}
