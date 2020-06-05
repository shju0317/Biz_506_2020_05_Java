package com.hyun.list.exec;

import java.util.Random;

import com.hyun.list.model.ScoreVO;
import com.hyun.list.service.ScoreServiceV1;

public class ScoreEx01 {
	public static void main(String[] args) {
		ScoreVO[] scoreList = new ScoreVO[15];
		
		int scoreSize = scoreList.length;
		
		for(int i = 0; i < scoreSize;i++) {
			scoreList[i] = new ScoreVO();
		}
		
		Random rnd = new Random();
		
		for(int i = 0;i<scoreSize; i++) {
			scoreList[i].setIntNum(i);
			
			scoreList[i].setIntKor(rnd.nextInt(100)+1);
			scoreList[i].setIntEng(rnd.nextInt(100)+1);
			scoreList[i].setIntMath(rnd.nextInt(100)+1);
		}
		
		ScoreServiceV1 sService = new ScoreServiceV1();
		sService.scoreList(scoreList);
		
	}
}
