package com.exception.charcheck;

public class CharacterProcess {

	public CharacterProcess() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int countAlpha(String s){
		//문자열을 문자형배열에 넣기
		char[] charArr = s.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i < charArr.length; i++) {
			//공백문자 발생 시 Exception 발생시키기
			if(charArr[i] == ' ')
				throw new CharCheckException();
			//영문자 카운트
			if((charArr[i] >= 'a' && charArr[i] <= 'z')||(charArr[i] >= 'A' && charArr[i] <= 'Z')){
				count++;
			}
		}
		//결과 리턴
		return count;
	}
}
