package com.sh.collection.map.book;

import java.util.Scanner;

import com.sh.collection.list.book.model.vo.Book;
import com.sh.collection.map.book.Controller.MapBookManager;

public class TestBookManager {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TestBookManager tbm = new TestBookManager();
		tbm.menu();
	}
	
	public static void menu(){
		MapBookManager bm = new MapBookManager();
		
		while(true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println();
			System.out.println("1. 새 도서 추가");	
			System.out.println("2. 도서정보 정렬후 출력");
			System.out.println("3. 도서 삭제");	
			System.out.println("4. 도서 검색출력");	
			System.out.println("5. 전체 출력");	
			System.out.println("6. 끝내기");
			System.out.println("=====================");
			System.out.print("메뉴를 선택하세요 : ");
			String choice = sc.nextLine();
			switch(choice) {
				case "1" : bm.putBook(inputBook()); System.out.println("정상적으로 추가됐습니다.");continue;
				case "2" : bm.printBookMap(bm.sortedBookMap()); continue;
				case "3" : bm.deleteBook(bm.searchBook(inputBookTitle())); System.out.println("정상적으로 삭제됐습니다."); continue;
				case "4" : bm.printBook(bm.searchBook(inputBookTitle())); continue;
				case "5" : bm.displayAll(); continue;
				case "6" : System.out.println("종료합니다."); return;
				default : System.out.println("잘못 입력하셨습니다."); continue;
		}
		}
		
	}
	
	public static Book inputBook() {
			System.out.print("도서번호를 입력해주세요 : ");
			String bNo =  sc.next();
			System.out.print("카테고리를 입력해주세요 (1.인문/2.자연과학/3.의료/4.기타) : ");
			int category = sc.nextInt();
			sc.nextLine();
			System.out.print("책 제목을 입력해주세요 : ");
			String title = sc.nextLine();
			System.out.print("저자를 입력해주세요 : ");
			String author = sc.nextLine();
			return new Book(bNo, category, title, author);
	}
	
	public static String inputBookTitle() {
		System.out.print("도서명을 입력해주세요 : ");
		String title = sc.nextLine();
		return title;
	}


}
