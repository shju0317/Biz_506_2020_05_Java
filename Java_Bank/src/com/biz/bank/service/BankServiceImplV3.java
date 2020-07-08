package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.biz.bank.config.Position;
import com.biz.bank.domain.AccountVO;

/*
 * V3 업그레이드
 * 프로젝트가 시작될 때 balance.txt 파일을 읽어서 거래내역을 가져오고
 * 입출금 업무를 수행하면 입출금 항목을 계속 추가하고
 * 업무를 종료하면 추가된 입출금 항목을 다시 balance.txt 파일에
 * 추가하여 다음 프로젝트가 시작될 때 그 내용을 유지하도록 하자
 */

public class BankServiceImplV3 extends BankServiceImplV2{
	// V2를 상속바아서 bankList()만 이어받아 사용한다.
	// input(), output() method는 별도로 구현해보자
	

	FileWriter fileWriter = null;
	BufferedWriter bufferWriter = null;
	String bFileName = "";
	String reader = "";
	
	public BankServiceImplV3() {
		bFileName = "src/com/biz/bank/exec/data/balance.txt";
		this.loadBalance();
	}
	
	protected void loadBalance() {

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
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean inputBalance() {
		this.keyInput("INPUT");
		
		try {
			fileWriter = new FileWriter(bFileName);
			bufferWriter = new BufferedWriter(fileWriter);
			
			for(AccountVO accVO : accList) {
				String str = String.format("%s,%d,%d,%d", accVO.getDate(),accVO.getInput(),accVO.getOutput(),balance);
				bufferWriter.write(str + "\n");	
			}
			
			bufferWriter.flush();
			bufferWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return true;
	}

	@Override
	public boolean outputBalance() {
		this.keyInput("OUTPUT");
		
		try {
			fileWriter = new FileWriter(bFileName);
			bufferWriter = new BufferedWriter(fileWriter);
			
			for(AccountVO accVO : accList) {
				String str = accVO.getDate() + "," + accVO.getInput() + "," + accVO.getOutput() + "," + balance;
				//reader += "\n" + str;
				bufferWriter.write(str + "\n");	
			}
			
			bufferWriter.flush();
			bufferWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

}
