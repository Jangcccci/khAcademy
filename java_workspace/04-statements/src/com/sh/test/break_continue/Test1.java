package com.sh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 test = new Test1();
//		test.test1();
		test.test2();
	}
	
	/**
	 * 1) 정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt();
		int sum = 1;
		for(int j = 1; j <= i; j++) {
			if(j % 2 == 0)
				continue;
			sum *= j;
		}
		System.out.println(sum);
	}
	
	/**
	 * 2) 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
         Tip. 큰수/작은수에 해당하는 변수를 사용할 것.
     
         결과:
         정수를 하나 입력하세요. => 100
         다른 정수를 하나 입력하세요. => 1
         ====================
         1부터 100까지의 홀수의 합은 2500입니다.
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int i = sc.nextInt();
		System.out.print("정수2 : ");
		int j = sc.nextInt();
		int sum = 0;
		
		if(i < j) {
			
			for(int i2 = i; i2 <= j; i2++) {
				if(i2 % 2 == 0)
					continue;
				sum += i2;
			}//for
		}//if
		else if(i > j){
			
			for(int j2 = j; j2 <= i; j2++) {
				if(j2 % 2 == 0)
					continue;
				sum += j2;
			}//for
			
		}//elseif
		System.out.println("결과 : ");
		System.out.printf("정수1 => %d\n", i);
		System.out.printf("정수2 => %d\n", j);
		System.out.println("============");
		System.out.printf("%d부터 %d까지의 홀수의 합은 %d입니다.", i , j , sum);
		
	}//test2
				
	
}
	

