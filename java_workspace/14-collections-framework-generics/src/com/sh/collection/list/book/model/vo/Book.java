package com.sh.collection.list.book.model.vo;

import java.util.Objects;

/**
 * //Field
	- bNo : String	//도서번호
	- category : int   //도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
	- title : String	//책제목
	- author : String	//저자

	//기본생성자, 매개변수 있는 생성자, getters and setters 작성함
	//toString() 오버라이딩함
 *
 */
public class Book implements Comparable<Book>{

	private String bNo;
	private int category;
	private String title;
	private String author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bNo, int category, String title, String author) {
		super();
		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bNo=" + bNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(o.title);
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bNo, category, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bNo, other.bNo) && category == other.category
				&& Objects.equals(title, other.title);
	}
	
	 
}
