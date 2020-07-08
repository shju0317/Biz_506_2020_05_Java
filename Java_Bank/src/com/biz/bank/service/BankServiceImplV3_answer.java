package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import com.biz.bank.config.Position;
import com.biz.bank.domain.AccountVO;

/*
 * V3 업그레이드
 * 프로젝트가 시작될 때 balance.txt 파일을 읽어서 거래내역을 가져오고
 * 입출금 업무를 수행하면 입출금 항목을 계속 추가하고
 * 업무를 종료하면 추가된 입출금 항목을 다시 balance.txt 파일에
 * 추가하여 다음 프로젝트가 시작될 때 그 내용을 유지하도록 하자
 */

public class BankServiceImplV3_answer extends BankServiceImplV2{
	// V2를 상속바아서 bankList()만 이어받아 사용한다.
	// input(), output() method는 별도로 구현해보자
	

	FileWriter fileWriter = null;
	BufferedWriter bufferWriter = null;
	String bFileName = "";
	String reader = "";
	
	public BankServiceImplV3_answer() {
		bFileName = "src/com/biz/bank/exec/data/balance.txt";
		this.loadBalance();
	}
	
	protected void loadBalance() {
		
		// 새로운 계좌번호를 선택했을 때
		// 새로운 balance정보를 가져오기 위해서
		// 기존의 accList를 모두 제거하기
		accList.clear();

		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		
		try {
			fileReader = new FileReader(bFileName);
			buffer = new BufferedReader(fileReader);
			
			reader = "";
			while(true) {
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				
				String[] balances = reader.split(",");
				
				AccountVO accVO = new AccountVO();
				
				accVO.setDate(balances[Position.ACC_DATE]);
				accVO.setInput(Integer.valueOf(balances[Position.ACC_INPUT]));
				accVO.setOutput(Integer.valueOf(balances[Position.ACC_OUTPUT]));
				
				accList.add(accVO);
			}
			
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("계좌가 없으므로 새로운 계좌를 개설합니다 :)");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean inputBalance() {
		this.keyInput("INPUT");	
		saveBalance();	
		
		return true;
	}

	@Override
	public boolean outputBalance() {
		this.keyInput("OUTPUT");
		saveBalance();
		
		return true;
	}
	
	protected void saveBalance() {
		PrintStream outPut = null;
		
		try {
			outPut = new PrintStream(bFileName);
			
			int balance = 0;
			for(AccountVO accVO : accList) {
				balance += accVO.getInput();
				balance -= accVO.getOutput();
				
				// 거래일지ㅏ, 입금, 출급 잔액
				outPut.printf("%s,%d,%d,%d\n", accVO.getDate(), accVO.getInput(), accVO.getOutput(), balance);
			}
			
			outPut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
