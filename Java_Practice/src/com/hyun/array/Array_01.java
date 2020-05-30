package com.hyun.array;

import java.util.Random;

public class Array_01 {
	public static void main(String[] args) {
		int stdCnt = 5;
		
		int[] intKors = new int[stdCnt];
		int[] intEngs = new int[stdCnt];
		int[] intMaths = new int[stdCnt];
		
		Random random = new Random();
		
		for(int i = 0; i<stdCnt;i++) {
			intKors[i] = random.nextInt(50)+51;
			intEngs[i] = random.nextInt(50)+51;
			intMaths[i] = random.nextInt(50)+51;
		}
		
		System.out.println("============================");
		System.out.println("학번\t국어\t수학\t영어\t");
		System.out.println("----------------------------");
		
		for(int i = 0; i<stdCnt; i++) {
			System.out.printf("%d\t%d\t%d\t%d\n",(i+1),intKors[i],intEngs[i],intMaths[i]);
		}
		
		System.out.println("============================");
	}
}
