package com.sh.test.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		t1.test();
	}
	
	/**
	 * [문제1]
클래스명: com.sh.test.nested.loop.Test1.java
메소드명: public void test()

    정수하나 입력받아, 그 수가 양수일때만 입력된 
    수를 행 수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
    출력예)
    정수 하나 입력 : 5
    1
    12
    123
    1234
    12345


    출력예)
    정수 하나 입력 : -5
    양수가 아닙니다.
	 */
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("양수가 아닙니다.");
		}else {
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < num; j++) {
					System.out.print(j + 1);
					if(i <= j) {
					break;
					}
				}
				System.out.println();
			}
		}
	}
}
