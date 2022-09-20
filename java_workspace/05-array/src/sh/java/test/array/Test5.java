package sh.java.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t5 = new Test5();
		
		t5.test();
	}
	/**
	 * [문제5]
- 클래스 : sh.java.test.array.Test5.java
- 메소드명 : public void test()
    주민등록번호 성별자리 이후부터 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 
    변경하세요
     
        힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - Arrays.copyOf() 매소드 이용
       - clone() 매소드 이용
	 */
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요 : ");
		String cn = sc.nextLine();
		
		char[] cn2 = cn.toCharArray();
//		char[] cn2 = new char[cn.length()];
//		
//		for(int i = 0; i < cn.length(); i++) {
//			cn2[i] = cn.charAt(i);
//		}
		//1. for문 이용
//		
//		for(int i = 7; i < cn.length(); i++) {
//			cn2[i] = '*';
//		}
//		System.out.print(cn2);
		
		//2. System.arraycopy()이용
//		char[] cn3 = new char[14];
//		System.arraycopy(cn2, 0, cn3, 0, 7);
//		for(int i = 7; i < cn.length(); i++) {
//			cn3[i] = '*';
//		}
//		System.out.println(cn3);
		
		//3. Arrays.copyOf() 메소드 이용
//		char[] cn4 = Arrays.copyOf(cn2, cn.length());
//		for(int i = 7; i < cn.length(); i++) {
//			cn4[i] = '*';
//		}
//		System.out.println(cn4);
		
		//4. clone() 메소드 이용
		char[] cn5 = cn2.clone();
		for(int i = 7; i < cn.length(); i++) {
			cn5[i] = '*';
		}
//		System.out.println(new String(cn5));
//		System.out.println(cn5.toString());
		System.out.println(cn5);
	}
}
