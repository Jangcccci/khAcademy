package sh.java.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * 자바에서 날짜를 관리하는 애덜
 * java.util.Date
 * java.uill.Calendar 
 * 
 * 1.8부터 지원
 * java.time.LocalDate
 * java.time.LocalDateTime
 * java.time.LocalTime
 *
 */
public class LocalDateTimeStudy {

	public static void main(String[] args) {
		LocalDateTimeStudy study = new LocalDateTimeStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();
	}
	
	/**
	 * @실습문제 : 사용자로부터 생일(년도, 월, 일)을 입력받고, 요일을 출력하세요.
	 * 	- 당신은 화요일에 태어나셨습니다.
	 * 
	 */
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출생 년도를 입력하세요 : ");
		int y = sc.nextInt();
		System.out.print("출생 월을 입력하세요 : ");
		int m = sc.nextInt();
		System.out.print("출생 일을 입력하세요 : ");
		int d = sc.nextInt();
		
		LocalDate day = LocalDate.of(y, m, d);
		String str = day.toString();
		LocalDate date = LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
		char[] dayOfWeek = {'월', '화', '수', '목', '금','토','일'};
		System.out.println(dayOfWeek[date.getDayOfWeek().getValue()-1]);		
	}
	
	/**
	 * 날짜 차이 구하기
	 * 1. ChronoUnit.DAYS.between(startInculsive:Temporal, end Exculsive:Temporal):long
	 * 2. LocalDate#until(endExculsive:ChronoLocalDate):Period
	 */
	public void test5() {
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.of(2022, 12, 25);
		
		long diff = ChronoUnit.DAYS.between(start, end);//(시작일(포함), 마지막일(미포함))
		System.out.println(diff);  
		
		Period period = start.until(end);
		System.out.println(period); // P2M26D
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
	}
	
	/**
	 * 특정형식으로 변환
	 * 
	 * DateTimeFormatter
	 */
	private void test4() {
		LocalDateTime now = LocalDateTime.now(); // 생성자가 private이므로 메소드를 통해서만 호출해야됨
		
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss")));
		// 두번씩 쓴 이유는 값이 0이라도 0으로 자리를 표현해달라는 이유 M = 1 ~ 12 / MM = 01 ~ 12
		// y 년도
		// M 월
		// d 일
		// H 시간(24)
		// m 분
		// s 초
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초")));
	}
	
	/**
	 * LocalTime
	 */
	
	private void test3() {
		LocalTime now = LocalTime.now();
		System.out.println(now);
	}
	/**
	 * LocalDateTime
	 */
	
	public void test2() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
	}
	
	/**
	 * LoclaDate
	 * 
	 */
	public void test1() {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek()); // DayOfWeek 객체반환
		System.out.println(today.getDayOfWeek().getValue()); // 월(1) 화(2) 수(3) 목(4) 금(5) 토(7)
		
		char[] dayOfWeek = {'월', '화', '수', '목', '금','토','일'};
		System.out.println(dayOfWeek[today.getDayOfWeek().getValue() - 1]);
		System.out.println(today.isLeapYear());
		
		LocalDate dday = LocalDate.of(2022, 12, 25);
		System.out.println(dday);
		System.out.println(dayOfWeek[dday.getDayOfWeek().getValue() - 1]);
		
	}
}
