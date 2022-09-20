package sh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopStudy {

	public static void main(String[] args) {
		NestedLoopStudy study = new NestedLoopStudy();
		
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
		study.test7();
	}
	
	/**
	 * 
	 * @실습문제
	 * 
	 * ㅇㅇㅇ
	 * ㅇ
	 * ㅇㅇㅇ
	 * ㅇ
	 * ㅇㅇㅇ
	 */
//	public void test7() {
//		for(int i = 0; i < 5; i++) {
//			if(i % 2 != 0) {
//				System.out.println("ㅇ");
//			}else {
//				for(int j = 0; j < 3; j++) {
//					System.out.print("ㅇ");
//				}
//				System.out.println();
//			}
//		}
//		
//	}
	
	public void test7() {
        for(int i = 0;i < 5;i++) {
            for(int j = 0; j < 4;j++) {
                System.out.print("♘");
                if(i % 2 != 0)
                    break;
            }
            System.out.println();
        }
    }
	
	/**
	 * :pizza:
	 * :pizza::pizza:
	 */
	public void test6() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {// j <= i;
				System.out.print("ㅇ");
			}
			System.out.println();
		}
	}
	/**
	 * 중첩반복문에서의 break/continue
	 * 
	 * - 반복문에 라벨붙이기
	 */
	
	public void test5() {
		
//		gugu:// 라벨 붙이기
//		for(int dan = 2; dan < 10; dan++) {
//			for(int n = 1; n < 10; n++) {
//				if(dan * n > 50)
//					break gugu; // gugu반복문을 break해라!	
//				System.out.printf("%d * %d = %d\n",dan,n,dan*n);
//			}
//			System.out.println();
//		}
		
		outer:// 라벨 붙이기
		for(int dan = 2; dan < 10; dan++) {
			for(int n = 1; n < 10; n++) {
				System.out.printf("%d * %d = %d\n",dan,n,dan*n);
				
				if(dan == n)
					System.out.println();//contune 는 이하 코드를 실행하지 않기때문에 위에 개행처리를 한다.	
					continue outer; // for문은 증감식으로 while문은 조건식으로
			}
		}
	}
	/**
	 * 
	 * 구구단 전체 출력 (2~9단)
	 * 
	 */
	
	public void test4() {
		
		for(int dan = 2; dan < 10; dan++) {
			System.out.println("=======");
			System.out.println(dan + "단");
			System.out.println("=======");
			for(int n = 1; n < 10; n++) {
				System.out.printf("%d * %d = %d\n",dan,n,dan*n);
			}
			System.out.println();
		}
	}
	/**
	 * @실습문제 : 사용자로부터 행, 열, 특수문자를 입력받아
	 * 			 별찍기 출력
	 * 예)
	 *   행 : 4
	 *   열 : 3
	 *   문자 : @	
	 *   
	 *   
	 *   @@@
	 *   @@@
	 *   @@@
	 *   @@@
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int row = sc.nextInt();
		System.out.print("열 : ");
		int col = sc.nextInt();
		System.out.print("특수문자 : ");
		char ch = sc.next().charAt(0);
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	/**
	 * 3행 5열 만들기
	 */
	public void test2() {
		//행
		for(int i = 0; i < 3; i++) {
			//열
			for(int j = 0; j < 5; j++) {
				System.out.print("ㅇ");
			}
			System.out.println();
		}
	}
	/**
	 * 중첩반복문
	 *  - 다차원적인 데이터를 처리할 수 있다.
	 *  - 행열 정보 출력가능
	 */
	public void test1() {
		
		for(int i = 0; i < 3; i++) {
//			System.out.println(">" + i);
			
			for(int j = 0; j < 5; j++) {
//				System.out.println(i + " , " + j);
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
		
	}
	
	
	
}
