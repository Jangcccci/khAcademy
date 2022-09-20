package com.sh.java;

public class PrintStudy {

	public static void main(String[] args) {
		PrintStudy printStudy = new PrintStudy();
		printStudy.testPrint();
	}
	
	public void testPrint() {
		System.out.println("ㅋ");
		System.out.print("ㅋ");//내용출력 후 줄바꿈 없음 
		System.out.println("ㅋ");//내용출력 후 줄바꿈 있음
		/**
		 * escaping 문자
		 * -\ + 문자 조합으로 특수기능 수행
		 * -\n 줄바꿈
		 * -\t 탭
		 * -\" 문자 그대로 쌍따옴표
		 * -\\ 문자 그대로 역슬래시
		 */
		System.out.print("ㅋ\n");//내용출력 후 줄바꿈 있음
		System.out.println("\"안녕\"");
		
		
	}
}
