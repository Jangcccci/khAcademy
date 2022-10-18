package sh.java.collections.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import sh.java.collections.list.Student;

public class HashSetStudy {

	public static void main(String[] args) {
		HashSetStudy study = new HashSetStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
	}
	/**
	 * 
	 * lotto 생성
	 * - 1~45 사이의 중복없는 난수 6개를 생성
	 * 
	 */
	private void test5() {
		Set<Integer> lotto = new TreeSet<>();
		Random rnd = new Random();
		
		for(;;) { //== for(;lotto.size < 6;)
			lotto.add((int) (Math.random()*45+1));
			
			if(lotto.size() == 6)
				break;
		}
		
//		List<Integer> lottoList = new ArrayList<>(lotto);
//		lottoList.sort(null);
//		System.out.println(lottoList);
		System.out.println(lotto);
		
	}
	
	/**
	 * LinkedHashSet
	 * - 저장한 순서를 유지해준다.
	 * 
	 * TreeSet
	 * - Compaerable을 구현한 요소에 대해 기본정렬기능 제공
	 * 
	 */
	private void test4() {
		Set<String> nameSet = new LinkedHashSet<>();
		nameSet.add("마동석");
		nameSet.add("송중기");
		nameSet.add("비비");
		nameSet.add("김다미");
		System.out.println(nameSet); // [마동석, 송중기, 비비, 김다미] : 저장한 순서를 유지해준다.
		
		Set<String> namTreeSet = new TreeSet<>();
		namTreeSet.add("마동석");
		namTreeSet.add("송중기");
		namTreeSet.add("비비");
		namTreeSet.add("김다미");
		System.out.println(namTreeSet); // [김다미, 마동석, 비비, 송중기] : 사전 등재순으로 유지해준다.
		
	}
	
	/**
	 * 커스텀클래스의 중복처리
	 * 
	 */
	private void test3() {
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student(1, "홍길동"));
		studentSet.add(new Student(2, "신사임당"));
		studentSet.add(new Student(1, "홍길동"));
		
		System.out.println(studentSet); 
		// hashCode 오버라이드 전
		//[Student [no=2, name=신사임당], Student [no=1, name=홍길동], Student [no=1, name=홍길동]]
		// : 중복제거가 되지 않는다. / 내부적으로 비교할 때 hashCode를 참조해서 비교하기 때문이다. hashCode 오버라이드를 equals 오버라이드 할 때 같이 해줘야한다.
		// hashCode 오버라이드 후
		// [Student [no=1, name=홍길동], Student [no=2, name=신사임당]]

	}
	/**
	 * List -> Set : 중복을 없애기 위해 변환한다.
	 * 
	 * Set -> List : 순서를 사용하기 위해 변환한다. (정렬)
	 * 
	 */
	private void test2() {
		List<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(1);
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
		list = new LinkedList<>(set);
		System.out.println(list);
		System.out.println(list.get(2));
	}
	
	/**
	 * 
	 * Set
	 * - 중복을 절대 허용하지 않는다.
	 * - 순서유지를 하지 않는다.
	 * 
	 */
	private void test1() {
		HashSet<Integer> set = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		Collection<Student> set3 = new HashSet<>();
		
		set2.add("안녕");
		set2.add("잘가");
		set2.add("가을");
		set2.add("하늘");
		set2.add("안녕");
		set2.add("안녕");
		
		System.out.println(set2); // [잘가, 가을, 안녕, 하늘] : 중복을 허용하지 않고 입력 순서도 보장하지 않는다.
		System.out.println(set2.size()); // 4
		
		System.out.println(set2.remove("안녕")); //true
		System.out.println(set2);
		
		// 특정 요소를 갖고 올 수는 없고 전체 열람이 가능하다.
		// for each문
		for(String str : set2) {
			System.out.println(str);
		}
		// Iterator 객체
		Iterator<String> iter = set2.iterator();
		while(iter.hasNext()) {
			String next = iter.next();
			System.out.println(next);
		}
		
		// clear : 모든 요소 제거
		set2.clear();
		// isEmpty
		System.out.println(set2.isEmpty());
	}
}
