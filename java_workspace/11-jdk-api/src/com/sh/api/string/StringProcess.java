package com.sh.api.string;

public class StringProcess {

	public String preChar(String s) {
		String preChar = s.substring(0, 1).toUpperCase();
		return preChar + s.substring(1);
	}
	
	public int charSu(String s, char ch) {
		char[] chArr = s.toCharArray();
		int cnt = 0;
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == ch) {
				cnt++;
			}
		}
		return cnt;
	}
}
