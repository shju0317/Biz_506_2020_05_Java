package com.biz.grade;

import com.biz.score.Student;

public class Grade_06 {
	public static void main(String[] args) {
		String strName = "홍길동";
		strName = "이몽룡";
		String strN = strName;
		System.out.println(strN);
		int intAge = 24;
		String strTel = "010-3333-3333";
		System.out.println(intAge);
		System.out.println(strTel);
		
		Student student = new Student();
		student.make();
		strN = student.getName();
		System.out.println(strN);
		
		intAge = student.getAge();
		strTel = student.getTel();
		System.out.println(intAge);
		System.out.println(strTel);
	}
}
