package com.sh.oop.book.conrtoller;

import com.sh.oop.book.model.Book;

public class TestBook {
	public static void main(String[] args) {
		Book book = new Book();
		Book book2 = new Book("뇌를 자극하는 JAVA", 20000, 0.2, "김윤영");
		
		book.bookInformation();
		book2.bookInformation();
		
		book.setTitle("자바의 정석");
		book.setPrice(35000);
		book.setDiscountRate(0.1);
		book.setAuthor("윤상섭");
	
		book.bookInformation();
		
		System.out.println("<출력결과>");
		System.out.printf("도서명 : %s\n", book.getTitle());
		System.out.printf("할인된 가격 : %.0f\n", book.getPrice() - (book.getPrice()*book.getDiscountRate()));
		System.out.printf("도서명 : %s\n", book2.getTitle());
		System.out.printf("할인된 가격 : %.0f\n", book2.getPrice() - (book2.getPrice()*book2.getDiscountRate()));
		
	}
}
