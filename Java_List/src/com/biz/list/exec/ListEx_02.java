package com.biz.list.exec;

//util : 가장 오래된 패키지
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 {
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ;i<100;i++) {
			// 1~100까지 난수(임의숫자)를 발생하여
			int num1 = rnd.nextInt(100)+1;
			
			// intList에 추가하라
			intList.add(num1);
			
			// intList.add(rnd.nextInt(100)+1);
		}
		// size() 100이 되고 정수값이 100개 추가된 intList가 된다.
		
		int sum = 0;
		
		for(int i = 0; i< intList.size(); i++) {
			// i번째 위치의 값을 읽어서 sum변수에 누적하라
			sum += intList.get(i);
			// intList[i]
		}
		
		System.out.println("합계:" + sum);
	}
}
