package sh.java.oop.method;

/**
 * Method overloading 
 * - 동일한 기능을 수행하는데 매개변수의 타입을 다르게 제공해야 할 때 사용.
 * - 메소드 이름은 같고 매개변수 선언부만 다른 형태의 메소드 묶음.
 * 
 * 성립조건 2가지
 *  1. 메소드 이름이 같고 매개변수 선언부(개수, 타입, 순서)가 어떻게든 달라야한다.
 *  2. 매개변수 명, 접근제한자, 리턴타입은 개의치 않는다.
 *  
 * JVM이 메소드를 호출함에 있어 모호하지 않게 하는 것이 중요하다!
 *
 */
public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading instance = new MethodOverloading();
		instance.test();
		instance.test(100);
		instance.test(100, 200);
		instance.test("안녕");
		instance.test("안녕", 100);
		instance.test(100, "안녕");
		System.out.println();
	}

	public void test() {}
	public void test(int a) {} // 메소드 이름이 같으면 오류가 나지만 매개변수만 변화하면 오류가 사라진다.
	public void test(int a, int b) {} // 매개변수 선언부의 개수가 달라도 가능하다.
	public void test(String str) {} // 매개변수 선언부의 타입이 달라도 가능하다.
	public void test(String str,  int x) {} // 매개변수 선언부의 개수가 달라도 가능하다.
	public void test(int x, String str) {} // 매개변수 선언부의 순서만 달라도 가능하다.
	public void test(char ch) {}
	public void test(char ch, double d) {}
	public void test(double d, char ch) {}
	public void test(char ch, double d, int i) {}
	public void test(char ch, int i, double d) {}
	
//	public void test(int m) {} // 매개변수 명이 다른 것은 개의치 않다.
//	private void test(int m) {} // 접근제한자는 상관하지 않는다.
//	public int test(int m) {return 0;}// 리턴타입은 상관하지 않는다.
}
