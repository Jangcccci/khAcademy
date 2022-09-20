package com.sh.test.star;

public class Star {

	public static void main(String[] args) {
		
		Star st = new Star();
//		st.test1();
//		st.test2();
//		st.test3();
		st.test4();
	}
	
	/**
	 * @실습문제1

	 *****
	 ****
	 ***
	 **
	 *
	 */
	
	public void test1() {
		int num = 5;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print('*');
				if(num-i == j+1)
					break;
			}
			System.out.println();
		}
	}
	
	/**
	 * @실습문제2

	 *
	 **
	 ***
	 ****
	 *****
	 */
	public void test2() {
		int num = 5;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print('*');
				if(j == i)
					break;
			}
			System.out.println();
		}
	}
	
	/**
	 * @실습문제3

           *
          **
         ***
        **** 
       *****
	 */
	
	public void test3() {
		int num = 5;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(num-i <= j+1)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
//	@실습문제4
//
//    *     
//   ***    
//  *****   
// *******  
//********* 
	
	public void test4() {
		int num = 20;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < (num*2); j++) {
				if(num-i <= j+1) {
					if(i+num == j)
						break;
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
