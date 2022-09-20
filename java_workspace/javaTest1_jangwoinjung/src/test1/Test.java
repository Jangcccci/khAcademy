package test1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		test.count();
	}

	public void count() {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			} else {
				System.out.println(str.length() + "글자입니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}
	

}
