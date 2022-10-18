package com.sh.collection.list.book.model.compare;

import java.util.Comparator;

import com.sh.collection.list.book.model.vo.Book;

public class AscCategory implements Comparator<Book>{

	@Override
	public int compare(Book book1, Book book2) {
		return Integer.compare(book1.getCategory(), book2.getCategory());
	}

}
