package com.sh.oop.book.contriller;

import com.sh.oop.book.model.vo.Book;

public class TestBook {

	public static void main(String[] args) {
		Book book1 = new Book("비행운", "김애란", 10800);
		Book book2 = new Book("채식주의자", "한강", 13500);
		
		System.out.println(book1);
		System.out.println(book2.toString());
		System.out.println(book1.equals(book2));
		Book book3 = book1.clone();
		System.out.println(book1 == book3);
		System.out.println(book1.equals(book3));
		
	}
}
