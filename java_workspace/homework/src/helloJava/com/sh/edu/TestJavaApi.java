package helloJava.com.sh.edu;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestJavaApi {

	public static void main(String[] args) {
		TestJavaApi tja = new TestJavaApi();
		tja.apiTest();
	}

	public void apiTest() {
		// Date, LocalDate 클래스 객체 생성
		Date date = new Date();
		LocalDate localdate = LocalDate.now();

		// 포맷에 맞춰서 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(date));
		System.out.println(localdate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
	}
}
