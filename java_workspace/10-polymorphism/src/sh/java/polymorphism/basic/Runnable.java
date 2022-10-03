package sh.java.polymorphism.basic;

import java.io.Serializable;

/**
 * 
 *  인터페이스의 추상메소드
 * - 오직 상수와 추상메소드만 가질 수 있다.
 * - 다중구현이 가능하다.
 * - 인터페이스간의 상속은 extends키워드를 사용 -> 다중상속가능
 * 
 * @author jangcccci
 *
 */
public interface Runnable extends Barkable, Serializable {

	public static final int NUM_OF_LEGS = 4;
	// == int NUM_OF_LEGS = 4;로 앞에 부분을 생략할 수 있다.
	public abstract void run();
	// == void run();
	
}
