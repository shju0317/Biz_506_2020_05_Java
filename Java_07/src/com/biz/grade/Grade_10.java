package com.biz.grade;

import java.util.Random;

public class Grade_10 {
	public static void main(String[] args) {

		int[] intKorScore = new int[10];
		int[] intEngScore = new int[10];
		int[] intMathScore = new int[10];

		Random random = new Random();

		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		
		// 입력부분, 출력부분 for문 따로 만드는 것이 좋음.
		for (int i = 0; i < 10; i++) {
			intKorScore[i] = random.nextInt(50) + 51;
			intEngScore[i] = random.nextInt(50) + 51;
			intMathScore[i] = random.nextInt(50) + 51;
		}
		
		System.out.println("==============================================");
		System.out.println("\t\t학생 성적 리스트");
		System.out.println("----------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n",(i+1),intKorScore[i],intEngScore[i],
					intEngScore[i],(intKorScore[i]+intEngScore[i]+intEngScore[i]),
					(intKorScore[i]+intEngScore[i]+intEngScore[i])/3);
			
			intKorSum += intKorScore[i];
			intEngSum += intEngScore[i];
			intMathSum += intMathScore[i];
		}
		
		System.out.println("==============================================");
		//System.out.printf("\t%d\t%d\t%d\n",intKorSum,intEngSum,intMathSum);
		System.out.printf("\t%d\t%d\t%d\n",intKorSum/10,intEngSum/10,intMathSum/10);
		System.out.println("----------------------------------------------");
		System.out.printf("\t\t\t\t%d\t%d\n",(intKorSum + intMathSum + intEngSum),(intKorSum + intMathSum + intEngSum) / 30);
		System.out.println("==============================================");
	}
}
