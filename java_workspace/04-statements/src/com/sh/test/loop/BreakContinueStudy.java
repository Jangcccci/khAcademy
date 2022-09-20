package com.sh.test.loop;

public class BreakContinueStudy {

	public static void main(String[] args) {
		BreakContinueStudy study = new BreakContinueStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	/**
	 * 
	 * 1~100 사이의 홀수만 출력
	 * 1~100 사이의 짝수만 출
	 */
	
	public void test3() {
		
		//홀수 for
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0)
				continue;
			System.out.println(i);
		}
		
		//홀수 while
		
		int i = 0;
		
		while(i < 100) { 
			i++;//== while(i++ < 100)
			if(i % 2 == 0)
				continue;
			System.out.println(i);
		}
		
		//짝수 for
		
		for(i = 1; i <= 100; i++) {
			if(i % 2 != 0)
				continue;
			System.out.println(i);
		}
		
		//짝수 while
		i = 0;
		while(i < 100) {
			i++;
			if(i % 2 != 0)
				continue;
			System.out.println(i);
		}
	}
	
	/**
	 * continue
	 * - 반복문 실행 시 continue를 만나면, 이하 코드를 실행하지 않고 반복문의 처음으로 돌아간다.
	 * - for문의 증감식으로 이동
	 * - while문의 조건식으로 이동 (continue하위에 증감식이 있어서는 안된다.)
	 */
	
	public void test2() {
		
		// 짝수만 출력
//		for(int i = 1; i <= 10 ;i++) {
//			if(i % 2 != 0)
//				continue;
//			System.out.println(i);
//		}
		
		int i = 0;
		while(i < 5) {
			i++;
			if(i % 2 != 0)
				continue;
			System.out.println(i);
		}
		
	}
	
	/**
	 * break
	 * - 반복문을 즉시 중단하고 탈출!
	 * 
	 */
	public void test1() {
//		int i = 0;
//		while(true) {
//			if(i > 100) {
//				break;
//			}
//			System.out.println(i);
//			i++;
//		}
	
	int sum = 0;
	int i = 1;
	while(true) {
		if(i>10) {
			break;
		}
		sum += i;
		i++; // sum += i++; -> 이렇게 대처 가능하다.
	}
	System.out.printf("1 ~ 10 까지의 합은 %d입니다.", sum);
	}
}
