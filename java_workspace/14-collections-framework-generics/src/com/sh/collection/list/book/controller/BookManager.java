package com.sh.collection.list.book.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sh.collection.list.book.model.compare.AscCategory;
import com.sh.collection.list.book.model.vo.Book;

/**
 * 	//Field
	- bookList : ArrayList	

	//기본생성자 : bookList 객체 생성함
	//매개변수있는 생성자 : 다른 리스트를 전달받아. 
	//		bookList 객체의 초기값으로 사용함

	//Method
	+ addBook(book:Book) : void	 //리스트에 객체 추가
	+ deleteBook(int index) : void //리스트에서 객체 제거
	+ searchBook(String title) : int	
		//도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
		//도서명이 일치하는 객체가 리스트에 없으면, -1 리턴함
	+ printBook(index:int) : void //인덱스 위치의 객체의 정보를 출력함
	+ printAll():void		//목록정보 모두 출력
	+ sortedBookList():Book[]
		// 해당 카테고리순 오름차순정렬해서 객체배열 리턴함
	+ printBookList(Book[] br) : void
		//객체 배열 출력, for each 문 사용
 *
 */
public class BookManager {

	private ArrayList<Book> bookList;

	public BookManager(ArrayList<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public BookManager() {
		super();
		bookList = new ArrayList<Book>();
		// TODO Auto-generated constructor stub
	}
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public void deleteBook(int index) {
		bookList.remove(index);
	}
	
	public int searchBook(String title) {
		int index = 0;
		for(Book book : bookList) {
			if(book.getTitle().equals(title)) {
				index =  bookList.indexOf(book);
			}
		}
		return index;
	}
	
	public void printBook(int index) {
		System.out.println(bookList.get(index));
	}
	
	public void printAll() {
		Iterator<Book> iter = bookList.iterator();
		while(iter.hasNext()) {
			Book book = iter.next();
			System.out.println(book);
		}
	}
	
	public Book[] sortedBookList() {
		Book[] books = new Book[bookList.size()];
		bookList.sort(null);
		
		for(int i = 0; i < bookList.size(); i++) {
			books[i] = bookList.get(i);
		}
//		== bookList.toArray(books);
		
		// 리스트로 복제하는 경우
//		List<Book> copylist1 = new ArrayList<>(bookList);
//		List<Book> copyList2 = (List<Book>) bookList.clone();
		return books;
	}
	
	public void printBookList(Book[] br) {
		for(Book book : br) {
			System.out.println(book);
		}
	}
}
