package sh.java.condition;

import java.util.Scanner;

/**
 * if 조건문
 * - if문
 * - if - else문
 * - if else if문 : 조건식이 여러개인 경우
 * 
 * 
 */
public class IfStudy {

	public static void main(String[] args) {
		IfStudy study = new IfStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();
	}
	
	/**
	 * 중첩된 if문
	 * 
	 * A+ : 95 ~ 100
	 * A : 90 ~ 94
	 * B+ : 85 ~ 89
	 * B : 80~84
	 * C+ : 75~79
	 * C : 70~74
	 * D+ : 65~69
	 * D : 60 ~ 64
	 * F : ~59
	 */
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 (0 ~ 100): ");
		int score = sc.nextInt();
		String grade = " ";
		
		if(score >= 90) {
			grade = "A";
			if(score >= 95) {
				grade += "+";
			}
		}
		else if(score >= 80) {
			grade = "B";
			if(score >= 85) {
				grade += "+";
			}
		}
		else if(score >= 70) {
			grade = "C";
			if(score >= 75) {
				grade += "+";
			}
		}
		else if(score >= 60) {
			grade = "D";
			if(score >= 65) {
				grade += "+";
			}
		}
		else{
			grade = ""
					+ "F";
		}
		
		System.out.printf("당신의 학점은 %s입니다.\n", grade);
	}
	
	/**
	 * @실습문제 : 나이를 입력받고 해당하는 키워드를 출력
	 * - 70이상 : 노인
	 * - 40이상 : 중년
	 * - 20이상 : 젊은이
	 * - 14이상 : 청소
	 * - 어린이
	 * 
	 *  당신의 나이는 35세이고, 젊은이입니다.
	 */
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는? : ");
		int age = sc.nextInt();
		String grade = " ";
		
		if(age >= 70) {
			grade = "노인";
		}else if(age >= 40) {
			grade = "중년";
		}else if(age >= 20) {
			grade = "젊은이";
		}else if(age >= 14) {
			grade = "청소년";
		}else{
			grade = "어린이";
		}
		
		System.out.println("당신의 나이는 " + age + "세이고, " + grade + "입니다.");
		//역순으로도 가능하다.
	}
	
	/**
	 * 
	 * 여러개의 if문 
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 (0 ~ 100): ");
		int score = sc.nextInt();
		char grade = ' ';
		
		if(score <= 100 && score >= 90) {
			grade = 'A';
		}
		if(score < 90 && score >= 80) {
			grade = 'B';
		}
		if(score < 80 && score >= 70) {
			grade = 'C';
		}
		if(score < 70 && score >= 60) {
			grade = 'D';
		}
		if(score < 60) {
			grade = 'F';
		}
		
		System.out.println("당신의 학점은 [" + grade + "]입니다.");
	}
	
	/**
	 * if...else if문
	 * - 여러개의 조건식을 직렬화할 수 있다.
	 * - 조건식이 참인 첫번째 if만 실행하고 끝난다.
	 * 
	 * A : 90 ~ 100
	 * B : 80 ~ 89
	 * C : 70 ~ 79
	 * D : 60 ~ 69
	 * F : ~59
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 (0 ~ 100): ");
		int score = sc.nextInt();
		char grade = ' ';// char기본값. 공백문자
		
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		} // else절을 지우고 char grade = 'F';로 하면 결과는 같다.
		//순서를 꼬아놔도 &&을 사용하면 같은 값을 출력할 수 있다.
		
		System.out.println("당신의 학점은 [" + grade + "]입니다.");
	}
	
	/**
	 * if...else문
	 * - 조건식이 참이면 if블럭실행
	 * - 조건식이 거짓이면 else블럭실
	 */
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age >= 20) {
			System.out.println("주류 메뉴 구입 가능합니다.");
		}
		else {
			System.out.println("미성년자는 주류 구매 불가합니다.");
		}
	}
	/**
	 * if문
	 * - 조건식이 참이면 if블럭 실행
	 * - 조건식이 거짓이면 우회.
	 */
	public void test1() {
		int a = 10;
		if(a > 0) {
			System.out.println("if블럭이 실행됩니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age >= 20) {
			System.out.println("주류 메뉴 구입 가능합니다.");
		}
		
		System.out.println("test1 종료...");
	}
}
