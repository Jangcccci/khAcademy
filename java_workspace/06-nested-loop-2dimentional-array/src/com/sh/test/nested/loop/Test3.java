package com.sh.test.nested.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	/**
	 * [문제3]
	클래스명: com.sh.test.nested.loop.Test3.java
	메소드명: public void test()

    정수하나 입력받아, 그 수가 양수일때만 입력된 
    수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
    프로그램을 만들어보자.
        출력예)
      정수 입력 : 5
    
         *
         **
         ***
         ****
         *****
          ****
           ***
            **
             *
	 */
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("양수가 아닙니다.");
		}else {
			
			for(int i = 0; i < (num*2)-1; i++) {
				for(int j = 0; j < num; j++) {
					
					if(i < num) {
						if(i < j)
							System.out.print(' ');
						else
							System.out.print('*');
						
					}
					else{
//						int blank = i - (num-1); 공백수를 구해서 변수로 넣을 수 있다.
						if(j <= i-num)
							System.out.print(' ');
						else
							System.out.print('*');
					}
				}
				System.out.println();
			}
			
		}
		
	}
}
