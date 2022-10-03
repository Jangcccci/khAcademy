package com.sh.api.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalcYourDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("생일을 입력해주세요(예 1993, 08, 03) : ");
		String birth = sc.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(birth, ", ");

		int round = 0;
		while (tokenizer.hasMoreTokens()) {
			if (round == 0) {
				birth = tokenizer.nextToken();
				round++;
			} else {
				birth += tokenizer.nextToken();
			}
		}
		
		int birthYear = Integer.parseInt(birth.substring(0, 4));
		int birthMonth = Integer.parseInt(birth.substring(4, 6));
		int birthDay = Integer.parseInt(birth.substring(6));
		
		LocalDate start = LocalDate.of(birthYear, birthMonth, birthDay);
		LocalDate end = LocalDate.now();
		
		long day = ChronoUnit.DAYS.between(start, end);
		System.out.printf("당신은 태어난지 %d일 되셨습니다", day);

	}
}
