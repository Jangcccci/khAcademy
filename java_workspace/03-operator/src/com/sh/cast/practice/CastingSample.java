package com.sh.cast.practice;

import java.util.Scanner;

public class CastingSample {

	/**
	 * [실습 1]
	public void printUniCode(){}
 	- 키보드로 문자하나를 입력받아, 그 문자의 유니코드(아스키코드)를 출력되게 함
 	- 입력예 : 문자 입력 : A
 	- 출력예 : A is unicode : 65
	 */
	
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자>");
		char letter = sc.next().charAt(0);
		System.out.println((int)letter);
	}
	
	/*
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
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : (예 : 90.2)>");
		double ko = sc.nextDouble();
		System.out.print("영어 : (예 : 90.2)>");
		double en = sc.nextDouble();
		System.out.print("수학 : (예 : 90.2)>");
		double ma = sc.nextDouble();
		
		int average = (int)(ko + en + ma)/3;
		
		System.out.println("총점 : [" + (ko + en + ma) + "]");
		System.out.println("평균 : [" + (average) + "]");
	}
}
