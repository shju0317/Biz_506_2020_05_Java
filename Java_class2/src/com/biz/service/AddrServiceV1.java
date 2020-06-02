package com.biz.service;

import com.biz.model.AddressVO;

public class AddrServiceV1 {
	
	LineService lineService = new LineService();
	String d_line = lineService.do_line(35);
	String s_line = lineService.single(35);
	
	public void addrList(AddressVO[] address) {
		
		System.out.println(d_line);
		System.out.println("\t     <주소록>");
		System.out.println(s_line);
		System.out.println("이름\t주소\t나이\t번호");
		System.out.println(s_line);
		
		for (int i = 0; i < address.length; i++) {
			System.out.printf("%s\t%s\t%d\t%s\n", address[i].getName(), address[i].getAddr(), address[i].getAge(),
					address[i].getTel());
		}
		System.out.println(d_line);
	}
}
