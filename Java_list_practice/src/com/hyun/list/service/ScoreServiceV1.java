package com.hyun.list.service;

import com.hyun.list.model.ScoreVO;

public class ScoreServiceV1 {

	LineService line = new LineService();
	String d_line = line.do_line(50);
	String s_line = line.single(50);

	public void scoreList(ScoreVO[] scoreList) {
		int size = scoreList.length;

		System.out.println(d_line);
		System.out.printf("학번\t국어\t영어\t수학\n");
		System.out.println(s_line);

		for (int i = 0; i < size; i++) {
			System.out.printf("%d\t%d\t%d\t%d\n", scoreList[i].getIntNum(), scoreList[i].getIntKor(),
					scoreList[i].getIntEng(), scoreList[i].getIntMath());
		}

		System.out.println(d_line);
	}
}
