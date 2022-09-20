package com.sh.test.condition;

import java.util.Scanner;

public class CharTest {
	
	/**
	 * 패키지 com.sh.test.condition.CharTest

	사용자에게 입력받은 문자하나를 문자타입에 따라 구분해 출력하세요.
	 * 입력하신 문자 1 은/는  숫자입니다.
	 * 입력하신 문자 c 은/는  알파벳입니다.
	 * 입력하신 문자 z 은/는  알파벳입니다.
	 * 입력하신 문자 * 은/는  특수문자입니다.
	 */
	public static void main(String[] args) {
		CharTest ct = new CharTest();
		ct.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		int chint = ch;
		System.out.println(chint);
		
		if(chint >= 48 && chint <= 57) {
			System.out.printf("입력하신 %s는 숫자입니다.",ch);
		}
		else if((chint >= 65 && chint <= 90) || (chint >= 97 && chint <= 122)) {
			System.out.printf("입력하신 %s는 알파벳입니다.",ch);
		}
		else if((chint >= 33 && chint <= 47) || (chint >= 58 && chint <= 64) || (chint >= 91 && chint <= 96) || (chint >= 123 && chint <= 126)) {
			System.out.printf("입력하신 %s는 특수문자입니다.",ch);
		}else {System.out.println("한글은 입력하지마요 ㅠ");}
	}
}
