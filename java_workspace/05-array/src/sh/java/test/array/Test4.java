package sh.java.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
	/**
	 * [문제4]
- 클래스 : sh.java.test.array.Test4.java
- 메소드명 : public void test1()
    사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
     
        힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - Arrays.copyOf() 매소드 이용
       - clone() 매소드 이용

- 메소드명 : public void test2()
    위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
    * java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
    * 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.

	 */
	
	public static void main(String[] args) {
		Test4 test = new Test4();
		
		test.test1();
//		test.test2();
	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 11자리를 입력하세요 (예 : 01011112222) : ");
		String pn = sc.next();
		
//		char[] pn2 = pn.toCharArray(); -> 바로 문자형 배열로 변환하는 메소드를 제공한다.
		char[] ch = new char[pn.length()];
		for(int i = 0; i < pn.length(); i++) {
			ch[i] = pn.charAt(i);
		}
		
//		for(int i = 0; i < ch.length; i++) {
//			if(i>2 && i<7) {
//				
//			}
//		}
		
//		//1. clone
//		char[]ch2 = ch.clone();
//		for(int i = 3; i < 7; i++) {
//			ch2[i] = '*';
//		}
//		
//		System.out.println(ch2);
		
//		//2. Arrays.copyOf
//		char[] ch3 = Arrays.copyOf(ch, pn.length());
//		for(int i = 3; i < 7; i++) {
//			ch3[i] = '*';
//		}
//		System.out.println(ch3);
		
		//3. System.arraycopy
		
		char[] ch4 = {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'};
		
		System.arraycopy(ch, 0, ch4, 0, 3);
		System.arraycopy(ch, 7, ch4, 7, 4);
		System.out.println(ch4);
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 11자리를 입력하세요 (예 : 01011112222) : ");
		String pn = sc.next();
		
		String a = pn.substring(0, 3);
		String b = "****";
		String c = pn.substring(7, 11);//== String c = pn.substring(7);
		
//		System.out.println(a+b+c);
		
		StringBuilder sb = new StringBuilder("010");
		sb.append(b);
		sb.append(c);
		
		System.out.println(sb);
		
//		String s = "abc";
//		s += "def";
		// s가 "abcdef"로 바뀌는 것이 아니라 String 메모리상에 "abc" "def" "abcdef"가 다 존재한다.
		// 3가지를 모두 저장하는 	이유는 재사용이 용이하기 때문이다.	
	}

}
