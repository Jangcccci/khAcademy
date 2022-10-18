package sh.java.collections.list;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ArrayListStudy {

	public static void main(String[] args) {

		ArrayListStudy study = new ArrayListStudy();
		
//		study.test0();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
//		study.test7();
		study.test8();
		study.test9();
		
	}
	
	
	private void test9() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(3, "이순신"));
		list.add(new Student(4, "논개"));
		list.add(new Student(2, "신사임당"));
		list.add(new Student(1, "홍길동"));
		
		// equals 오버라이드 전 : false / 객체가 다르기 때문이다. / 오버라이드 후 : true
		System.out.println(list.contains(new Student(1, "홍길동"))); 
		
		
	}
	/**
	 * Stack
	 * - LIFO (Last In First Out)
	 * - 마지막에 들어온 요소가 가장 먼저 제거된다.
	 * - 입출구가 하나로 되어있는 상자에서 물건을 꺼낸다고 생각하면 된다.
	 * 
	 * - push
	 * 
	 * - pop
	 */
	
	private void test8() {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.peek()); // 꺼내지 않고, 맨 위의 요소만 출력
			System.out.println(stack.pop()); // 제거하고 제거한 걸 출력하는 메소드
		}
	}
	
	
	/**
	 * Queue
	 * - FIFO First In First Out
	 * - 먼저 들어온 요소가 먼저 제거되는 형태
	 * 
	 * - 요소 추가시 offer(맨 뒤에 추가)
	 * - 요소 제거시 poll(맨 앞에서 제거)	
	 * - 일자로 된 통로에 입출구가 양 끝에 있다고 생각하면 될 듯
	 */
	private void test7() {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(5);
		queue.offer(2);
		queue.offer(3);
		queue.offer(7);
		
		System.out.println(queue);
		
//		System.out.println(queue.poll());
//		System.out.println(queue);
//		System.out.println(queue.poll());
//		System.out.println(queue);
		
		queue.offer(4);
		queue.offer(1);
		
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		while(!queue.isEmpty()) { // queue가 비어있지 않니?
			System.out.println(queue.poll());
		}
	}
	
	/**
	 * LinkedList
	 * - 배열처럼 연속된 공간에 존재하지 않고, 요소와 다음 요소의 참조주소로 연결된 형태이다.
	 * - 중간에 요소 추가, 수정, 삭제가 빈번하게 일어나는 데이터라면 ArrayList대비 성능이 좋다.
	 * - 검색기능에서는 ArrayList 대비 성능이 좋지 않다.
	 * - 다루는 메소드는 ArrayList와 동일하다.
	 * 
	 */
	private void test6() {
		List<String> list = new LinkedList<>();
	}
	
	/**
	 * 정렬
	 * 
	 * - 클래스별 기본정렬은 무조건 한 가지만 갖는다.
	 * 	- 해당 클래스에서 Comparable 인터페이스를 구현한다. (compareTo메소드 오버라이드)
	 * - 한 가지 외 정렬(n가지)은 Comparator구현클래스 작성필요
	 * 	- 정렬을 뒤집기하는 Comparator객체는 jdk에서 제공한다.
	 * 	- 별도의 Comparator 구현 클래스를 작성한다. (compare 메소드 오버라이드)
	 * 
	 * 
	 */
	private void test5() {
		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(3);
		intList.add(4);
		intList.add(2);
		intList.add(1);
		
		System.out.println(intList);
		
		// 오름차순 정렬
		intList.sort(null);
		
		System.out.println(intList);
		
		// 내림차순 정렬
		Comparator<Integer> comp = Collections.reverseOrder();
		intList.sort(comp);
		
		System.out.println(intList);
		
		List<String> strList = new ArrayList<>();
		strList.add("홍길동");
		strList.add("이길동");
		strList.add("조길동");
		strList.add("고길동");
		System.out.println(strList);
		
		// 오름차순 정렬 (사전등재순)
		Collections.sort(strList);
//		== strList.sort(null);
		System.out.println(strList);
		
		// 내림차순 정렬
		Comparator<String> strComp = Collections.reverseOrder();
		strList.sort(strComp);
		// == strList.sort(Collections.reverseOrder());
		// == Collections.sort(strList, Collections.reverseOrder());
	
		System.out.println(strList);
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(3, "이순신"));
		list.add(new Student(4, "논개"));
		list.add(new Student(2, "신사임당"));
		list.add(new Student(1, "홍길동"));
		
		System.out.println(list);
		
		// 오름차순 정렬
		
//		list.sort(); // 오류남
//		Collections.sort(list); // 역시 오류남	(이유 : Student 클래스에서 Comparable 클래스를 구현하고 compareTo 메소드를 오버라이드하지 않았기 때문이다.
		
		// 구현 및 오버라이드 후 
		list.sort(null); // 
		System.out.println(list);
		
		// 내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		// name 기준으로 정렬하기
		
		Comparator<Student> snac = new StudentNameAscComparator(); // 객체를 만들어서 담아도 되지만 어차피 메소드 하나밖에 없어서 굳이;;
		
		// 오름차순
		Collections.sort(list, snac); // 기본 정렬이 아니라서 별도의 comparator 객체를 만들고 compare 메소드를 오버라이드 했다.
//		== list.sort(new StudentNameAscComparator());
		System.out.println(list);
		
		// 내림차순
