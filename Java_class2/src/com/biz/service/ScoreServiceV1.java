package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {

	LineService lineService = new LineService();
	int lineLength = 50;
	String d_line = lineService.do_line(lineLength);
	String s_line = lineService.single(lineLength);

	public void scoreList(ScoreVO[] score) {

		System.out.println(d_line);
		System.out.println("\t\t성적일람표");
		System.out.println(s_line);
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(s_line);
		

		// for(){} 내에서 선언된 sum,avg 변수는
		// for(){} 명령문이 종료되면 이후에 참조할 수 없다.
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			sum = score[i].getKor() + score[i].getEng() + score[i].getMath();
			int avg = sum /3;
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", score[i].getName(), score[i].getKor(), score[i].getEng(),
					score[i].getMath(), sum, avg);
		}

		System.out.println(d_line);
	}

//	public int sum(int num1, int num2, int num3) {
//		int sum = 0;
//		sum = num1+num2+num3;
//		return sum;
//	}
}
