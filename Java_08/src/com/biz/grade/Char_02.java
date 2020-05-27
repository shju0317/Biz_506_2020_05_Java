package com.biz.grade;

public class Char_02 {
	public static void main(String[] args) {
		int intCnt = 0;

		for (int i = '가'; i < '힣'; i++) {
			System.out.printf("%c : %d\t", i, i);

			if (++intCnt % 12 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("▶ 총개수: " + intCnt);
	}
}
