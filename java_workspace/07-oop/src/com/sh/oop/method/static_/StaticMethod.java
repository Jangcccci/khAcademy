package com.sh.oop.method.static_;

import java.util.Arrays;
import java.util.Scanner;

public class StaticMethod {

	/**
	 * //static method
    //1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
    //메소드명 : toUpper(String) : String
  
    
    //2. 문자열(1)에서 전달받은 인덱스(2)의 문자를 전달받은 문자(3)로 변경하는 static 메소드
    //메소드명 : setChar(String, int, char) : String
    

    //3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
    //메소드명 : getAlphabetLength(String) : int
    
    
    //4. 전달한 문자열값을 하나로 합쳐서 리턴 
    //메소드명 : concat(String, String) : String
	 */
	
	//1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
	public String toUpper(String str) {
		return str.toUpperCase();
	}
	
	//2. 문자열(1)에서 전달받은 인덱스(2)의 문자를 전달받은 문자(3)로 변경하는 static 메소드
	public static String setChar(String str, int i, char ch) {
		
//		char[] arr = new char[str.length()];
//		for(int j = 0; j < str.length(); j++) {
//			arr[j] = str.charAt(j);
//		}
		char[] arr = str.toCharArray();
		arr[i] = ch;
		
		return Arrays.toString(arr);
	}
	
	//3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
	public int getAlphatlength(String str) {
		char[] arr = new char[str.length()];
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
//			arr[i] = str.charAt(i);
			char ch = str.charAt(i);
//			if((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
			if(Character.isUpperCase(ch)||Character.isLowerCase(ch)) {
				count++;
			}
		}
		return count;
	}
	
	//4. 전달한 문자열값을 하나로 합쳐서 리턴
	public String concat(String	str1, String str2) {
		return str1+str2;
	}
}
