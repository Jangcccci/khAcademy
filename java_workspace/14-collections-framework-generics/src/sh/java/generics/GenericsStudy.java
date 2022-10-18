package sh.java.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsStudy {

	/**
	 * Generic
	 * - 클래스 레벨 : 변수타입이나 객체생성 시 작성해서 객체요소의 타입을 제한한다.
	 * - 메소드 레벨 : 파라미터/리턴타입에 타입을 제한할 수 있다.
	 */
	public static void main(String[] args) {
		GenericsStudy study = new GenericsStudy();
//		study.test1();
		study.test2();
	}
	/**
	 * 메소드 레벨
	 */
	private void test2() {
		int sum = run(10);
		String str = run("abc");
		
		System.out.println(sum);
		System.out.println(str);
		
		List<Integer> intList = of(1, 2, 3, 4);
		System.out.println(intList);
		
		List<String> strList = of("안녕", "잘가");
		System.out.println(strList);
		
		// Arrays.asList, List.of : 변경불가한 list를 반환
		List<String> strList2 = List.of("안녕", "잘가");
//		strList2.add("zzzz"); // 오류남 : 변경불가하기 때문이다.
	}
	
	private <E> List<E> of(E... elems) {
//		List<E> lise = new ArrayList();
//		for(E e : elems) {
//			listt.add(e);
//		}
		return Arrays.asList(elems);
	}
	public <T> T run(T t) { // <T> 메소드레벨의 제네릭 : 매개변수 T타입의 값을 반환한다.	
		return t;
	}
	
	/**
	 * 클래스 레벨
	 */
	private void test1() {
		Box<String> strBox = new Box<>();
		strBox.add("hello");
		strBox.add("world");
		
		System.out.println(strBox.get(0));
		System.out.println(strBox.get(1));
		
		for(int i = 0; i < strBox.size(); i++) {
			System.out.println(strBox.get(i));
		}
		
		System.out.println(strBox.indexOf("hello"));
	}
}
