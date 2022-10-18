package variables.com.sh.test;

public class Test2 {

	
	public static void main(String[] args) {
		// 객체 생성
		Test2 test = new Test2();
		// 메소드 호출
		test.variableTest();
	}
	
	public void variableTest() {
		String name = "홍길동";
		int age = 22;
		char gender = '남';
		String phone = "01012341234";
		String email = "hgd@naver.com";
		String address = "경기도 광주시";
		
		
		System.out.printf("=======================================================================\n"
						 +"이름        나이    성별       전화번호            이메일            주소\n"
						 +"=======================================================================\n"
						 +"%s%9d%6s%17s%18s%12s%n", name, age, gender, phone, email, address);
		// 변수 재사용
		name = "홍길순";
		age = 20;
		gender = '여';
		phone = "01012342341";
		email = "hgs@gmail.com";
		address = "전라남도 광주시";
		System.out.printf("%s%9d%6s%17s%18s%12s", name, age, gender, phone, email, address);
	}
	
}


