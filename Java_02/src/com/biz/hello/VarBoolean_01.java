package com.biz.hello;

public class VarBoolean_01 {
	public static void main(String[] args) {
		System.out.println(3 == 3); // true
		System.out.println(3 > 3); // false
		System.out.println(3 < 3); // false
		System.out.println(3 >= 3); // true
		System.out.println(3 <= 3); // true
		System.out.println(3 != 3); // false
		
		/*
		 * boolean 대수
		 * 어떤 값 A,B가 각각 true이거나 false인 경우의 값만 가질 수 있는 경우
		 * 이 값을 boolean형 이라고 표현한다.
		 * boolean형인 A,B를 OR연산을 수행하면
		 * 결과는 아래와 같다.
		 * ===================
		 * A	OR	b	c
		 * -------------------
		 * f		f	f
		 * f		t	t
		 * t		f	t
		 * t		t	t
		 * ===================
		 * 
		 * ===================
		 * A	AND	b	c
		 * -------------------
		 * f		f	f
		 * f		t	f
		 * t		f	f
		 * t		t	t
		 * ===================
		 */
	}
}
