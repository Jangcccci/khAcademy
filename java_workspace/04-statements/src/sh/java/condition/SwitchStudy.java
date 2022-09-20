package sh.java.condition;

import java.util.Scanner;

/**
 * 
 * switch(변수|계산식){
 * 	case 값1 : 실행문1; break;
 * 	case 값2 : 실행문2; break;
 * 	case 값3 : 실행문3; break;
 * 	default : 기본실행문;
 * }
 * 
 * -변수 | 계산식 : 값으로 평가될 수 있는 구문. byte/short/cahr/int/String(jdk 1.7이상)/enum만 가능.
 * 	-long/float/double/boolean은 사용불가 
 *
 */
public class SwitchStudy {

	public static void main(String[] args) {
		
		SwitchStudy study = new SwitchStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
	}
	/**
	 * 
	 * 학점예제 switch
	 * A : 90 ~ 100
	 * B : 80~89
	 * C : 70~79
	 * D : 60~69
	 * F : ~59
	 */
	public void test5() {
		Scanner sc= new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade = ' ';//NULL 문
		
		switch(score / 10){
		case 10 :
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F';
		}
		System.out.printf("당신의 학점은 [%c]입니다.", grade);
	}
	/**
	 * switch - fall through
	 * -break 키워드가 없다면, 다음 case문을 연달아 실행한다.
	 * -break란? 현재 중괄호 블럭을 탈출해라.
	 * 
	 * 회원추석선물
	 * 1. Gold : 올리브유, 참기름, 참치
	 * 2. Silver : 참기름, 참치
	 * 3. Bronze : 참치
	 * 
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원등급을 입력하세요. (1.Gold 2.Silver 3.Bronze)");
		System.out.print("숫자입력 : ");
		String choice = sc.next();
		String present = "";
		
		switch(choice) {
//		case "1" : present = "올리브유, 참기름, 참치";
//		case "2" : present = "참기름, 참치";
//		case "3" : present = "참치"; break;// -> 이렇게 하면 다 참치받고 빡침
		case "1" : present += "올리브유, ";
		case "2" : present += "참기름, ";
		case "3" : present += "참치"; break;//->이렇게 할 수도 있다
		default : System.out.println("잘못 입력하셨습니다."); return;
		}
		
		System.out.printf("회원님의 추석선물은 [%s]입니다.\n", present);
	}
	
	/**
	 *  변수의 생명주기 LifeCycle
	 *  - block scope
	 *  	-block안에 선언된 변수는 block 밖에서 접근할 수 없다.
	 *  -if블럭, switch블럭, for블럭
	 */
	public void test3() {
		int num = 100;
		int x = 1;
		if(true) {
			String str = "abc";
			System.out.println(str);
			
			num = 200;
			System.out.println(num);
			
//			int x = 1;//중복된 변수명 사용불가!
		}
//		System.out.println(str);//접근 불가!	
		System.out.println(num);
		
		int m;
		if(true) {//-> false 이거나 ture/false가 정해지지 않는 상황이면 값대입이 되지않아 문법오류가 생긴다.
				  //-> 해결방법 : int m = 0; 으로 초기값을 잡아주면 해결된다.
			m=100;
			System.out.println(m);
		}
		System.out.println(m);
	}

	/**
	 * @실습문제 : 메뉴 선택시 다음과 같이 출력하라.
	 * --------------------------------
	 * 선택하신[순대국]은 [8000]원 입니다.
	 * 
	 */
	public void test2() {
		String menu = "=======================\n"
					+ "1.순대국-----------8000원\n"
					+ "2.된장찌개----------8500원\n"
					+ "3.순두부찌개---------9000원\n"
					+"-------------------------\n"
					+"선택 : ";
		System.out.print(menu);
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		int price = 0;
		
		switch(choice) {
		case "1" : price = 8000; choice = "순대국"; break;
		case "2" : price = 8500; choice = "된장찌개";break;
		case "3" : price = 9000; choice = "순두부찌개";break;
		default : System.out.println("그런 메뉴는 없습니다."); return;
		}
			System.out.println("선택하신 [" + choice + "]는 [" + price + "]원 입니다.");
	}
		
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 과일을 선택하세요. (1.사과/2.바나나./3.아보카도)");
		System.out.print("선택 : ");
		int choice = sc.nextInt(); //String choice = sc.next(); -> case"1"로 하면 더 안전 / choice.equals("1")
		int price = 0;
		switch(choice) {
		case 1 : 
			price = 2000; 
			break;//이렇게 써도 상관없다.	
		case 2 : price = 3000; break;// break; : switch 블럭을 빠져나간다.
		case 3 : price = 3500; break;
		default : System.out.println("잘못입력하셨습니다.");//default는 안 써도 문법적으로 상관없다.	
		}
		if( choice == 1 || choice ==2 || choice == 3){
			  System.out.println("선택하신 과일의 가격은 ["+ price +"]원 입니다.");
			}// -> default 뒤에 return;(조기리턴/메소드호출부로 감)을 실행하면 결과는 같다.
	}
}



//System.out.println("선택하신 과일의 가격은 [" + price + "]원 입니다.");