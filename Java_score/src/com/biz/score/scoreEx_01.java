package com.biz.score;

public class scoreEx_01 {
	public static void main(String[] args) {
		ScoreService01 scoreService = new ScoreService01();
		
		while(true) {
			if (!scoreService.inputScore()) {
				break;
			}
		}
		scoreService.scoreList();
		System.out.println("성적리스트를 출력하였습니다!");
	}
}
