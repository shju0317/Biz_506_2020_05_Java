package com.hyun.array;

public class Grade_02 {
	public static void main(String[] args) {
		int stdCnt = 5;
		
		int[] intKors = {75,88,90,95,100};
		int[] intEngs = new int[] {55,85,90,79,70};
		int[] intMaths = new int[] {97,79,100,95,80};
		
		System.out.println("##############################################");
		System.out.println("학번\t국어\t수학\t영어\t총점\t평균");
		System.out.println("----------------------------------------------");
		
		int[] intSums = new int[stdCnt];
		float[] fAvgs = new float[stdCnt];
		
		for(int i = 0; i< stdCnt; i++) { // 학생별 총점 계산
			intSums[i] = intKors[i] + intEngs[i] + intMaths[i];
		}
		
		for(int i = 0; i< stdCnt; i++) { // 학생별 평균 계산
			fAvgs[i] = intSums[i] / stdCnt;
		}
		
		for(int i = 0; i< stdCnt; i++) { // 과목별 점수, 총점, 평균 출력
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n",(i+1),intKors[i],intEngs[i],intMaths[i],
															intSums[i],fAvgs[i]);
		}
		
		System.out.println("##############################################");
	}
}
