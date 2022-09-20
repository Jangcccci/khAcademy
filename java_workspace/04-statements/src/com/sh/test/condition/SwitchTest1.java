package com.sh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {
	
	/**
	 * [문제11]    
	@com.sh.test.condition.SwitchTest1
	수도세를 구하는 프로그램을 작성하세요. 
	사용자에게 사용용도와 물사용량을 입력받고, 이에따른 수도세를 계산해 출력하세요.(switch문 사용할 것.)
	 * 사용요금: 용도별 가격(1liter)  * 사용량
	 * 수도세: 사용요금의 5%
	 * 총사용요금: 사용요금 + 수도세
	 * 사용용도메뉴에서 1,2,3번이외를 선택시에는 "메뉴번호는 1,2,3만 가능합니다."를 출력하고, 프로그램을 종료할 수 합니다.


	사용자입력예시)

        ----------menu----------
        1. 가정용 (50원/liter)
        2. 상업용 (45원/liter)
        3. 공업용 (30원/liter)
        -------------------------
        메뉴번호를 선택하세요. ==> 2
        물 사용량을 입력하세요. ==> 250


	출력예시)

        ----------<<수도세>>-----------
        선택메뉴번호 :  2. 상업용(업소에서 사용하실 경우)를 선택하셨습니다. 
        사용요금 : 11250
        수도세 : 562
        총수도요금 : 11812원
	 * @param args
	 */

	public static void main(String[] args) {
		SwitchTest1 st1 = new SwitchTest1();
		st1.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		String menu1 = "----------menu----------\n"
					+ "1. 가정용 (50원/liter)\n"
					+ "2. 상업용 (45원/liter)\n"
					+ "3. 공업용 (30원/liter)\n"
					+ "-------------------------\n"
					+ "메뉴번호를 선택하세요. ==> ";
		System.out.println(menu1);
		int c1 = sc.nextInt();
		
		String menu2 = "----------menu----------\n"
				+ "1. 가정용 (50원/liter)\n"
				+ "2. 상업용 (45원/liter)\n"
				+ "3. 공업용 (30원/liter)\n"
				+ "-------------------------\n"
				+ "물 사용량을 입력하세요. ==> ";
		System.out.println(menu2);
		int c2 = sc.nextInt();
		String name = "";
		int price = 0;
		int waterPrice = 0;
		int totalPrice = 0;
		
		switch(c1) {
		case 1 : name = "가정용"; price = 50*c2; waterPrice = (price*5)/100; totalPrice = price + waterPrice; break;
		case 2 : name = "상업용"; price = 45*c2; waterPrice = (price*5)/100; totalPrice = price + waterPrice; break;
		case 3 : name = "공업용"; price = 30*c2; waterPrice = (price*5)/100; totalPrice = price + waterPrice; break;
		default : System.out.println("메뉴번호는 1,2,3만 가능합니다. 프로그램을 종료합니다.	"); return;
		}
		
		System.out.printf(" ----------<<수도세>>-----------\n"
				+ "        선택메뉴번호 :  %d. %s를 선택하셨습니다. \n"
				+ "        사용요금 : %d\n"
				+ "        수도세 : %d\n"
				+ "        총수도요금 : %d",c1,name,price,waterPrice,totalPrice);
	}
}
