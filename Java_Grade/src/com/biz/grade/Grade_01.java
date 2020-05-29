package com.biz.grade;

import java.util.Random;

/*
 * 학생 20명의 5과목(국,영,수,음,미) 성적처리
 */
public class Grade_01 {
	public static void main(String[] args) {
		int stdCnt = 20; // 학생 수

		// stdCnt 크기의 배열을 과목수만큼 생성
		int[] intKorScores = new int[stdCnt];
		int[] intEngScores = new int[stdCnt];
		int[] intMathScores = new int[stdCnt];
		int[] intMusicScores = new int[stdCnt];
		int[] intArtScores = new int[stdCnt];

		Random random = new Random(); // 임의의 점수를 만들기 위한 도구 생성

		for (int i = 0; i < stdCnt; i++) { // 과목별 51~100까지의 랜덤값 입력
			intKorScores[i] = random.nextInt(50) + 51;
			intEngScores[i] = random.nextInt(50) + 51;
			intMathScores[i] = random.nextInt(50) + 51;
			intMusicScores[i] = random.nextInt(50) + 51;
			intArtScores[i] = random.nextInt(50) + 51;
		}

		System.out.println("==========================================================");
		System.out.println("\t\t\t학생 성적");
		System.out.println("----------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균\t");

		int[] intStudentSum = new int[stdCnt]; // 학생별 총점을 담는 배열

		for (int i = 0; i < stdCnt; i++) { // 학생별 5과목 총점을 intStudentSum에 저장
			intStudentSum[i] = intKorScores[i] + intEngScores[i] + intMathScores[i] + intMusicScores[i]
					+ intArtScores[i];
		}

		for (int i = 0; i < stdCnt; i++) { // 학생별 5과목 점수,총점,평균 출력
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n", (i + 1), intKorScores[i], intEngScores[i],
					intMathScores[i], intMusicScores[i], intArtScores[i], intStudentSum[i], intStudentSum[i] / 5);
		}

		System.out.println("----------------------------------------------------------");

		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intMusicSum = 0;
		int intArtSum = 0;

		for (int i = 0; i < stdCnt; i++) { // 과목별 총점 계산하여 저장
			intKorSum += intKorScores[i];
			intEngSum += intEngScores[i];
			intMathSum += intMathScores[i];
			intMusicSum += intMusicScores[i];
			intArtSum += intArtScores[i];
		}

		int intKorAvg = (intKorSum / stdCnt);
		int intEngAvg = (intEngSum / stdCnt);
		int intMathAvg = (intMathSum / stdCnt);
		int intMusicAvg = (intMusicSum / stdCnt);
		int intArtAvg = (intArtSum / stdCnt);
		
		int intTotalSum = intKorSum + intEngSum + intMathSum + intMusicSum + intArtSum;
		int intTotalAvg = intTotalSum / (5*stdCnt);

		/*
		 * printf에서 format 기호
		 * %d: (Decimal)정수,십진수 등을 표현하는 기호
		 * %s: (String)문자열을 표현하는 기호
		 * %c: (Charater)문자를 표현하는 기호
		 * \t: tab(8칸)만큼 빈칸을 만들어라
		 * \n: Enter를 누른 것 처럼 줄바꿈을 하여라
		 */
		System.out.printf("\t%d\t%d\t%d\t%d\t%d\t%d\n", intKorSum, intEngSum, intMathSum, intMusicSum, intArtSum,intTotalSum); // 과목별 총점 출력
		System.out.printf("\t%d\t%d\t%d\t%d\t%d\t\t%d\n", intKorAvg, intEngAvg, intMathAvg, intMusicAvg, intArtAvg,intTotalAvg); // 과목별 평균 출력
		System.out.println("==========================================================");
	}
}
