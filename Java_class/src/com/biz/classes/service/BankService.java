package com.biz.classes.service;

import com.biz.classes.model.BankVO;

public class BankService {

	LineService line = new LineService();
	String d_line = line.do_line(50);
	String s_line = line.single(50);
	
	public void bankList(BankVO[] bankList) {
		System.out.println(d_line);
		System.out.println("계좌번호\t날짜\t\t입금\t출금\t잔액");
		System.out.println(s_line);
		
		for(int i=0;i<bankList.length;i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n", bankList[i].getStrNum(),bankList[i].getStrDate(),
								bankList[i].getIntInput(), bankList[i].getIntOutput(), 
								valance(bankList[i].getIntInput(),bankList[i].getIntOutput()));
		}
		
		System.out.println(d_line);
	}
	
	int intValance = 0;
	
	public int valance(int num1, int num2) {
		intValance = intValance + num1 - num2;
		return intValance;
	}
}
