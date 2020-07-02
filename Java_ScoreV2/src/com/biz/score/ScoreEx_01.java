package com.biz.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;
import com.biz.score.service.ScoreServiceImplV2;

public class ScoreEx_01 {
	public static void main(String[] args) {
		// interface를 implements하여 만들어진 클래스는
		// 선언을 할 때는 interface로 선언을 하고,
		// 							초기화할 때는 실제 코드가 구현된 클래스로 초기화한다.
		ScoreService sService = new ScoreServiceImplV1();
		
		/*
		 * List interface는 ArrayList클래스를 선언할 때 implements한 주체이다.
		 * 따라서 ArrayList형 객체(인스턴스)를 만들때는
		 * 선언은 List로 하고, 초기화는 ArrayList로 수행한다.
		 */
		List<String> strList = new ArrayList<String>(); // 일반적
		strList = new LinkedList<String>(); // 복잡한 자료 검색
		strList = new Vector<String>(); // 향상
		
		ArrayList<String> strList1 = new ArrayList<String>();
	}
}
