package com.sh.java;

import java.util.Date;

import com.sh.java.other.Clock;
//import com.sh.java.other.*; -> 해당 패키지의 모든 클래스를 import한다.	

// 한 줄 주석(coment) 실행되지 않는 구문
/*
  여러 줄 주석
 */
public class HelloJava {

	/**
	 * javadoc 주석 - 프로그램 문서화 클래스나 메소드 레벨(위)에 작성
	 * 
	 * 메인메소드 
	 * - 자바프로그램의 시작과 끝 
	 * -JVM은 main메소드를 찾아 실행 
	 * -main 메소드안의 명령어를 모두 실행하면 프로그램 종료
	 * -프로그당 하나의 main메소드가 존재
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 객체 레시피 - 클래스를 기반으로 만들어져 메모리에 적재한 형태
		// 클래스명 변수명 = new 클래스명();
		HelloJava hello = new HelloJava();

		hello.foo();

		System.out.println(12345);

		hello.bar();

		// September 클래스의 today 호출하기
		// 1. 객체만들기
		September september = new September();
		// 변수명은 대문자로 시작하지 않는다(소문자로 시작하여 camel-casing을 적용한다)
		// 2. 메소드호출
		september.today();

		// Clock의 now 호출
		// 다른 패키지의 클래스를 사용하는 경우, import문을 반드시 작성 해야한다.
		Clock clock = new Clock();
		clock.now();
		
		//jdk api의 클래스를 가져와 사용하기
		Date date = new Date();
		System.out.println(date);
	}

	/**
	 * 메소드 
	 * -작업할 내용 
	 * -객체를 통해 호출되어야 한다.
	 */
	public void foo() {
		System.out.println("fooooooooooooo!");
	}

	public void bar() {
		System.out.println("baaaaaaaaar!");
	}
}
