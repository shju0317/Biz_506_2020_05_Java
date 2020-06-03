package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV2 {
	
	/*
	 * scores 인스턴스배열ㅇ르 필드변수로 선언한 이유
	 * Ex클래스에서 Service클래스에서
	 * 총점계산, 평균계산, 리스트출력을 요청할텐데
	 * 요청을 할때마다 scores인스턴스 배열을 매개변수로 전달할 수 있지만
	 * 한번만 변수로 전댈해 Service클래스가 scores인스턴스를 보관하도록 하고
	 * 나머지 요청하는 메서드에서는 변수를 받는 부분을 제거하기 위함이다.
	 * 
	 * Ex클래스에서 요청들을 할때마다 scores배열을 매개변수로 전달을 하면
	 * 요청과 요청사이에서 다른 코드에 의해 scores배열값이
	 * 변형되어 결과가 엉뚱하게 나타나는 것을 방지하는 목적도 있다.
	 */
	
	private ScoreVO[] scoreList;
	LineService line = new LineService();
	
	String d_line = line.do_line(55);
	String s_line = line.single(55);

	/*
	 * 필드변수로 scores 선언되어 있기 때문에
	 * 학생 총점과 평균을 계산한 수
	 * 어디에 저장해야 할지를 고민하지 않아도 된다.
	 */
	public void scoreSum(ScoreVO[] scoreList) {
		
		this.scoreList = scoreList;
		
		for (int i = 0; i < scoreList.length; i++) {
			scoreList[i].setIntSum(scoreList[i].getIntKor() + scoreList[i].getIntEng() + scoreList[i].getIntMath()
					+ scoreList[i].getIntMusic());
			
//			int sum = scoreList[i].getIntKor() + scoreList[i].getIntEng() + scoreList[i].getIntMath()
//					+ scoreList[i].getIntMusic();
//			
//			scoreList[i].setIntSum(sum);
		}
	}

	public void scoreAvg() {
		for (int i = 0; i < scoreList.length; i++) {
			scoreList[i].setIntAvg(scoreList[i].getIntSum() / 4);
		}
	}
	
	public void scoreList() {
		System.out.println(d_line);
		System.out.println("\t\t\t성적리스트");
		System.out.println(s_line);
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(s_line);
		
		// 점수리스트를 표시할 때는 for반복문을 이용
		// this. 현재 이 클래스에 선언된 이라는 뜻
		for(int i = 0 ; i< this.scoreList.length;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",scoreList[i].getStrStdNum(),scoreList[i].getIntKor(),scoreList[i].getIntEng(),
					scoreList[i].getIntMath(),scoreList[i].getIntMusic(),scoreList[i].getIntSum(),scoreList[i].getIntAvg());
		}
		System.out.println(s_line);
		
		int stdSum = 0;
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;	
		int musicSum = 0;
		
		for(int i=0;i<scoreList.length;i++) {
			korSum += scoreList[i].getIntKor();
			engSum += scoreList[i].getIntEng();
			mathSum += scoreList[i].getIntMath();
			musicSum += scoreList[i].getIntMusic();
			stdSum += scoreList[i].getIntSum();
		}
		
		int korAvg = korSum /scoreList.length;
		int engAvg = engSum /scoreList.length;
		int mathAvg = mathSum /scoreList.length;
		int musicAvg = musicSum /scoreList.length;
		int stdAvg = stdSum /(scoreList.length *4);
		
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n","총점",korSum,engSum,mathSum,musicSum,stdSum);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t\t%d\n","평균",korAvg,engAvg,mathAvg,musicAvg,stdAvg);
		System.out.println(d_line);
	}
}
