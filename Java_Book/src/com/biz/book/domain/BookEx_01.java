package com.biz.book.domain;
import com.biz.book.service.BookServiceImplV1;

public class BookEx_01 {
	public static void main(String[] args) {
		BookServiceImplV1 bookService = new BookServiceImplV1();
		
		while(true) {
			if(!bookService.inputBook()) {
				break;
			}
		}
		bookService.booklist();
		System.out.println("도서리스트를 출력했습니다 :)");
	}
}
