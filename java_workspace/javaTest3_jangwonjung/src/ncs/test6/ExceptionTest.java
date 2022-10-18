package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("2 ~ 5까지의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		try {
			System.out.println(cal.getSum(num));
		}catch(InvalidException e) {
			System.err.println(e.getMessage());
		}
	}
}
