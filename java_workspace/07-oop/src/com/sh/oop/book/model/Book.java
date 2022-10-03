package com.sh.oop.book.model;

public class Book {

	/**
	 * - 멤버변수 : 반드시 캡슐화를 적용할 것
    - title:String    //책제목
    - price:int    //가격
    - discountRate:double    //할인율
    - author:String    //저자명

 - 기본(default) 생성자와 4개의 필드를 초기화하는 매개변수가 있는 생성자 작성함
 - 출력용 메소드 작성함 : 객체가 가진 필드값 화면 출력 처리
    public void bookInfomation()
	 */
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getDiscountRate() {
		return this.discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public Book(){}
	public Book(String title, int price, double discount, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discount;
		this.author = author;
	}
	
	public void bookInformation() {
		System.out.printf("%s, %d, %.1f, %s\n", title, price, discountRate, author);
	}
}
