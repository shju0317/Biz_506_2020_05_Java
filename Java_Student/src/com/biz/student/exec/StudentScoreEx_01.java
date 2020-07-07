package com.biz.student.exec;

import com.biz.student.service.ScoreService;
import com.biz.student.service.ScoreServiceImplV1;

public class StudentScoreEx_01 {
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreServiceImplV1();
		
		scoreService.inputStudent();
		scoreService.intputScore();
		scoreService.calcSum();
		scoreService.calcAvg();
		scoreService.scoreList();
	}
}
