package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {
	List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
	ScoreVO sVO = new ScoreVO();

	int sum = 0;
	int avg = 0;
	int scoreSize = 3;

	public void stSum(ScoreVO sVO) {
		this.sVO = sVO;
		
		sVO.setStSum(sVO.getKor() + sVO.getEng() + sVO.getMath());
	}

	public void stAvg() {
		sum = sVO.getStSum();
		sVO.setStAvg(sum / scoreSize);
	}
}
