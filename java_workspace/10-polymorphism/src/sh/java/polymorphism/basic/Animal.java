package sh.java.polymorphism.basic;
/**
 * 
 * 추상클래스(미완성클래스)
 * - 0개 이상의 추상메소드를 가진 클래스
 * - 객체화 할 수 없다. == 	new Animal() -> (X)
 * - 오직 자식클래스의 추상메소드 구현을 강제화할 목적으로 만드는 클래스
 * @author jangcccci
 *
 */
public abstract class Animal {
	/**
	 * 추상메소드(미완성메소드)
	 * - 자식클래스에서 구현을 강제하는 메소드
	 * - abstract 키워드 -> 클래스 앞에도 붙여줘야됨
	 * - 메소드 몸통 없음.	
	 */
	public abstract void say();

//	public void say() {
//		System.out.println("저는 동물입니다.");
//	}
	
	public abstract void attack();
}
