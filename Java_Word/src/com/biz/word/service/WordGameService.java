package com.biz.word.service;

public interface WordGameService {
	
	// word.txt 파일에서 데이터를 읽어서 wordList 만들기
	public void loadWord();
	
	// 단어를 보여주고 게임 실행하기
	public void playGame();
	
	// GameOver가 되었을 때 점수 등 보여주기
	public void gameOver();
}
