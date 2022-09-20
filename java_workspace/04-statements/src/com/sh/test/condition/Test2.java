package com.sh.test.condition;

import java.util.Scanner;

/**
 * [문제 2]
	- 클래스 : com.sh.test.condition.Test2.java
	- 메소드명 : public void test()

    국어(int), 영어(int), 수학(int) 점수를 정수형으로 입력 받아 
    총점(int)과 평균(double)을 계산하고 
    세 과목의 점수와 평균을 가지고 합격여부 처리, 
    세 과목 점수가 각각 40점 이상이면서, 평균이 60점 이상이면 합격,
    아니면 불합격을 출력하는 프로그램을 작성하세요. 
 */
public class Test2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		
		t2.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int score1 = sc.nextInt();
		System.out.print("영어점수 : ");
		int score2 = sc.nextInt();
		System.out.print("수학점수 : ");
		int score3 = sc.nextInt();
		
		int totalScore = score1 + score2 + score3;
		double average = (double)totalScore/3;
		
		if(score1 >= 40 && score2 >= 40 && score3 >= 40 && average >= 60) {
			System.out.printf("당신의 총점은 %d이고 평균은 %f 입니다.\n당신은 합격입니다.",totalScore, average);
		}else {System.out.println("당신은 불합격입니다.");}
	}
}
