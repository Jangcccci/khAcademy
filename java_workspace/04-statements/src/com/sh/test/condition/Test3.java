package com.sh.test.condition;

import java.util.Scanner;

/**
 * [문제 3]
	- 클래스 : com.sh.test.condition.Test3.java
	- 메소드명 : public void test()

    정수 두개를 입력 받고, 연산자(+,-,*,/)를 입력받은 다음 계산한 뒤  결과를 출력하는 계산기 프로그램을 만들어보세요.      

    출력 예) 입력 5, 6, +
           5+6=11

    음수가 입력되거나 +,-,*,/ 이외의 문자가 입력되면 “잘못 입력 하셨습니다.  프로그램을 종료합니다.” 라는 문구가 출력되게 하세요.
 *
 */
public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int n1 = sc.nextInt();
		if(n1 < 0) {
			System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다.");
			return;//->이하는 실행하지 않고 호출부(main)로 돌아간다.	
			}
		System.out.print("두번째 정수를 입력하세요 : ");
		int n2 = sc.nextInt();
		if(n2 < 0) {
			System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다.");
			System.exit(0);//return으로 사용하면 더 좋을듯
			}
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		char op = sc.next().charAt(0);
//		if(!(op == '+' && op == '-' && op == '*' && op == '/'))
		if(op != '+' && op != '-' && op != '*' && op != '/') {
			System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
//		공백문자 ' ';는 스페이스바를 꼭 넣고 빈 문자열은 ""; 스페이스바 없이 해야한다.
		if(op == '+') {
			System.out.println(n1 + n2);
		}else if(op == '-') {
			System.out.println(n1 - n2);
		}else if(op == '*') {
			System.out.println(n1*n2);
		}else if(op == '/') {
			System.out.println(n1/n2);
		}
		
	}
	
	// ""+ a + b+ c + "=" -> a b c 가 int 나 char면 계산될 수 있으므로 앞에 ""문자열 공백을 붙인다.
	
}
