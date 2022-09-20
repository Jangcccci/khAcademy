package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int mul;
		if(num1 > 0 && num1 < 10 && num2 > 0 && num2 < 10) {
			System.out.println(num1*num2 > 9 ? "두자리 수 입니다." : "한자리 수 입니다.");
		}else {
			System.out.println("한자리 양의 정수를 입력해주세요.");
		}
	}
}
