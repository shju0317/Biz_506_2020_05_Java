package com.biz.grade;

import java.util.Random;

/*
 * 학생 20명의 5과목 성적처리
 */
public class Grade_02 {
	public static void main(String[] args) {
		int stdCnt = 20; // 학생 수
		int subCnt = 5 + 2; // 성적을 입력할 과목 수 + 총점 + 평균 저장하는 배열
		
		/*
		 * 배열ㅇ르 정해진 개수만큼 선언하고
		 * String[] subTitle = new String[subCnt];
		 * 정해진 개수만큼
		 */
		
//		String[] subTitle = new String[subCnt];
//		
//		subTitle[0] = "국어";
//		subTitle[1] = "영어";
//		subTitle[2] = "수학";
//		subTitle[3] = "음악";
//		subTitle[4] = "미술";
		
		/*
		 * 배열을 선언할 때 보관할 값의 개수가 얼마인지 확실치 않을 때
		 * 배열을 빈(blank) 크기만큼만 선언하고
		 * {};를 사용하여 값을 미리 저장하는 방법
		 * 이 방법을 사용하면, 배열의 개수가 변동될 때
		 * 배열에 저장되는 값을 추가,삭제하므로써 자동으로 배열이 생성된다.
		 * 
		 * 배열을 선언할 때 값으로 크기를 지정하는 방법이다.
		 */
		String[] subTitle = new String[] {
				"학번","국어","영어","수학","음악","미술","총점","평균"
		};
		

		// int[][] score : score배열을 가로세로 방향으로 선언
		// "2차원 배열, Table Array"
		int[][] score = new int[stdCnt][subCnt]; // 20 X 5 개의 공간을 갖는 2차원 배열로 선언. score[20][5]

//		score[0] = new int[subCnt];
//		score[1] = new int[subCnt];
//		score[2] = new int[subCnt];

		score[5][2] = 90; // 세로방향을 5번 위치, 가로방향으로 2번 위치에 값 90을 저장하라
		
		Random random = new Random();

		for (int i = 0; i < stdCnt; i++) { // i = index를 줄여서 임시로 사용하기 위한 변수명. 세로방향
			for (int j = 0; j < subCnt; j++) { // 가로방향
				//[0][0]~[0][4]
				//[1][0]~[1][4]
				// ...
				//[19][0]~[19][4]
				score[i][j] = random.nextInt(50) + 51;
			}
		}
		
		System.out.println("================================================================");
		System.out.println("\t\t\t2차원배열을 이용한 성적일람표");
		System.out.println("----------------------------------------------------------------");
		
		/*
		 * "배열.length" : 배열의 개수가 몇개인지 알려주는 키워드 변수, 필드 변수, 멤버 변수.
		 * 				   배열의 개수가 궁금할 때 일일이 세어보지 않아도 알 수 있게 해주는 키워드변수.
		 */
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
		
		System.out.println("================================================================");
	}
}
