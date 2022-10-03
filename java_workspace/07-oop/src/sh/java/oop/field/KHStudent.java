package sh.java.oop.field;


/**
 * 
 * KH학생정보를 관리하기 위한 KHStudent 클래스 설계
 * -우리반 학생정보만 관
 * 
 * 교육원명 academy name "KH정보교육원"
 * 과정명 cource name "JAVA기반 공공데이터 융합 개발자 양성과정"
 * 강의장명 classroom 'M'
 * 학생명 name
 * 전화번호 phone
 *
 */
public class KHStudent {

	public static final String ACADEMY_NAME = "KH정보교육원";
	public static final String COURCE_NAME = "JAVA기반 공공데이터 융합 개발자 양성과정";
	public static final char CLASSROOM = 'M';
	
	private String name;
	private String phone;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void info() {
		//같은 클래스 내부에서는 클래스 명을 생략하고 클래스 변수 사용가능
		System.out.printf("%s의 %s을 %c에서 수료하고 있는 %s이고 전화번호는 %s입니다.\n", ACADEMY_NAME, COURCE_NAME, CLASSROOM, this.name, this.phone);
	}
	
}
