package com.sh.api.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TodayTest {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("오늘은 " + now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일")) + "입니다.");
	}
}
