package variables.com.sh.test;

public class Test1 {

	public static void main(String[] args) {
		// 객체 선언
		Test1 test = new Test1();
		// 메소드 호출
		test.variableTest();
	}
	
	public void variableTest() {
		int num1 = 100;
		long num2 = 999900000000L;
		char ch = 'A';
		String str = "Hello world";
		boolean bool = true;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bool);
	}
}
