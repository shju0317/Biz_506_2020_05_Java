package com.biz.grade;

import java.util.Random;

/*
 * 학생 20명의 5과목 성적처리
 */
public class Grade_03 {
	public static void main(String[] args) {
		int stdCnt = 20; // 학생 수
		int subCnt = 5 + 2; // 성적을 입력할 과목 수 + 총점 + 평균 저장하는 배열
		
		Random random = new Random();
		
		String[] subTitle = new String[] { // 값으로 배열 선언하기
				"학번","국어","영어","수학","음악","미술","총점","평균"
		}; // 배열을 값으로 선언할 때는 {}끝에 반드시 ; 붙여라
		
		int[][] score = new int[stdCnt][subCnt]; // stdCnt X subCnt 개의 공간을 갖는 2차원 배열로 선언. score[20][5]

		// 과목 점수를 배열에 채워넣는 곳
		for (int i = 0; i < stdCnt; i++) {
			
			// 총점항목과 평균항목을 제외하고 과목부분만 점수를 채워넣기
			for (int j = 0; j < subCnt - 2; j++) {
				score[i][j] = random.nextInt(50) + 51;
			}
		}
		
		// 과목별 총점과 평균
		//score[i][개수-2] : 총점
		//score[i][개수-1] : 평균
	
		int scoreSum = 0;
	
		for(int i = 0; i<stdCnt;i++) {
			
			int j = 0;
			
			for(j = 0; j<subCnt-2;j++) {
				score[i][subCnt-2] += score[i][j];
			}
			// 총점을 모두 계산한 후에 평균을 구하자
			score[i][subCnt-1] += (score[i][subCnt-2] / (subCnt-2));
		}
		
		int[][] intTotal = new int[2][subCnt]; // 학생별 총점, 평균을 계산하여 보관할 배열 선언
		
		/*
		 * 이중 for문이 반복되는 방향이 세로,가로 방향이 아닌 가로,세로 방향으로 진행되어야 한다.
		 * 각 과목을 지정하는 반복이 첫번째(i) 반복
		 */
		for(int i = 0;i<subCnt;i++) { // 0~4
			// 각 학생을 지정하는 반복이 두번째(j) 반복
			for (int j = 0; j < stdCnt; j++) { // 0~19
				intTotal[0][i] += score[j][i];
			}
		}
		
		System.out.println("================================================================");
		System.out.println("\t\t2차원배열을 이용한 성적일람표");
		System.out.println("----------------------------------------------------------------");
		
		for (int i = 0; i < subTitle.length; i++) {
			System.out.printf("%s\t", subTitle[i]);
		}
		
		System.out.println("\n---------------------------------------------------------------");
		
		for (int i = 0; i < stdCnt; i++) { // 세로방향
			
			System.out.printf("%d\t",(i+1));
			
			for (int j = 0; j < subCnt; j++) { // 가로방향
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();
		}
		
		// 학생별 총점 출력
		System.out.println("---------------------------------------------------------------");
		System.out.print("총점\t");
		
		for(int i = 0 ;i<subCnt;i++) {
			System.out.printf("%d\t",intTotal[0][i]);
		}
		
		// 학생별 평균 출력
		System.out.println("\n---------------------------------------------------------------");
		System.out.print("평균\t");
		
		for(int i = 0 ;i<subCnt;i++) {
			System.out.printf("%d\t",intTotal[0][i]/stdCnt);
		}
		
		
		System.out.println("\n================================================================");
	}
}
