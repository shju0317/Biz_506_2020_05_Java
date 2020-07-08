package com.biz.bank.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.domain.AccountVO;

public class BankServiceImplV1 implements BankService{

	protected List<AccountVO> accountList;
	AccountVO aVO;
	Scanner scan;
	
	int preInput = 100000;
	
	SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
	Date time;
	String currentTime = "";
	
	public BankServiceImplV1() {
		accountList = new ArrayList<AccountVO>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public boolean inputBalance() {
	    AccountVO aVO = new AccountVO();
	    aVO.setNum("001-0001");
		int intInput = 0;
		
		System.out.println("====================================");
		System.out.println("◆ 입금하기 ◆");
		System.out.println("====================================");
		System.out.print("입금할 금액>> ");
		
		String strInput = scan.nextLine();
			
		try {
			intInput = Integer.valueOf(strInput);
		} catch (Exception e) {
			System.out.println("[WARNING] '숫자'를 입력해주세요!");
			return true;
		}
		aVO.setInput(intInput);
		
		//preInput = aVO.getInput();
		preInput += intInput;
		
		time = new Date();
		currentTime = format.format(time);
		aVO.setDate(currentTime);
		
		accountList.add(aVO);
		
		System.out.println("현재 잔액은 " + preInput + "입니다 :)");
		return true;
	}

	@Override
	public boolean outputBalance() {
		AccountVO aVO = new AccountVO();
	    aVO.setNum("001-0001");
		int intOutput = 0;
		
		System.out.println("====================================");
		System.out.println("◆ 출금하기 ◆");
		System.out.println("====================================");
		System.out.print("출금할 금액>> ");
		
		String strOutput = scan.nextLine();
		
		try {
			intOutput = Integer.valueOf(strOutput);
		} catch (Exception e) {
			System.out.println("[WARNING] '숫자'를 입력해주세요!");
			return true;
		}
		
//		preInput = aVO.getInput();
		
		if(intOutput < 0 || intOutput > preInput) {
			System.out.println("[WARNING] 출금금액을 다시 입력해주세요!");
			return true;
		}
		aVO.setOutput(intOutput);
		
		preInput -= intOutput;
//		aVO.setInput(preInput);
		
		time = new Date();
		currentTime = format.format(time);
		aVO.setDate(currentTime);
		
		accountList.add(aVO);
		
		System.out.println("현재 잔액은 " + preInput + "입니다 :)");
		
		return true;
	}

	@Override
	public void listBalance() {
		System.out.println();
		System.out.println("======================================================================");
		System.out.println("◆ 입출금 리스트 ◆");
		System.out.println("======================================================================");
		System.out.println("계좌번호\t\t날짜\t\t입금\t\t출금");
		System.out.println("----------------------------------------------------------------------");
		
		for(AccountVO aVO : accountList) {
			System.out.printf("%s\t%s\t%d\t\t%d\n", aVO.getNum(), aVO.getDate(), aVO.getInput(), aVO.getOutput());
		}
		
		System.out.println("======================================================================");
	}

}
