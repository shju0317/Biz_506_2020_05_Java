package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.scoreVO;

/*
 * 성적을 입력받아서 scoreList에 저장하고
 * 성적리스트를 출력하는 부분 정의
 */
public class ScoreService02 {
	
	// 성적리스트를 저장하기 위한 객체
	List<scoreVO> scoreList;
	
	// 키보드를 사용해서 값들을 입력받기 위한 객체
	Scanner scan;
	
	// 선언한 scoreList, scan 객체를 사용할 수 있도록
	// 생성자에서 두 객체를 초기화한다.
	// 이 과정을 생략하면 NullPointerException이 발생하기 쉽다.
	public ScoreService02() {
		scoreList = new ArrayList<scoreVO>();
		scan = new Scanner(System.in);
	}
	
	// 한 학생의 성적을 입력받아서 scoreList에 추가하는 method
	// 변경
	// 학생의 성적을 입력받는 과정에서 학번에 END라는 문자열을 입력하게 되면
	// 성적 입력을 중단하도록 변경
	public boolean inputScore() {
		scoreVO sVO = new scoreVO();
		
		System.out.print("학번(END:입력종료)>> ");
		String strNum = scan.nextLine();
		if(strNum.equals("END")) {
			return false;
		}
		
		System.out.print("국어>> ");
		String strKor = scan.nextLine();
		
		int intKor = 0;
		
		try {
			intKor = Integer.valueOf(strKor);	
		} catch (Exception e) {
			System.out.print("국어점수는 숫자만 가능!");
		}
		// intKor는 0인 상태로 유지가 된다.
		
		if(!sVO.setIntKor(intKor)) {
			System.out.println("※ 국어 점수는 0~100까지만 가능합니다!");
			System.out.println("※ 국어 점수를 임시로 0으로 세팅합니다.");
		}
		
		System.out.print("영어>> ");
		String strEng = scan.nextLine();
		
		int intEng = 0;
		
		try {
			intEng = Integer.valueOf(strEng);	
		} catch (Exception e) {
			System.out.print("영어점수는 숫자만 가능!");
		}
		// intEng는 0인 상태로 유지가 된다.
		
		System.out.print("수학>> ");
		String strMath = scan.nextLine();
		
		int intMath = 0;
		
		try {
			intMath = Integer.valueOf(strMath);	
		} catch (Exception e) {
			System.out.print("수학점수는 숫자만 가능!");
		}
		// intMath는 0인 상태로 유지가 된다.
		
		// 키보드에 입력받은 점수를 int형으로 변환하여
		// 변수에 담겨서 온 상태
		// int형으로 변환된 점수르 scoreVO에 일단 담기
		
		sVO.setNum(strNum);
		
		sVO.setIntEng(intEng);
		sVO.setIntMath(intMath);
		
		// 총점계산
		int sum = sVO.getIntKor();
		sum += sVO.getIntMath();
		sum += sVO.getIntEng();
		
		// 평균계산을 float형으로 소수점까지 계산하기 위해서
		// 먼저 sum(총점)을 float형으로 변환하고
		// 나눗셈을 수행해서 결과를 도출한다.
		float avg = (float)sum / 3;
		
		sVO.setIntSum(sum);
		sVO.setfAvg(avg);
		
		// 한 학생의 성적 입력받아 VO에 담기 완료
		
		// 한 학생의 성적을 list에 추가
		scoreList.add(sVO);
		
		return true;
	
	} // inputScore end
	
	public void scoreList() {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("성적 일람표");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------------");
		
		// scoreList의 개수가 몇개인지 파악하여 변수에 저장
		int size = scoreList.size();
		for (int i = 0; i < size; i++) {
			// list에서 scoreVO를 추출한다.
			scoreVO sVO = scoreList.get(i);
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getIntKor() + "\t");
			System.out.print(sVO.getIntEng() + "\t");
			System.out.print(sVO.getIntMath() + "\t");
			System.out.print(sVO.getIntSum() + "\t");
			System.out.println(sVO.getfAvg());
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

}
