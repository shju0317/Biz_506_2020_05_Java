package com.biz.addr.exec;

import com.biz.addr.service.AddrService03;

public class AddrEx_02 {
	public static void main(String[] args) {
		AddrService03 addrService = new AddrService03();
		
		// inputAddr() method를 for를 이용하여 5번 호출하면서
		// 5명의 주소를 입력받기
		for(int i = 0; i<5; i++) {
			System.out.println("=========================");
			System.out.println((i+1) + " 번째 주소록");
			System.out.println("-------------------------");
			addrService.inputAddr();
		}
	}
}
