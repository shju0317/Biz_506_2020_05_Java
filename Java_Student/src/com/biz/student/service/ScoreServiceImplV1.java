package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {
	List<StudentVO> studentList;
	List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void inputStudent() {
		String studentFile = "src/com/biz/student/exec/student.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);

			String reader = "";
			while (true) {
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				// System.out.println(reader);

				// 읽어들인 라인을 분해하여 학생정보로 변환
				String[] students = reader.split(":");

				StudentVO studentVO = new StudentVO();
				studentVO.setNum(students[SplitPos.STUDENT.ST_NUM]);
				studentVO.setName(students[SplitPos.STUDENT.ST_NAME]);
				studentVO.setGrade(Integer.valueOf(students[SplitPos.STUDENT.ST_GRADE]));
				studentVO.setDept(students[SplitPos.STUDENT.ST_DEPT]);

				studentList.add(studentVO);

			}

			// 파일을 읽기, 쓰기로 열었으면 모두 닫아서(close) 종료해야 한다.
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void intputScore() {
		String scoreFile = "src/com/biz/student/exec/score.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);

			String reader = "";
			while (true) {
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				// System.out.println(reader);

				String[] students = reader.split(":");
				// 00001:97:76:88:261:087.00
				ScoreVO scoreVO = new ScoreVO();
				scoreVO.setNum(students[SplitPos.SCORE.SC_NUM]);
				scoreVO.setKor(Integer.valueOf(students[SplitPos.SCORE.SC_KOR]));
				scoreVO.setEng(Integer.valueOf(students[SplitPos.SCORE.SC_ENG]));
				scoreVO.setMath(Integer.valueOf(students[SplitPos.SCORE.SC_MATH]));
				scoreVO.setSum(Integer.valueOf(students[SplitPos.SCORE.SC_SUM]));
				scoreVO.setAvg(Float.valueOf(students[SplitPos.SCORE.SC_AVG]));

				scoreList.add(scoreVO);

			}

			// 파일을 읽기, 쓰기로 열었으면 모두 닫아서(close) 종료해야 한다.
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void calcSum() {
//		int size = scoreList.size();		
//		for(int i = 0 ; i < size; i++) {
//		ScoreVO sVO = scoreList.get(i);
		for(ScoreVO sVO : scoreList) {
			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();
			
//			if(sum != sVO.getSum()) {
//				System.out.println("총점 오류!");
//				break;
//			}
			
			sVO.setSum(sum);
		}
	}

	@Override
	public void calcAvg() {
		int size = scoreList.size();
		for(int i = 0 ; i < size; i++) {
			ScoreVO sVO = scoreList.get(i);
	
			float sum = (float)sVO.getSum();
			float avg = 0;
			avg = sum / 3;
			
//			if(avg != sVO.getAvg()) {
//				System.out.println("평균 오류!");
//				break;
//			}
			sVO.setAvg(avg);
//			float roundAvg = Math.round((avg*1000)/1000.0);
//			sVO.setAvg(roundAvg);
		}
	}

	// [ data의 join ] 
	// scoreList, studentList를 join해서 데이터를 출력하는 코드
	@Override
	public void scoreList() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("성적 일람표");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------------");
		
		int scoreSize = scoreList.size();
		int studentSize = studentList.size();
		
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			
			// score의 학번으로 studentList에서 찾기
			for (int j = 0; j < studentSize; j++) {
				StudentVO studentVO = studentList.get(j);

				// 학번이 같은 학생의 정보를 찾았으면
				if (scoreVO.getNum().equals(studentVO.getNum())) {
					listWithName(scoreVO, studentVO);
					break;
				}
			}
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void listWithName(ScoreVO scoreVO, StudentVO studentVO) {
		System.out.print(scoreVO.getNum() + "\t");
		System.out.print(studentVO.getName() + "\t");
		System.out.print(scoreVO.getKor() + "\t");
		System.out.print(scoreVO.getEng() + "\t");
		System.out.print(scoreVO.getMath() + "\t");
		System.out.print(scoreVO.getSum() + "\t");
		System.out.println(String.format("%5.2f", scoreVO.getAvg()));
	}

}
