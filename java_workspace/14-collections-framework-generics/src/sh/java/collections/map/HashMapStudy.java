package sh.java.collections.map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sh.java.collections.list.Student;

public class HashMapStudy {

	public static void main(String[] args) {
		HashMapStudy study = new HashMapStudy();
//		study.test1();
		study.test2();
	}
	/**
	 * Map 요소 열람하기
	 * 	- 열람 : 모든 요소를 빠짐없이 보기
	 * - keySet : key값의 Set을 갖고 map의 모든 요소에 접근한다.
	 * 
	 * - entrySet
	 * 	- Entry타입 : 실제 Map의 key와 value를 묶어서 관리하는 타입(인터페이스)이다.
	 * 
	 * 
	 */
	private void test2() {
		Map<Integer, String> map = new HashMap<>();
		map.put(123, "홍길동");
		map.put(456, "신사임당");
		map.put(789, "유관순");
		
		System.out.println(map);
		
		// 1. keySet
		Set<Integer> keySet = map.keySet();
		
		// for each
		for(Integer key : keySet) {
			String value = map.get(key);
			System.out.println(key + "= " + value);
		}
		// iterator
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext()) {
			Integer next = iter.next();
			String value = map.get(next);
			System.out.println(next + "= " + value);
		}
		
		// 2. entrySet
		// Entry타입 : 실제 Map의 key와 value를 묶어서 관리하는 타입(인터페이스)이다. == 내부 인터페이스이다.
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		// for each
		for(Map.Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "= " + value);
		}
		
		// iterator
		Iterator<Map.Entry<Integer, String>> iter2 = entrySet.iterator();
		while(iter2.hasNext()) {
			Map.Entry<Integer, String> entry = iter2.next();
			System.out.println(entry.getKey() + "= " + entry.getValue());
		}
	}
	
	/**
	 * Map 
	 * - key와 value를 한 쌍으로 요소를 정리한다.
	 * - key를 통해 value를 찾는 방식이다.
	 * 	- 따라서 key는 중복될 수 없다.
	 * 		- set과 차이점 : 동일한 key로 요소를 등록하면 새로운 value로 덮어씌워진다.
	 * 
	 */
	private void test1() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		Map<Integer, Student> map2 = new HashMap<>();
		
		//요소추가
		// 반환값 : 중복된 요소가 없다면 null을 반환하고 중복된 요소가 있다면 제거된 vlaue가 반환된다.
		System.out.println(map.put("honggd", "홍길동"));
		System.out.println(map.put("sinsa", "신사임당"));
		System.out.println(map.put("today", LocalDate.now()));
		System.out.println(map.put("1234", 5678));
		System.out.println(map.put("honggd", "마길동")); // 홍길동
//		map.put(1234, 5678); // Value에는 어떤 타입이 오든지 상관없지만 Key는 타입을 맞춰야 한다.
		
		System.out.println(map); 
		// {sinsa=신사임당, 1234=5678, today=2022-10-06, honggd=마길동}
		// 중복은 덮어씌워진다.	
		// 순서를 저장하지 않는다. => LinkedHashMap으로 하면 된다.
		// Key값 기준 정렬을 하고 싶다 : TreeMap
		
		// 특정요소 가져오기
		System.out.println(map.get("honggd")); // 마길동
		System.out.println(map.get("today")); // 2022-10-06
		System.out.println(map.get("zzzzzzzzzz")); // 없는 key를 찾을 경우 null을 반환한다.
		
		// 특정요소 제거하기
		map.remove("today");
		
		System.out.println(map);
		// 저장된 요소의 갯수
		System.out.println(map.size());
		// 기존 맵의 요소 추가
//		Map<String, Object> anotherMap = new HashMap<>(map); // 생성자에 추가
//		System.out.println(anotherMap);
		Map<String, Object> anotherMap = new HashMap<>();
		anotherMap.putAll(map);
		System.out.println(anotherMap);
		
		// equals 오버라이드 되어 있음. 같은 요소를 가지고 있다면 true 반환
		System.out.println(map.equals(anotherMap)); // key와 value가 모두 같으면 true
		
		
	}
}
