package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.statics.SplitPositon;

public class WordGameServiceV2 implements WordGameService {
	protected List<WordVO> wordList;
	protected WordVO wordVO;
	
	protected int count = 0;
	protected int game = 0;
	
	public WordGameServiceV2() {
		wordList = new ArrayList<WordVO>();
		wordVO = new WordVO();
	}
	

	@Override
	public void loadWord() {
		String wordFile = "src/com/biz/word/exec/word.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			while(true) {
				reader = buffer.readLine();
				
				if(reader == null) {
					break;
				}

				String[] words = reader.split(":");
				
				WordVO wVO = new WordVO();
				wVO.setEng(words[SplitPositon.WORD_ENG]); // words[0]
				wVO.setKor(words[SplitPositon.WORD_KOR]); // words[1]
				wordList.add(wVO);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("단어장 파일 열기 오류");
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("단어장 읽기 오류");
			return;
		}
		
	}

	@Override
	public void playGame() {
		Random rnd = new Random();
		int size = wordList.size();
		Scanner scan = new Scanner(System.in);
		
		// 게임을 새로 시작할 때마다 초기화하자
		count = 0;
		game = 0;
		
		while(true) {
			int index = rnd.nextInt(size); // 0~size-1(1619-1) 사이의 한 수
			System.out.println("▶ 다음에 해당하는 영어단어는?!(END:종료)");
			System.out.print(wordList.get(index).getKor() + ">> ");
			String strEng = scan.nextLine();
			
			if(strEng.equalsIgnoreCase("END")) {
				break;
			}
			
			game++;
			if(strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("올 맞아용");
				count++;
			}else {
				System.out.println("아니얌ㅠㅠ");
				System.out.println("정답은 [ " + wordList.get(index).getEng() + " ] 입니다!");
			}
		}
		
	}

	@Override
	public void gameOver() {
		System.out.println("---------------------------------------------");
		System.out.println("<<<<< GAME OVER >>>>>");
		System.out.printf("[결과] %d 중 %d 번 맞췄습니당!",game, count);
		
	}
}
