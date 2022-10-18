package ncs.test3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTest {
	public static void main(String[] args) {
		LocalDate birth = LocalDate.of(1987, 5, 27);
		LocalDate now = LocalDate.now();
		Period period = birth.until(now);
		
		System.out.println("생일 : " + birth.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일")));
		System.out.println("현재 : " + now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
		System.out.println("나이 : " + period.getYears() + " 세");
	}
}
