package com.sh.collection.map.book.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sh.collection.list.book.model.compare.AscCategory;
import com.sh.collection.list.book.model.vo.Book;

public class MapBookManager {

	private Map<String, Book> booksMap = new HashMap<>();

	public MapBookManager() {
		super();
		Map<String, Book> booksMap = new HashMap<>();
	}

	public MapBookManager(Map<String, Book> booksMap) {
		super();
		this.booksMap = booksMap;
	}
	
	/**
	 * //Method
    + putBook(book:Book) : void    //맵에 객체 추가, 도서번호를 키로 사용함
    + deleteBook(key:String) : void    //맵에서 객체 제거
    + searchBook(String title) : String    : entrySet() 사용
        //도서명이 일치하는 객체의 도서번호를 리턴
        //도서명이 객체가 맵에 없으면, null 리턴함
    + displayAll():void        //맵정보 모두 출력 : keySet() 사용
    
	 */
	
	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}
	
	public void deleteBook(String key) {
		booksMap.remove(key);
	}
	
	public String searchBook(String title) {
		Set<Map.Entry<String, Book>> entrySet = booksMap.entrySet();
		Iterator<Map.Entry<String, Book>> iter = entrySet.iterator();
		String bNo = null;
		while(iter.hasNext()) {
			Map.Entry<String, Book> entry = iter.next();
			if(title.equals(entry.getValue().getTitle())) 
				bNo = entry.getValue().getbNo();
		}
		return bNo != null ? bNo : null; 
	}
	
	public void displayAll() {
		Set<String> keySet = booksMap.keySet();
		for(String key : keySet) {
			Book value = booksMap.get(key);
			System.out.println("key = " + key + " value = " + value);
		}
	}
	
	/**
	 * + sortedBookMap():Book[]
        // 해당 도서명순으로 오름차순정렬해서 객체배열 리턴함
	 */
	
	public Book[] sortedBookMap() {
		Book[] books = new Book[booksMap.size()];
		Set<Map.Entry<String, Book>> entrySet = booksMap.entrySet();
		List<Map.Entry<String, Book>> list = new ArrayList<>(entrySet);
		List<Book> booklist = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			booklist.add(list.get(i).getValue());
		}
		
		
		for(int i = 0; i < books.length; i++) {
			books[i] = booklist.get(i);
		}
		
		return books;
	}
	
	public void printBookMap(Book[] br) {
		for(Book book : br) {
			System.out.println(book);
		}
	}
	
	public void printBook(String key) {
		System.out.println(booksMap.get(key));
	}
}
