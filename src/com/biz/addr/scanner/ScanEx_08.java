package com.biz.addr.scanner;

import java.util.Scanner;

public class ScanEx_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("자바 메뉴 시스템");
		System.out.println("=============================================");
		System.out.println("1.학생정보 입력처리");
		System.out.println("2.성적입력 처리"); 
		System.out.println("3.성적정보 출력");
		System.out.println("-1. 종료");
		System.out.println("---------------------------------------------");
		System.out.print("업무선택 >> ");
		
		String strMenu = scan.nextLine();
		int intMenu = 0;
		
		// exception handling
		// exception이 발생할 가능성이 조금이라도 있으면
		// try-catch문을 사용하여 handling(처리)를 수행하여
		// 사용자가 어플을 사용하는 데 혼란, 어려움을 겪지 않도록 해주어야 한다.
		try {
			intMenu = Integer.valueOf(strMenu);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력한 값: " + strMenu);
			System.out.println("업무선택은 숫자 1 ~ 3 또는 -1만 가능합니다!");
			return; // exception이 발생했으니 더이상 다음으로 코드진행을 하지말고 종료하라
		}
		
		if(intMenu == 1) {
			System.out.println("학생정보 입력처리");
		}else if(intMenu == 2) {
			System.out.println("성적입력 처리");
		}else if(intMenu == 3) {
			System.out.println("성적정보 출력");
		}else if(intMenu == -1) {
			System.out.println("퇴근이당~~~!!");
		}else {
			System.out.println("번호 다시 입력해쥬ㅠㅠ");
		}
	}
}
