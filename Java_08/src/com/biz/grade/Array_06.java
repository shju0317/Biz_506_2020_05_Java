package com.biz.grade;

import java.util.Random;

public class Array_06 {
	public static void main(String[] args) {

		int[] intNum = new int[100];
		
		// Random 클래스를 사용해서 random객체, random인스턴스를 선언
		// random객체, random인스턴스를 사용할 수 있도록 초기화하는 코드 = Random클래스의 '생성자' = new Random();
		Random random = new Random();

		random.nextInt(100); // 'random 인스턴스, 객체(object)': Random클래스로 만든 random변수
		// .nextInt(100) : Random클래스의 'method'라고 부른다.
		// random객체의 nextInt() 메서드를 '실행'하라 라고 한다.
		// random객체의 nextInt() 메서드를 '호출'하라 라고도 한다.
		
		String strN = "홍길동"; // 문자열 변수 strN
		String strM = new String(); // strM 인스턴스, strM 객체라고 부른다.
		
		for (int i = 0; i < 100; i++) { // 임의의 정수를 배열 요소에 할당(저장)
			// random객체의 nextInt()메서드를 실행하여(호출하여) 
			// 결과값을 배열 intNum의 i번째 위치에 저장(할당, 보관)하라
			intNum[i] = random.nextInt(100) + 1;
		}
		
		int intSum = 0; // 배열에 저장된 요소들 중 5개씩 덧셈을 수행할 변수를 선언

		for (int i = 0; i < 100; i++) {
			System.out.printf("%d\t", intNum[i]); // 배열에 담긴 요소 출력
			intSum += intNum[i]; //5개 요소의 합
			
			if ((i + 1) % 5 == 0) {
				//System.out.println(intSum);
				System.out.printf("%d", intSum);
				intSum = 0;
				System.out.println();
			}
		}
	}
}
