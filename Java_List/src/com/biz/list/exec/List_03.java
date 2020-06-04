package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_03 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		
		Random rnd = new Random();
		
		for(int i = 0 ;i<100;i++) {
			intList.add(rnd.nextInt(100)+1);
		}
		
		int cnt = 0;
		
		for(int i = 0 ;i<100;i++) {
			int num1 = intList.get(i);
				
			if(num1 % 2 == 0) {
				cnt++;
				System.out.printf("%d\t",num1);
			
				if(cnt % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n짝수 개수:"+cnt);
	}
}
