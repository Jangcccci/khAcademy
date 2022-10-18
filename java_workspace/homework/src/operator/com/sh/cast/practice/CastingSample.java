package operator.com.sh.cast.practice;

import java.util.Scanner;

public class CastingSample {

	Scanner sc = new Scanner(System.in);
	
	/**
	 * [실습 1]
	public void printUniCode(){}
 	- 키보드로 문자하나를 입력받아, 그 문자의 유니코드(아스키코드)를 출력되게 함
 	- 입력예 : 
    문자 입력 : A
 	- 출력예 : 
    A is unicode : 65
	 */
	
	public void printUniCode() {
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println(ch + " is unicode : " + (int)ch);
	}
	
	/**
	 * [실습2]
	public void calculatorScore(){}
 	- 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 계산해서 출력함
 	- 총점과 평균은 정수형으로 처리함
 	- 입력예 : 
    국어 : 90.0
    영어 : 90.0
    수학 : 90.0
 	- 출력예 : 
    총점 : 270
    평균 : 90
	 */
	
	public void calculatorScore() {
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int score = (int)(kor + eng + math);
		int average = score/3;
		System.out.println("총점 : " + score);
		System.out.println("평균 : " + average);
	}
}
