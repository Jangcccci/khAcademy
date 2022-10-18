package com.sh.collection.map.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 1. 다음 회원 정보를 Map<String, Member>에 저장후, 출력하세요.

회원 Map은 필드로 지정하고, MemberTest 생성자에서 map에 요소 추가할 것.

 * @author jangcccci
 *
 */
public class MemberTest {
	private Map<String, Member> memberMap = new HashMap<>();

	public MemberTest() {
		super();
		memberMap.put("honggd", new Member("honggd", "1234", "홍길동", 35, "01012341234"));
		memberMap.put("sinsa", new Member("sinsa", "1234", "신사임당", 50, "01012341234"));
		memberMap.put("leess", new Member("leess", "1234", "이순신", 43, "01012341234"));
		memberMap.put("yooon", new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
		memberMap.put("jangbg", new Member("jangbg", "1234", "장보고", 29, "01012341234"));
	}

	public static void main(String[] args) {
		MemberTest mt = new MemberTest();
		mt.test1();
		mt.test2();
		mt.test3();
		mt.test4();
		mt.test1();
	}
	
	private void test4() {
		memberMap.remove("sinsa");
	}
	
	private void test3() {
		memberMap.put("yooon", new Member("yooon", "5678", "윤동주", 27, "01034563456"));
		System.out.println(memberMap.get("yooon"));
		}
	
	private void test2() {
		System.out.println(isUserExist("jangbg"));
		System.out.println(isUserExist("sejong"));
	}
	
	public boolean isUserExist(String userId) {
		if(memberMap.get(userId) != null)
			return true;
		else
			return false;
	}
	
	private void test1() {
		System.out.println("==================================================");
		System.out.println("아이디    비밀번호    이름        나이    전화번호");
		System.out.println("--------------------------------------------------");
		Set<Map.Entry<String, Member>> memberSet = memberMap.entrySet();
		
		Iterator<Map.Entry<String, Member>> iter = memberSet.iterator(); 
		while(iter.hasNext()) {
			Map.Entry<String, Member> entry = iter.next();
			System.out.println(entry.getValue());
		}
		System.out.println("--------------------------------------------------");
	}
}
