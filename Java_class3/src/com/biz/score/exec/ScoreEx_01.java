package com.biz.score.exec;

import java.util.Random;

import com.biz.score.service.ScoreServiceV1;
import com.biz.score.vo.ScoreVO;

public class ScoreEx_01 {
	public static void main(String[] args) {
		ScoreVO[] scores = new ScoreVO[10];
		
		for(int i=0; i<scores.length;i++){
			scores[i] = new ScoreVO();
		}
		
		Random random = new Random();
		
		for(int i = 0; i<scores.length;i++) {
			scores[i].setStrStdNum(""+(i+1));
			
			scores[i].setIntKor(random.nextInt(50)+51);
			scores[i].setIntEng(random.nextInt(50)+51);
			scores[i].setIntMath(random.nextInt(50)+51);
			scores[i].setIntMusic(random.nextInt(50)+51);
			
		}
		
		ScoreServiceV1 scoreServiceV1 = new ScoreServiceV1();
		
		scoreServiceV1.setScoreList(scores);
		scoreServiceV1.scoreSum();
		scoreServiceV1.scoreAvg();
		scoreServiceV1.scoreList();
	}
}
