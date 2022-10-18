package com.sh.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.sh.io.test4.model.vo.Book;

/**
 *     * Field
    ~ sc:Scanner    //초기화 객체 생성함

    * default 생성자

    * Method
    + fileSave():void
    >> 구현내용
        1. Book 객체 배열 선언, 5개 초기화함 //샘플데이터 임의 작성
        2. "books.dat" 파일에 객체 기록 저장함
        3. try with resource 문 사용할 것
        4. "books.dat 에 저장 완료!" 출력

    + fileRead():void
    >>구현내용
        1. Book 객체 배열 선언
        2. "books.dat" 파일에서 데이터 읽어서 배열에 저장함
        3. 객체 정보를 화면에 출력함
        4. try with resource 문 사용할 것
        5. "books.dat 읽기 완료!" 출력
 * @author jangcccci
 *
 */
public class BookManager {

	Scanner sc = new Scanner(System.in);

	public BookManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void fileSave() {
		// Book 객체 배열 선언, 5개 초기화함 //샘플데이터 임의 작성
		Book[] books = {
				new Book("코스모스", "칼세이건", 18000, LocalDate.of(2010, 1, 20)),
				new Book("바깥은 여름", "김애란", 12000, LocalDate.of(2017, 6, 28)),
				new Book("잊기 좋은 이름", "김애란", 11000, LocalDate.of(2019, 6, 27)),
				new Book("비행운", "김애란", 10000, LocalDate.of(2012, 7, 19)),
				new Book("두근두근 내 인생", "김애란", 13000, LocalDate.of(2011, 6, 20)),				
		};
		// "books.dat" 파일에 객체 기록 저장함
		File bookFile = new File("books.dat");
		// try with resource 문 사용할 것
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(bookFile)));) {
			oos.writeObject(books);
			// "books.dat 에 저장 완료!" 출력
			System.out.println("books.dat 에 저장 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		// "books.dat" 파일에서 데이터 읽어서 배열에 저장함
		File bookFile = new File("books.dat");
		// try with resource 문 사용할 것
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(bookFile)));) {
			// Book 객체 배열 선언
			Book[] books = (Book[]) ois.readObject();
			// 객체 정보를 화면에 출력함
			for(Book book : books) {
				if(book != null) {
					System.out.println(book);
				}
			}
			// "books.dat 읽기 완료!" 출력
			System.out.println("books.dat 읽기 완료!");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}
