package com.sh.test.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args){
		RandomTest rt = new RandomTest();
		
//		rt.rps();
		rt.randomNumber();
	}
	
	public void rps() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 선택하세요(1. 가위/2. 바위/3. 보) : ");
		int n = sc.nextInt();
		
		Random rnd = new Random();
		int i = rnd.nextInt(3) + 1;
		
		System.out.println("==========결과==========");
		System.out.printf("당신은 %d를 냈습니다.\n", n);
		System.out.printf("컴퓨터는 %d를 냈습니다.\n", i);
		System.out.println("======================");
		if(n == i) {
			System.out.println("당신은 비겼습니다.");
		}
		else if(n == 1 && i == 2) {
			System.out.println("당신은 졌습니다.ㅋ");
		}
		else if(n == 1 && i == 3) {
			System.out.println("당신이 이겼습니다. ㅠㅠ");
		}
		else if(n == 2 && i == 3) {
			System.out.println("당신은 졌습니다.ㅋ");
		}
		else if(n == 2 && i == 1) {
			System.out.println("당신이 이겼습니다. ㅠㅠ");
		}
		else if(n == 3 && i == 1) {
			System.out.println("당신은 졌습니다.ㅋ");
		}
		else if(n == 3 && i == 2) {
			System.out.println("당신이 이겼습니다. ㅠㅠ");
		}
		
		// ||로 이겼습니다. 비겼습니다. 졌습니다를 묶을 수 있다.
	}
	
	//if문의 실행줄이 한 줄일때 중괄호 생략가능	
	
	public void randomNumber() {
		Random rnd = new Random();
		
		int n1 = rnd.nextInt(10);
		System.out.println(n1);
		
		int n2 = rnd.nextInt(10) + 1;
		System.out.println(n2);
		
		int n3 = rnd.nextInt(16) + 20;
		System.out.println(n3);
		
		int n4 = rnd.nextInt(2);
		System.out.println(n4);
	}
}
