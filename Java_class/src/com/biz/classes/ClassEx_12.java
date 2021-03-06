package com.biz.classes;

import com.biz.classes.model.BankVO;
import com.biz.classes.service.BankService;
import com.biz.classes.service.BankServiceV2;

public class ClassEx_12 {
	public static void main(String[] args) {
		BankVO[] bankList = new BankVO[5];
		
		bankList[0] = new BankVO();
		bankList[1] = new BankVO();
		bankList[2] = new BankVO();
		bankList[3] = new BankVO();
		bankList[4] = new BankVO();
	
		for(int i=0;i<bankList.length;i++) {
			bankList[i].setStrNum("001");
		}
		
		bankList[0].setStrDate("2020-05-01");
		bankList[1].setStrDate("2020-05-02");
		bankList[2].setStrDate("2020-05-03");
		bankList[3].setStrDate("2020-05-04");
		bankList[4].setStrDate("2020-05-05");
		
		bankList[0].setIntInput(5000);
		bankList[2].setIntInput(5000);
		
		bankList[1].setIntOutput(1000);
		bankList[3].setIntOutput(1000);
		bankList[4].setIntOutput(1000);
		
		BankService bankService = new BankService();
		bankService.bankList(bankList);
		
		//BankServiceV2 클래스를 사용해서
		// bankServiceV2라는 변수를 선언
		// bankServiceV2 변수를 '객체(object), 인스턴스(instance)'라고 한다.
		BankServiceV2 bankServiceV2 = new BankServiceV2();
	}
}
