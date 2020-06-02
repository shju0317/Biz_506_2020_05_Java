package com.biz.exec;

import java.util.Random;

import com.biz.model.ScoreVO;
import com.biz.service.ScoreServiceV2;

public class Ex_05 {
	public static void main(String[] args) {
		ScoreVO[] score = new ScoreVO[20];

		for (int i = 0; i < score.length; i++) {
			score[i] = new ScoreVO();
		}

		Random random = new Random();

		for (int i = 0; i < score.length; i++) {
			score[i].setKor(random.nextInt(50) + 51);
			score[i].setEng(random.nextInt(50) + 51);
			score[i].setMath(random.nextInt(50) + 51);
			score[i].setName("" + (i + 1));
		}
		
		ScoreServiceV2 scoreService = new ScoreServiceV2();
		scoreService.setScoreList(score);
		scoreService.scoreSum();
		scoreService.scoreList(); // set하지 않으면 Error: NullPointerException
	}
}
