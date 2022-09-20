package sh.java.basic.method;

import java.util.Scanner;

public class MethodStudy {

	public static void main(String[] args) {
		
		MethodStudy study = new MethodStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
//		printPerson(name, age);
	}
	
	/**
	 * 두 정수를 입력받고 합을 출력하는 메소드
	 */
	
	/**
	 * @실습문제
	 * 친구1 이름> 홍길동
	 * 친구2 이름> 신사임당
	 * 친구3 이름> 이순신
	 * -------------------
	 * 친구목록 - 홍길동, 신사임당, 이순
	 */
	
	public void test4() {

		int i = 1;
		
		String a = friendName(i++);
		String b = friendName(i++);
		String c = friendName(i++);
		
		System.out.printf("친구목록 - %s , %s  , %s  입니다.", a, b, c);
		
	}
	
	public String friendName(int i) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("친구이름%d> ", i);
		return sc.nextLine();
	}
	
	
	public void test3() {
		int a = inputNumber(1);
		int b = inputNumber(2);
		
		System.out.printf("두 수의 합은 " + (a + b) + "입니다.");
		return;// 모든 void메소드의 마지막엔 return; 구문이 생략되어 있다.
	}
	
	
	public int inputNumber(int n) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("정수%d> ", n);
		return sc.nextInt(); // return value
	}
	
	public void test1() {
		// 데이터 할당부분
		String name = "홍길동";
		int age = 33;
		
		// 데이터 출력부분
		// 메소드호출부
		// 매개인자 Argument - 메소드호출시 전달되는 
		printPerson(name, age);
	}
	
	public void test2() {
		
		String name = "신사임당";
		int age = 48;
		
		printPerson(name, age); // this.printPerson(name, age);
	}
	/**
	 * 매개변수 Parameter // 변수 - 값을 담기위한 공
	 * - 선언
	 * - 값대입 - 메소드 호출시 전달된 값 대입
	 */
	public void printPerson(String name,int age) {
		System.out.printf("안녕하세요, 저는 %s입니다. %d살이에요. 반갑습니다.\n", name , age);
	}
}
