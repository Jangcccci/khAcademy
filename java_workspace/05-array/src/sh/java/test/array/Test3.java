package sh.java.test.array;

import java.util.Scanner;

public class Test3 {

	/**
	 * 
	 * - 클래스 : sh.java.test.array.Test3.java
	   - 메소드명 : public void test()

    문자열을 하나 입력 받아 문자배열에 넣고 검색할 문자를 하나 입력 받아 검색 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을 작성하세요.
    
    예) 입력값 : helloworld
    검색값 :ㅣ
    출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
	 */
	
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		
		t3.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next(); // next => 공백이 없는 문자 / nextline => 공백이 있는 문자까지 읽겠다.
		System.out.print("검색할 문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.printf("입력하신 문자열 %s에서 찾으시는 문자 %c은 %d개 입니다.",str, ch ,count);
	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.println("검색할 문자를 하나 입력하세요 : ");
		char searchk = sc.nextLine().charAt(0);
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {//String은 .length()로 메소드 호출이지만 arr는 아니다.	
			if(arr[i] == searchk)
				cnt++;
		}
		
		System.out.printf("입력하신 문자열 %s에서 찾으시는 문자 %c은 %d개 입니다.",str, searchk ,cnt);
		
		
	}
}
