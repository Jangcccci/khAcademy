package com.sh.api.member.run;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.sh.api.member.model.vo.member.Member;

public class Run {

	public static void main(String[] args) {
		String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		StringTokenizer tokenizer = new StringTokenizer(str, "|");
		String[] strArr = new String[3];
		
		while(tokenizer.hasMoreTokens()) {
			for(int i = 0; i < strArr.length; i++) {
				strArr[i] = tokenizer.nextToken();
			}
		}
	
		Member[] members = new Member[3];

		for(int i = 0; i < members.length; i++) {
			StringTokenizer tokenizer1 = new StringTokenizer(strArr[i], ",");
		
			while(tokenizer1.hasMoreTokens()) {
					int memberNo = Integer.parseInt(tokenizer1.nextToken());
					String memberName = tokenizer1.nextToken();
					int hight = Integer.parseInt(tokenizer1.nextToken());
					int weight = Integer.parseInt(tokenizer1.nextToken());
					String birthDay = tokenizer1.nextToken();
					System.out.println(birthDay);
					int bYear = Integer.parseInt(birthDay.substring(0, 4));	
					int bMonth = Integer.parseInt(birthDay.substring(4, 6));
					int bDay = Integer.parseInt(birthDay.substring(6));
					Calendar birth = new GregorianCalendar();
					birth.set(bYear, bMonth, bDay);
				
					members[i] = new Member(memberNo, memberName, hight, weight, birth);
		}	
	}
		
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i].information());
		}
		
		
		
	}
}