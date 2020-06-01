package com.biz.classes.service;

import com.biz.classes.model.BankVO;

public class BankService {

	LineService line = new LineService();
	String d_line = line.do_line(30);
	
	public void bankList(BankVO[] bankList) {
		
	}
}
