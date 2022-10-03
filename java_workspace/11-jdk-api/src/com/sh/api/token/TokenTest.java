package com.sh.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;








public class TokenTest {

	public static void main(String[] args) {
		String beforeStr = "J a v a P r o g r a m ";
		char[] beforeCharArr = beforeStr.toCharArray();
		
		//- 토큰 처리전 글자 출력
		System.out.printf("토큰 처리 전 : %s\n", Arrays.toString(beforeCharArr));
		
		//- 전 글자갯수 출력
		System.out.printf("토큰 처리 전 글자갯수 : %d\n", beforeCharArr.length);

		//토큰 처리
		StringTokenizer tokenizer = new StringTokenizer(beforeStr, " ");
		int index = 0;
		char[] afterCharArr = new char[11];
		while (tokenizer.hasMoreTokens()) {
			afterCharArr[index++] = tokenizer.nextToken().charAt(0);
		}
		
		//- 토큰 처리 후 글자갯수 출력 확인
		System.out.printf("토큰 처리 후 글자갯수 : %d\n", afterCharArr.length);

		//- char [] 값 출력
		System.out.printf("토큰 처리 후 : %s\n", Arrays.toString(afterCharArr));
		
		//- char [] 을 다시 String 으로 바꾼 후 
		String afterStr = new String(afterCharArr);
		//- 모두 대문자로 변환하여 출력
		System.out.printf("대문자로 변환 출력 : %s", afterStr.toUpperCase());
	}
}
