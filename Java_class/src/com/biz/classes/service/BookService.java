package com.biz.classes.service;

import com.biz.classes.model.BookVO;

public class BookService {
	
	LineService lineService = new LineService();
	String d_line = lineService.do_line(55);
	String s_line = lineService.single(55);

	public void bookList(BookVO[] bookList) {
		System.out.println(d_line);
		System.out.println("\t\t\t도서목록");
		System.out.println(s_line);
		System.out.println("ISBN\t도서명\t\t저자\t출판사\t\t가격");
		System.out.println(s_line);
		
		// 배열.length : 배열의 개수를 알려주는 변수
		for (int i = 0; i < bookList.length; i++) {
			System.out.printf("%s\t%s\t%s\t%s\t%d\n", bookList[i].isbn, bookList[i].title, bookList[i].author,
					bookList[i].comp, bookList[i].price);
		}
		
		System.out.println(d_line);
	}

	public void bookInfo(BookVO book) {
		System.out.printf("ISBN: %s\n", book.isbn);
		System.out.printf("도서명: %s\n", book.title);
		System.out.printf("저자: %s\n", book.author);
		System.out.printf("출판사: %s\n", book.comp);
		System.out.printf("가격: %d\n", book.price);
	}
}
