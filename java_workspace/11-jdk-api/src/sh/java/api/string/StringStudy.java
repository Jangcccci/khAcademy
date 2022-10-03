package sh.java.api.string;

import java.util.StringTokenizer;

/**
 * API
 *	- Application Programming Interface
 *
 * 
 * String
 * 	- 불변(immutable)
 * 	- heap 영역에 문자열 literal pool을 통해 관리
 * 	- + / concat 연산시, 기존 문자열을 변경하지 않고, 새로운 문자열을 만들어서 관리
 * 
 * StringBuilder/StringBuffer
 * 	- 변경가능(mutable)
 * 	- StringBuffer 멀티쓰레드 환경에서 안전하게 사용가능 (thread safe) / thread를 쉽게 말하면 일꾼
 *
 */
public class StringStudy {

	public static void main(String[] args) {
		StringStudy study = new StringStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * csv 데이터
	 * 	- comma separated value
	 * 	- 사과, 토마토, 딸기, 귤 ( 구분자(, 또는 공백, / 등등)로 연결된 데이터
	 * 
	 *  String#split(구분자:String)
	 *  	- 공백도 하나의 값으로 인정
	 *  new StringTokenizer(구분자:String)
	 *  	- 공백을 버림
	 * 
	 */
	private void test4() {

		String value = "java, oracle,jdbc,html,,css,javascript";
		
		// String#split -> 공백도 하나의 값으로 인정
		String[] values = value.split(",");
		for(String val : values) {
			System.out.println(val);
		}
		
		System.out.println();
		
		//StringTokenizer -> 공백은 무시
		StringTokenizer tokenizer = new StringTokenizer(value, ", "); // 문자단위(,와 공백)로 구분자 사용
		System.out.println(tokenizer.countTokens());
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
		
		System.out.println(tokenizer.countTokens()); // 토큰을 모두 소비해서 0이 찍힘
	}

	public void test3() {
		String str = "abcdefu";
		System.out.println(str.length());
		System.out.println(str.indexOf("cde")); // 해당 문자열이 몇번지에 있니?
		System.out.println(str.indexOf("xyz")); // 존재하지 않으면 -1을 반환한다.
		System.out.println(str.contains("cde")); // 해당 문자열을 포함하고 있니? true
		System.out.println(str.contains("xyz")); // false
		System.out.println(str.startsWith("ab")); // 문자열이 해당 문자열로 시작하니? true
		System.out.println(str.endsWith("xy")); // 문자열이 해당 문자열로 끝나니? false
		
		System.out.println(str.substring(2,5)); // "cde" (시작(포함)인덱스,끝(미포함)인덱스)
		System.out.println(str.substring(2)); // 시작(포함) 인덱스부터 끝까지
		
		System.out.println(str.replace("abc", "xyz")); //xyzdefu
		
		System.out.println(str); // 기존 str은 그대로임 substring 이나 replace는 새로운 문자열로 반환함
		
	}
	/**
	 * StringBuilder/StringBuffer는 사용법이 같다.
	 * 	- StringBuffer가 동기화 처리(thread-safe)를 지원하는 것만 다르다.
	 */
	public void test2() {
		StringBuffer sb = new StringBuffer("java");
		
		System.out.println(sb); // java
		System.out.println(sb.hashCode());
		
		sb.append("abc");
		
		System.out.println(sb);
		System.out.println(sb.hashCode()); // 값이 바꼈는데 hashCode가 동일하다
		
		
	}
	
	public void test1() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java"); // 원래 참조형을 객체화 하는 방법이지만 String은 예외
		String s4 = new String("java");
		
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s3 == s4); // false
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true
		System.out.println(s3.equals(s4)); // true
		
		// 문자열 변경
		s2 += "abc"; // "java" 는 그대로 두고 "javaabc"를 새로 생성한다.
		s4 += "abc"; // 기존에 생성된 "javaabc"를 공유한다.
		
		System.out.println(s1.hashCode()); // 3254818
		System.out.println(s2.hashCode()); // 3254818
		System.out.println(s3.hashCode()); // 3254818
		System.out.println(s4.hashCode()); // 3254818 -> hashCode가 모두 같다(Override법칙 : equals 값이 같다면 hashCode값도 같아야 한다)
		
		
	}
}
