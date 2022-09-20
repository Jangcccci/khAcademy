package com.sh.test.condition;

import java.util.Scanner;

/**
 * [문제 10]
	- 클래스 : com.sh.test.condition.Test10.java
	- 메소드명 : public void test()

    사용자로부터 점수를 입력 받고 등급을 출력하는 프로그램을 작성하시오.
         
    100~90은 수,
    89~80는 우,
    79~70은 미,
    69~60은 양,
    나머지는 가로 처리하세요.

    예 )점수입력 : 95 
        95점은  수입니다.
 *
 */
public class Test10 {

	public static void main(String[] args) {
		Test10 t10 = new Test10();
		t10.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score1 = sc.nextInt();
		char grade = ' ';
		
		switch(score1/10) {
		case 10 : 
		case 9 : grade = '수'; break;
		case 8 : grade = '우'; break;
		case 7 : grade = '미'; break;
		case 6 : grade = '양'; break;
		default : grade = '가';
		}
		System.out.printf("%d점은 %s입니다.",score1,grade);
	}
}
