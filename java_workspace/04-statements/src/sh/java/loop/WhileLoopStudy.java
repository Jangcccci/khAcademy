package sh.java.loop;

import java.util.Random;
import java.util.Scanner;

public class WhileLoopStudy {

	public static void main(String[] args) {
		WhileLoopStudy study = new WhileLoopStudy();
		
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * 구구단 반복 출력
	 * 
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		String menu = "=======GAME======\n"
					+ "1. 구구단\n"
					+ "2. 가위바위보\n"
					+ "=================\n"
					+ "선택 : ";
				
		do {
			
			System.out.print(menu);
			String choice = sc.next();
			switch(choice) {
			case "1" : gugudan(); break;
			case "2" : rps();break;
			default : System.out.println("잘못 입력했습니다.");
			}
			
			System.out.print("계속 하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);
			if(ch == 'n')
				break;
		}while(true);
		
	}
	
	public void rps() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 선택하세요(1. 가위/2. 바위/3. 보) : ");
		int n = sc.nextInt();
		
		Random rnd = new Random();
		int i = rnd.nextInt(3) + 1;
		
		System.out.println("==========결과==========");
		System.out.printf("당신은 %d를 냈습니다.\n", n);
		System.out.printf("컴퓨터는 %d를 냈습니다.\n", i);
		System.out.println("======================");
		if(n == i) {
			System.out.println("당신은 비겼습니다.");
		}
		else if(n == 1 && i == 2) {
			System.out.println("당신은 졌습니다.ㅋ");
		}
		else if(n == 1 && i == 3) {
			System.out.println("당신이 이겼습니다. ㅠㅠ");
		}
		else if(n == 2 && i == 3) {
			System.out.println("당신은 졌습니다.ㅋ");
		}
		else if(n == 2 && i == 1) {
			System.out.println("당신이 이겼습니다. ㅠㅠ");
		}
		else if(n == 3 && i == 1) {
			System.out.println("당신은 졌습니다.ㅋ");
		}
		else if(n == 3 && i == 2) {
			System.out.println("당신이 이겼습니다. ㅠㅠ");
		}
		
		// ||로 이겼습니다. 비겼습니다. 졌습니다를 묶을 수 있다.
	}
	
	public void gugudan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		int i = 1;
		while(i < 10) {
			System.out.printf("%d * %d = %d\n", dan , i , dan*i);
			i++;
			}
		
	}
	
	/**
	 * 
	 * do -while
	 * - 기존반목문 조건식 - 실행구문의 순서와 다르게
	 *   실행 - 조건식 순서로 처리함.	
	 */
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		String menu = "메뉴선택 (1.입금 2.출금 3.계좌이체 0.종료) : ";
		String choice = "";
		 do {
			System.out.print(menu);
			choice = sc.next();// String choice = sc.next(); -> while 조건식에 사용할 변수는 do 블럭 바깥에서 선언한다.	
			System.out.println(choice + "번을 선택하셨습니다.");
		}while(!choice.equals("0"));
		 
		 
		 do {
			 System.out.println(menu);
			 choice = sc.next();
			 System.out.println(choice + "번을 선택하셨습니다.");
			 
			 if(choice.equals("0"))
				 break;
			 
		 }while(true);
		 
		 
	}
	
	/**
	 * 
	 * 구구단 출력
	 * - 사용자가 원하는 단수의 구구단 출력!	
	 */
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		int i = 1;
		while(i < 10) {
			System.out.printf("%d * %d = %d\n", dan , i , dan*i);
			i++;
		}
	}
	
	/**
	 * 초기식
	 * 
	 * while(조건식){
	 * 	실행구문
	 * 	증감식
	 * }
	 */
	public void test1() {
//		for(int i =1; i <= 10; i++){
//			System.out.println(i);
//		}
		
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
		// 10 9 8 7 6 5 4 3 2 1
		
		int i = 10;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
		
		// 1 3 5 7 9 11 13 15 17 19
		
		i = 1;
		while(i < 20) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println();
		
		// 20 18 16 14 12 10 8 6 4 2
		
		i = 20;
		while(i > 1) {
			if(i % 2 ==0) {
			System.out.print(i + " ");
			}
			i--;
		}
		
	    i =20;
	    while(i<=20) {
	       System.out.print(i + " ");
	            i -=2;
	            if(i<0) {
	                break;
	            }
	   }
	    
	}
}
