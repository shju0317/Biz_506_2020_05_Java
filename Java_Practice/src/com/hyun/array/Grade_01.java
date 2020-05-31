package com.hyun.array;

import java.util.Random;

import com.hyun.classis.Score_01;

public class Grade_01 {
	public static void main(String[] args) {
		int stdCnt = 5;
		
		Score_01[] scores = new Score_01[3];
		
		scores[0] = new Score_01();
		scores[1] = new Score_01();
		scores[2] = new Score_01();
		
		scores[0].name = "고양이";
		scores[1].name = "강아지";
		scores[2].name = "송아지";
		
		Random random = new Random();
		
		for(int i = 0;i<3;i++) {
			scores[i].intKor = random.nextInt(60)+41;
			scores[i].intEng = random.nextInt(60)+41;
			scores[i].intMath = random.nextInt(60)+41;
		}
		
		
		System.out.println("##############################################");
		System.out.println("학번\t국어\t수학\t영어\t총점\t평균");
		System.out.println("----------------------------------------------");
		
		for(int i = 0 ;i<3;i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n", (i+1), scores[i].intKor, scores[i].intEng,
					scores[i].intMath, scores[i].Sum(), scores[i].Avg());
		}
		System.out.println("##############################################");
		
	}

}
