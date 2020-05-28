package com.biz.grade;

import java.util.Random;

import com.biz.score.Student;

public class Grade_05 {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 100000000; i++) { // (10^8 - 1)번 반복
			sum = 100; // 할당문: 그 전의 값이 어떻든 마지막 할당된 값만 기억
		} // sum은 얼마?
		
		System.out.println(sum);
		// for문이 몇 번 반복되는지 상관없이 
		// sum = 100 으로 항상 sum이라는 변수에는 100이라는 값이 들어간다.
		// sum이라는 변수가 for문 밖에서 선언되었기 때문에 for문 밖에서 출력이 가능하다.
		// 100이 출력된다.
		
		for(int i = 0; i<10;i++) {
			System.out.println(sum);
		}
		

		Student student = new Student();

		// Student클래스에 선언된 make()메서드를 호출하기
		student.make();
		
		String strN = student.getName();

//		public class Student {
//
//			String strName = "홍길동";
//			
//			public void make() {	
//				strName = "이몽룡";
//			}
// 			??strName => "이몽룡"	
//		
//		public String getName() {
//			return strName;
//		   }
//		   ??strName => "이몽룡"
//		}
//   ??strName => 오류(strName은 사라졌음.)
		
		System.out.println(strN);
		
		Random rnd = new Random();
		
	}
}
