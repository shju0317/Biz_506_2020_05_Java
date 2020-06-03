package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV1 {
	private ScoreVO[] scoreList;
	LineService line = new LineService();
	
	String d_line = line.do_line(55);
	String s_line = line.single(55);

	public void setScoreList(ScoreVO[] scoreList) {
		this.scoreList = scoreList;
	}

	public void scoreSum() {
		for (int i = 0; i < scoreList.length; i++) {
			scoreList[i].setIntSum(scoreList[i].getIntKor() + scoreList[i].getIntEng() + scoreList[i].getIntMath()
					+ scoreList[i].getIntMusic());
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
		
		for(int i = 0 ; i< scoreList.length;i++) {
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
		
		int korAvg = korSum /10;
		int engAvg = engSum /10;
		int mathAvg = mathSum /10;
		int musicAvg = musicSum /10;
		int stdAvg = stdSum / 40;
		
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\n",korSum,engSum,mathSum,musicSum,stdSum);
		System.out.printf("평균\t%d\t%d\t%d\t%d\t\t%d\n",korAvg,engAvg,mathAvg,musicAvg,stdAvg);
		System.out.println(d_line);
	}
}