//		list.sort(Collections.reverseOrder(new StudentNameAscComparator()));
		Collections.sort(list, Collections.reverseOrder(new StudentNameAscComparator()));
		
		System.out.println(list);
	}
	
	private void test4() {
		List<String> list = new ArrayList<String>();
//		== List<String> list = new ArrayList<>();
		// 추가
		list.add("안녕");
		list.add(0, "Hello");
		list.add("포크레인");
		list.add("머그컵");
		list.add("잘가");
		
		//수정
		list.set(1, "잘가");
		System.out.println(list);
		
		//제거
//		System.out.println(list.remove(1)); // 제거된 요소를 반환한다.
		System.out.println(list.remove("잘가가")); // 해당 요소를 찾아서 제거한 경우 true 반환하고 해당 요소가 없으면 flase를 반환한다.	
		
		//가져오기
		System.out.println(list.get(0));
		
		//요소 포함여부 확인
		System.out.println(list.indexOf("잘가")); // 해당 요소가 있으면 요소의 인덱스, 없으면 -1을 반환한다.
		System.out.println(list.indexOf("잘잘가")); 
		System.out.println(list.lastIndexOf("잘가"));
		
		System.out.println(list.contains("잘가")); // 해당 요소가 있는지 없는지 boolean값을 반환한다. true
		
		System.out.println(list);
		//다른 리스트의 요소를 한번에 추가
		List<String> another = new ArrayList<>();
		another.add("abc");
		another.add("def");
		another.add("xyz");
//		list.addAll(another); // 맨 뒤에 추가된다.
		list.addAll(0, another); // 맨 앞에 추가된다.
		
		System.out.println(list);
		
		// 열람 (모든 요소에 접근)
		// 1. 일반 for문
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 2. for each문
		for(String str : list) {
			System.out.println(str);
		}
		// 3. Interator	객체
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String next = iter.next();
			System.out.println(next);
		}

		// 모든 요소제거
		list.clear(); // 반환값이 없다.
		
		// 현재 list가 비어있는가?
		System.out.println(list.isEmpty()); // 요소가 없으면 true 있으면 false
		
		
		System.out.println(list);
	}
	/**
	 * 
	 * test0을 Student[] -> ArrayList<String>으로 변환해서 같은 기능을 수행!	
	 */
	private void test3() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "홍길동"));
		students.add(new Student(2, "심사임당"));
		students.add(new Student(3, "이순신"));
		// 유관순 추가
		students.add(new Student(4, "유관순"));
		// 세종대왕 중간넣기
		students.add(2, new Student(22, "세종대왕"));
		// 1번지 지우기
		students.remove(1);
		
		System.out.println(students);
	}
	/**
	 * generics
	 * - compile-time에 타입제한기능
	 * - 요소 추가시에 타입체크가 가능하다.
	 * - 요소를 꺼냈을 때 해당 타입의 값을 보장한다.
	 * 
	 * jdk1.7부터는 우항의 제네릭은 생략가능!
	 * 
	 */
	private void test2() {
//		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list = new ArrayList<>(); // 우항의 제네릭 생략가능!
		list.add("안녕");
		list.add("잘가");
//		list.add(123); // String이 아니라서 오류! 타입체크 가능
		
		String s = list.get(0);
		
		List<Integer>list2 = new ArrayList<Integer>(); // <>에 int 기본형은 올 수 없다.
		list2.add(1); // auto-boxing 1 -> Integer.valueOf(1)
		list2.add(2);
		list2.add(3);
		list2.add(2);
		list2.add(1);
		
		for(Integer i : list2) {
			System.out.println(i);
		}
		
		System.out.println(list2.get(0) + list2.get(1)); // Integer + Integer => 객체끼리 연산처리 안됨 / auto-unboxing => Integer#intValue + Integer#intValue => int + int
	}
	/**
	 * List - ArrayList / LinkedList
	 * 
	 * - 순서 유지/저장
	 * - 중복 허용
	 */
	private void test1() {
		ArrayList list1 = new ArrayList();
		List list2 = new ArrayList(); // 제일 많이 사용
		Collection list3 = new ArrayList();
		
		list2.add("안녕하세요");
		list2.add("123");
		list2.add("45.67");
		list2.add(true);
		list2.add(LocalDate.now());
		list2.add(true);
		list2.add("45.67");
		
		System.out.println(list2);
		
		System.out.println(list2.size()); // 현재 저장된 요소의 개수
		
//		System.out.println(list2.get(0));
//		System.out.println(list2.get(1));
//		System.out.println(list2.get(2));
//		System.out.println(list2.get(3));
//		System.out.println(list2.get(4));
//		System.out.println(list2.get(5));
//		System.out.println(list2.get(6));
		
		list2.add(2, "zzzz"); // 특정 인덱스에 추가
		System.out.println(list2.size());
		
		list2.remove(1); // 특정 인덱스 삭제시 내부 정리요소작업을 해준다.
		
		list2.set(4, LocalDateTime.now()); // 특정 인덱스 덮어쓰기
		
		
		for(int i = 0; i < list2.size(); i ++) {
			System.out.println(i + " : " + list2.get(i));
		}
		
		for(Object obj : list2) {
			System.out.println(obj);
		}
	}
	/**
	 * 
	 * 배열의 한계
	 * 
	 */
	private void test0() {
		Student[] students = {
				new Student(1, "홍길동"),
				new Student(2, "신사임당"),
				new Student(3, "이순신")
		};
		
		//학생 마지막에 추가
		//확장된 크기의 배열 생성/복사
		Student[] students2 = new Student[10];
		System.arraycopy(students, 0, students2, 0, students.length);
		
		students2[3] = new Student(4, "유관순");
		
		//학생 중간에 추가
		students2[4] = students2[3];
		students2[3] = students2[2];
		students2[2] = new Student(22, "세종대왕");
		
		//학생 중간에 삭제
		students2[1] = students2[2];
		students2[2] = students2[3];
		students2[3] = students2[4];
		students2[4] = null;
		System.out.println(Arrays.toString(students2));
	}

}
