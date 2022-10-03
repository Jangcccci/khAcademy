package com.exception.charcheck;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Run run = new Run();

		run.test1();
	}

	public void test1() {
		
		Scanner sc = new Scanner(System.in);

		try {
			// 키보드 입력값 받기
			System.out.print("문자열을 입력하세요 : ");
			int result = new CharacterProcess().countAlpha(sc.nextLine());
			System.out.printf("입력된 영문자의 갯수는 %d입니다.", result);
		} catch (CharCheckException e) {
			System.err.println("체크할 문자열 안에 공백 포함할 수 없습니다.");
		}
	}
}
