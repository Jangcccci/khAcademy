package sh.java.inheritance.basic;

/**
 * 자바에서는 단일상속만 지원한다.
 *- Parent클래스와 Child클래스 필드 메소드 모두 사용가능 
 *
 */
public class GrandChild extends Child{

	@Override
	public void say() {
		System.out.println("손자입니다.");
	}
}
