package com.sh.api.string;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringProcess strPro = new StringProcess();
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println(strPro.preChar(str));
		System.out.print("찾을 문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		System.out.println(strPro.charSu(str, ch));
	}
}
