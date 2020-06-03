package com.biz.score.exec;

import java.util.Random;

import com.biz.score.service.ScoreServiceV1;
import com.biz.score.service.ScoreServiceV2;
import com.biz.score.vo.ScoreVO;

public class ScoreEx_02 {
	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 90;
		num[1] = 80;
		num[2] = 70;
		
		System.out.printf("%d\t%d\t%d\n",num[0],num[1],num[2]);
		
		/*
		 * 코드 실행이 진행되는 동안에 배열의 개수는
		 * 일반적으로 변경하지 않는다.(못하는 것은 아님)
		 * 배열의 개 수를 변경하게 되면
		 * 기존의 배열은 사라지고 새로운 개수의 배열이 만들어진다.
		 * => ArrayList (배열보다 ArrayList 많이 사용)
		 */
		num = new int[5]; // 개수부족으로 공간 늘림
		
		System.out.printf("%d\t%d\t%d\n",num[0],num[1],num[2]); // 원래 있던 내용 사라짐
	}
}
