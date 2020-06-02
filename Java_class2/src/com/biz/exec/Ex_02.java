package com.biz.exec;

import com.biz.model.AddressVO;
import com.biz.service.AddrServiceV1;

public class Ex_02 {
	public static void main(String[] args) {
		AddressVO[] address = new AddressVO[5];
		
//		addrList[0] = new AddressVO();
//		addrList[1] = new AddressVO();
//		addrList[2] = new AddressVO();
//		addrList[3] = new AddressVO();
//		addrList[4] = new AddressVO();
		
		for(int i= 0;i<address.length;i++) {
			address[i] = new AddressVO();
		}
		
		address[0].setName("강아지");
		address[1].setName("고양이");
		address[2].setName("송아지");
		address[3].setName("호랑이");
		address[4].setName("사자");
		
		address[0].setAddr("서울시");
		address[1].setAddr("여수시");
		address[2].setAddr("광주시");
		address[3].setAddr("순천시");
		address[4].setAddr("광양시");
		
		address[0].setTel("010-1111");
		address[1].setTel("010-2222");
		address[2].setTel("010-3333");
		address[3].setTel("010-4444");
		address[4].setTel("010-5555");
		
		address[0].setAge(25);
		address[1].setAge(27);
		address[2].setAge(28);
		address[3].setAge(20);
		address[4].setAge(30);
		
		AddrServiceV1 addrServiceV1 = new AddrServiceV1();
		
		// 배열을 매개변수를 통해 method에게 전달할 때는 이름만 붙여주면 된다.
		addrServiceV1.addrList(address);
		 
	}
}
