package sh.java.api.random;

import java.util.Random;
import java.util.Scanner;

// java.lang.* 은 자동 import 되어 있음 (import java.lang.*;)

public class RandomStudy {

	
	/**
	 * 
	 * 1. java.util.Random클래스
	 * 2. Math.random() - java.lang클래스
	 */
	public static void main(String[] args) {
		
		RandomStudy study = new RandomStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	/**
	 * 동전게임
	 * - 컴퓨터가 앞뒤 난수 생성
	 * - 사용자 앞뒤 선택
	 * - 결과출력
	 * 
	 * 1 : 앞
	 * 2 : 뒤
	 */
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		// 컴퓨터 난수 생성
		int comCoin = (int) (Math.random() * 2 + 1);
		System.out.println(comCoin);
		
		//사용자 앞뒤 선택
		System.out.println("> 앞뒤를 선택하세요. (1. 앞 / 2. 뒤)");
		System.out.print("선택 : ");
		int userCoin = sc.nextInt();
		
		//결과확인
		String result = (comCoin == userCoin) ? "당신이 이겼습니다." : "당신이 졌습니다.";
		System.out.println(result);
		
	}
	
	public void test2() {
		double dnum = Math.random(); //0.0이상 ~ 1.0미만
		
		//(Math.random() * 경우의 수 + 최소값)
		int n = (int)(dnum * 10 + 1);
		
		System.out.println(dnum);
		System.out.println(n);
		
		// 0 또는 1
		int b = (int)(dnum*2);
		System.out.println(b);
		System.out.println(b==0 ? "앞" : "뒤");
		
		//boolean
		boolean bool = (int)(Math.random()*2) == 0? true : false; // 0이면 true 1이면 false
		
		
	}
	
	/**
	 * java.utill.Random
	 * - nextInt()
	 * -nextDouble()
	 * -nextBoolean()
	 */
	public void test1() {
		Random rnd = new Random();
		int n = rnd.nextInt(); //int범위 내에서 난수 생성
		System.out.println(n);
		
		// 범위가 있는 난수
		//Random#nextInt(경우의 수) + 최소값
		int i = rnd.nextInt(10) + 1; // 0~9 + 1
		System.out.println(i);
		
		double dnum = rnd.nextDouble(); //0.0이상 ~ 1.0미만의 실수를 반환한다.
		System.out.println(dnum);
		
		boolean bool = rnd.nextBoolean();
		System.out.println(bool ? "앞" : "뒤");
	}
}
