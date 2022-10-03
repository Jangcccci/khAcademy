package sh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ThrowExceptionStudy {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ThrowExceptionStudy study = new ThrowExceptionStudy();
		
//		study.test1();
//		study.test2();
		
		//main에서 throw로 던질 수는 있으나 예외처리되는 것이 아닌 예외처리를 안 한 것.
		try {
			study.test3();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("...정상종료...");
	}
	
	private void test3() throws FileNotFoundException{
		System.out.println("test3");
		foo();
	}
	private void foo() throws FileNotFoundException {
		System.out.println("foo");
		bar();
	}
	/**
	 * 예외에 대한 2가지 대응 방법
	 * 1. try~catch 예외처리
	 * 2. 메소드에 throws 시그니처 추가
	 * 
	 * UncheckedException일 경우 throws를 생략해도 throws가 된다.
	 *  
	 */
	private void bar() throws FileNotFoundException {
		System.out.println("bar");
//		try {
		FileReader fr = new FileReader("존재하지 않는 파일.txt");
//		}catch(FileNotFoundException e) {
//			System.out.println("파일이 존재하지 않습니다.");
//		}
		
		String s = null;
		System.out.println(s.length());
	}
	/**
	 * 예외 던지기를 통한 분기흐름
	 */
	private void test2() {
		try {
			checkAge2();
			System.out.println("파찡코를 시작합니다...");
		}catch(UserAgeException e) {
			System.err.println(e.getMessage()); // 예외 메세지
			System.out.println("미성년자는 이용할 수 없습니다. 종료합니다.");
			e.printStackTrace();
		}
	}
	
	/**
	 * 나이 검사 후 미성년자인 경우 예외를 던진다.
	 */
	private void checkAge2() {
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		if(age < 20)
			throw new UserAgeException("미성년자 : " + age); // ()안에는 String으로 해야되고 예외 메세지이다.
		
	}
	private void test1() {
		boolean isAdult = checkAge();
		
		if(isAdult) {
			System.out.println("파칭코를 시작합니다...");
		}
		else {
			System.out.println("미성년자는 이용할 수 없습니다... 종료합니다.");
		}
	}

	private boolean checkAge() {
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age >= 20)
			return true;
		else
			return false;
	}
}
