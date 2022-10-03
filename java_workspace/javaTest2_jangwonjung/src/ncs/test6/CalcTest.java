package ncs.test6;

import java.util.Scanner;

public class CalcTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 1 (1 ~ 9) : ");
	int firstNum = sc.nextInt();
	if(firstNum > 9 || firstNum >1) {
		System.out.println("잘못 입력하셨습니다.");
		return;
	}
	System.out.print("정수 2 (1 ~ 9) : ");
	int secondNum = sc.nextInt();
	if(secondNum > 9 || secondNum >1) {
		System.out.println("잘못 입력하셨습니다.");
		return;
	}
	Calculate calc = new Calculate(firstNum, secondNum);
	System.out.println("합 : " + calc.sum(firstNum, secondNum));
	System.out.println("차 : " + calc.subtract(firstNum, secondNum));
	System.out.println("곱 : " + calc.multiply(firstNum, secondNum));
	System.out.println("나누기 : " + calc.divide(firstNum, secondNum));
	
	}

}
