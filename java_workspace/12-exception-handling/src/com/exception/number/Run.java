package com.exception.number;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Run run = new Run();
		
		run.test();
	}
	
	public void test(){
		Scanner sc = new Scanner(System.in);
		
		try {
			//정수 입력받기
			System.out.print("첫번째 정수를 입력하세요 : ");
			int a = sc.nextInt();
			System.out.print("두번째 정수를 입력하세요 : ");
			int b = sc.nextInt();
			boolean tf = new NumberProcess().checkDouble(a, b);
			//출력
			if(tf == true) {
				System.out.printf("%d는 %d의 배수이다.", a, b);
			}else {
				System.out.printf("%d는 %d의 배수가 아닙니다.", a, b);
			}
		}catch(NumberRangeException e) {
			System.err.println("1부터 100사이의 값이 아닙니다.");
		}
	}
}
