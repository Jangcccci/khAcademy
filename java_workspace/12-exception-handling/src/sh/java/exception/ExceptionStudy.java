package sh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExceptionStudy {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionStudy study = new ExceptionStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();

		System.out.println("...정상종료...");
	}

	/**
	 * @실습문제 : 두 정수를 입력받고, 합/차/곱/몫/나머지 결과를 출력 - 예외처리 필수 - 결과 출력 후 계속할지 여부(y/n)를 묻고,
	 *       y를 입력한 경우 반복처리
	 * 
	 */

	private void test6() {

		while (true) {
			System.out.print("정수1을 입력하세요 > ");
			int num1 = sc.nextInt();
			System.out.print("정수2를 입력하세요 > ");
			int num2 = sc.nextInt();

			int big = Math.max(num1, num2);
			int small = Math.min(num1, num2);

			try {

				System.out.println("합 : " + (big + small));
				System.out.println("차 : " + (big - small));
				System.out.println("곱 : " + (big * small));
				System.out.println("나눈 몫 : " + (big / small));
				System.out.println("나눈 나머지 : " + (big % small));

				System.out.print("계속 하시겠습니까?(y/n) : ");
				char ch = sc.next().charAt(0);
				if (ch != 'y' || ch != 'n') {
					System.out.println("잘못 입력하셨습니다.");

				}
				if (ch == 'y') {
					System.out.println("다시 시작합니다.");
				} else if (ch == 'n') {
					System.out.println("종료합니다.");
					return;
				}

			} catch (ArithmeticException e) {
				System.err.println("산술연산 예외가 발생했습니다.");
			} catch (InputMismatchException e) {
				System.err.println("잘못 입력하셨습니다.");
				sc.nextLine();
			} catch (NullPointerException e) {
				System.err.println("입력 값이 없습니다.");
			}
		}

	}

	/**
	 * 
	 * Exception catch절 - 발생한 예외별로 처리가 다르지 않다면, 최상위 예외 catch절을 사용한다.
	 * 
	 */
	private void test5() {
		Random rnd = new Random();

		try {
			if (rnd.nextBoolean()) {
				int[] arr = new int[3];
				System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
			}

			if (rnd.nextBoolean())
				System.out.println(100 / 0);

			if (rnd.nextBoolean()) {
				String str = null;
				System.out.println(str.length());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); // 발생한 예외 : 예외메세지 ~ 예외발생시 callstack 로그(링크)
		}
	}

	/**
	 * catch절의 다형성
	 * 
	 * - 상속구조가 아닌 예외클래스에 대한 catch절의 순서는 상관없다. - 상속구조인 경우 자식/부모순으로 작성 해야한다. - 위에서 부터
	 * 발생한 예외객체를 처리할 수 있는지 검사한다.
	 * 
	 */
	private void test4() {
		Random rnd = new Random();

		try {
			FileReader fr = new FileReader("존재하지 않는 파일.txt");

			if (rnd.nextBoolean()) {
				int[] arr = new int[3];
				System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
			}

			if (rnd.nextBoolean())
				System.out.println(100 / 0);

			if (rnd.nextBoolean()) {
				String str = null;
				System.out.println(str.length());
			}

		} catch (ArithmeticException e) {// Unreachable catch block for ArithmeticException. It is already handled by
											// the catch block for RuntimeException
			System.out.println("산술연산예외가 발생했습니다.");
		} catch (NullPointerException e) {
			System.out.println("NPE가 발생했습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 유효하지 않습니다.");
		} catch (RuntimeException e) {
			System.out.println("런타임예외가 발생했습니다.");
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다." + e);
		}

	}

	/**
	 * try~catch~(finally) 실행순서
	 * 
	 * finally - try에서 예외가 발생하건 안하건 무조건 실행되는 구문 - try에서 조기리턴을 해도 finally는 실행된다.
	 */
	private void test3() {
		System.out.println(1);
		try {
			System.out.println(2);

			// 예외발생 : 발생한 순간 catch로 점프한다.
//			System.out.println(100/0);

			System.out.println(3);

			return;
		} catch (ArithmeticException e) {
			// 예외가 발생하지 않으면 catch절을 거치지 않아서 4는 출력이 안된다.
			System.out.println(4);
		} finally {
			System.out.println(100);
		}
		System.out.println(5);
	}

	private void test2() {
		while (true) {
			try {
				System.out.print("정수1 : ");
				int num1 = sc.nextInt();
				System.out.print("정수2 : ");
				int num2 = sc.nextInt();

				System.out.printf("%d와 %d의 합은 %d입니다.\n", num1, num2, num1 + num2);
				break;
			} catch (InputMismatchException e) {
				System.out.println("유효한 정수를 입력해주세요.");
				sc.nextLine(); // 입력버퍼 비우기 : 반복문 안에 들어갈 때 무조건 필요
			}
		}

	}

	/**
	 * ArithmeticException InputMismatchException
	 * 
	 */
	private void test1() {
		try {
			// 예외가 발생할 수 있는 코드
			System.out.println("정수1을 입력하세요! > ");
			int n = sc.nextInt();
			System.out.println("정수2를 입력하세요! > ");
			int m = sc.nextInt();

			System.out.printf("%d / %d = %d\n", n, m, n / m);

			// checked exception 예외처리 강제화
//			FileReader fr = new FileReader("abc.txt"); //Unhandled exception type FileNotFoundException -> checkedException

		} catch (ArithmeticException e) { // Java.lang 패키지에 있는 얘들은 import하지 않아도 된다.
			// 예외가 발생했을때 처리할 코드
			System.out.println("산술예외가 발생했습니다!!!");
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력하실 수 있습니다!!!");
		}
//		catch(FileNotFoundException e) {
//			System.out.println("파일을 찾을 수 없습니다.");
//		}

		// 정수2에 0을 입력하면 Exception in thread "main" java.lang.ArithmeticException: / by
		// zero 가 나온다.
		// 정수대신에 문자를 입력하면 Exception in thread "main" java.util.InputMismatchException 가
		// 나온다.

	}
}
