package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {
	List<StudentVO> studentList ;
	
	public ScoreServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
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
			while(true) {
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				//System.out.println(reader);
				
				// 읽어들인 라인을 분해하여 학생정보로 변환
				String[] students = reader.split(":");
				StudentVO sVO = new StudentVO();
				sVO.setNum(students[0]);
				sVO.setName(students[1]);
				sVO.setGrade(Integer.valueOf(students[2]));
				sVO.setDept(students[4]);
				
				studentList.add(sVO);
	}

	@Override
	public void intputScore() {

	}

	@Override
	public void calcSum() {
	}

	@Override
	public void calcAvg() {

	}

	@Override
	public void scoreList() {

	}

}
