package com.sh.api.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalcDday {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("D-Day 시작일을 입력하세요(yyyyMMdd) : ");
		String a = sc.next();
		LocalDate start = LocalDate.of(Integer.parseInt(a.substring(0, 4)), Integer.parseInt(a.substring(4, 6)), Integer.parseInt(a.substring(6)));
		
		System.out.print("D-Day 종료일을 입력하세요(yyyyMMdd) : ");
		String b = sc.next();
		LocalDate end = LocalDate.of(Integer.parseInt(b.substring(0, 4)), Integer.parseInt(b.substring(4, 6)), Integer.parseInt(b.substring(6)));
		
		long days = ChronoUnit.DAYS.between(start, end);
		if(days > 0) {
			System.out.println(days + "일 남았습니다.");
		}else if(days == 0) {
			System.out.println("D-Day입니다.");
		}else {
			System.out.println(days + "일 지났습니다.");
		}
	}
}
