package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 && num < 101) {
			System.out.printf("입력 : %d\n", num);
			System.out.println(num % 2 == 0 ? "2의 배수입니다." : "2의 배수가 아닙니다.");
		}
		
	}
}
