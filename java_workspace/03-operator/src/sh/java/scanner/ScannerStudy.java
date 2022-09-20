package sh.java.scanner;

import java.util.Scanner;

/**
 * 
 * java.utill.Scanner
 * - 사용자의 키보드 입력을 읽어서 변환
 * - 각타입별로 지원하는 메소드 있음
 * 
 * 1. next계열
 * 	-next() : String 계열
 * 	-nextInt() : int
 * 	-nextDouble() : double
 * 	-nextBoolean() : boolean
 * 	-nextChar는 존재하지 않
 * 	-실제 문자열 이전에 만난 공백/개행문자는 무시하고 실제 문자열 이후에 만난 공백/개행문자 전까지만 읽어온다.
 * 
 * 2. nextline 계열
 * 	-nextline():String
 *  -공백이 포함된 문자열인 경우 사용
 * 	-개행문자까지 읽어와서 개행문자는 버리고, 실제입력값 반환
 *
 */
public class ScannerStudy {

	public static void main(String[] args) {
		
		ScannerStudy study = new ScannerStudy();
//		study.test1();
		study.test2();
	}
	
	/**
	 * 
	 * @실습문제 : 사용자의 이름/나이/키/몸무게/성별을 입력받고 마지막에 다음과 같이 출력할 것.
	 * 
	 * ----------------
	 * 이름 : 
	 * 나이 : 
	 * 주소 : 
	 * 키 : 
	 * 몸무게 : 
	 * -----------------
	 */
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름> "	);
		String name = sc.next();
		System.out.println("입력하신 이름은[" + name + "]입니다.");
		
		System.out.println("나이 > ");
		int age = sc.nextInt();
		System.out.println("당신의 나이는 [" + age + "]입니다. ");
		
		sc.nextLine();
		System.out.println("주소 > ");
		String addr = sc.nextLine();
		System.out.println("당신의 주소는 [" + addr + "]입니다.");
		
		System.out.println("키 (예: 177.7)> ");
		double height = sc.nextDouble();
		System.out.println("당신의 키는 [" + height + "]입니다. ");
		
		System.out.println("몸무게 (예 : 83)> ");
		int weight = sc.nextInt();
		System.out.println("당신의 몸무게는 [" + weight + "]kg 입니다. ");
		
		System.out.println("성별 (남|여)> ");
		char gender = sc.next().charAt(0);
		System.out.println("당신의 성별은[" + gender + "]자 입니다. ");
		
		System.out.println("------------------------------");
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age );
		System.out.println("주소 : " + addr );
		System.out.println("키 : " + height );
		System.out.println("몸무게 : " + weight );
		System.out.println("성별 : " + gender );
		System.out.println("------------------------------");
	}
	/**
	 * 
	 * next 계열
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in); // System.in 표준입력(키보드입력) 
		
		System.out.print("이름> "	);
		String name = sc.next();
		System.out.println("입력하신 이름은[" + name + "]입니다.");
//		
//		System.out.println("나이 > ");
//		int age = sc.nextInt();
//		System.out.println("당신의 나이는 [" + age + "]입니다. ");
//		
//		System.out.println("키 (예: 177.7)> ");
//		double height = sc.nextDouble();
//		System.out.println("당신의 키는 [" + height + "]입니다. ");
//		
//		System.out.println("결혼여부 (true|false)> ");
//		boolean isMarried = sc.nextBoolean();
//		System.out.println("당신의 결혼여부는 [" + isMarried + "]입니다. ");
//		
//		System.out.println("성별 (남|여)> ");
//		char gender = sc.next().charAt(0);
//		System.out.println("당신의 성별은[" + gender + "]자 입니다. ");
		
		
		//개행문자 날리기용
		sc.nextLine();
		
		System.out.println("주소 > ");
		String addr = sc.next();
		System.out.println("당신의 주소는 [" + addr + "]입니다.");
		
	}
}
