package ncs.tes8;

import ncs.test7.Book;

public class BookUpdater {

	private Book bookData;

	public BookUpdater() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookUpdater(Book bookData) {
		super();
		this.bookData = bookData;
	}
	
	public Book getBookData() {
		return bookData;
	}
	
	public void updataBookPrice() {
		bookData.setBookPrice(bookData.getBookPrice() - (bookData.getBookPrice() * (bookData.getBookDiscountRate()/100)));
	}

	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}
	
	
	
}
