package com.biz.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.scoreVO;

public class ScoreService01 {
	List<scoreVO> scoreList;
	Scanner scan = new Scanner(System.in);

	public ScoreService01() {
		scoreList = new ArrayList<scoreVO>();
		scan = new Scanner(System.in);
	}

	public boolean inputScore() {
		System.out.print("학번 입력(중단:END)>> ");
		String strStudentId = scan.nextLine();
		
		
		if(strStudentId.equalsIgnoreCase("END")) {
			return false;
		}
		
		int intStudentId = Integer.valueOf(strStudentId);
		
		System.out.print("국어 점수입력>> ");
		String strKor = scan.nextLine();
		int intKor = Integer.valueOf(strKor);
		
		System.out.print("영어 점수입력>> ");
		String strEng = scan.nextLine();
		int intEng = Integer.valueOf(strEng);
		
		System.out.print("수학 점수입력>> ");
		String strMath = scan.nextLine();
		int intMath = Integer.valueOf(strMath);
		
		scoreVO sVO = new scoreVO();
		sVO.setIntStudentId(intStudentId);
		sVO.setIntKor(intKor);
		sVO.setIntEng(intEng);
		sVO.setIntMath(intMath);
		
		scoreList.add(sVO);
		
		return true;
	}
	
	public void scoreList() {
		System.out.println("=================================================");
		System.out.println("성적 리스트");
		System.out.println("-------------------------------------------------");
		System.out.println("학번\t국어\t수학\t영어\t총합\t평균");
		System.out.println("-------------------------------------------------");
		
		int scoreSize = scoreList.size();
		
		// 개수만큼 반복문을 수행하도록 변경
		for(int i = 0 ; i < scoreSize; i++) {
			scoreVO vo = scoreList.get(i);
			int intSum = vo.getIntKor() + vo.getIntEng() + vo.getIntMath();
			int intAvg = intSum / scoreSize;
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", vo.getIntStudentId(), vo.getIntKor(), vo.getIntEng(), vo.getIntMath(), intSum, intAvg);
		}
		
		System.out.println("=================================================");
	}
}
