package net.kh.member.run;

import net.kh.member.model.Member;

public class Run {
	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.setMemberId("jangwonjung");
		member.setMemberPwd("123123");
		member.setMemberName("장원정");
		member.setAge(30);
		member.setGender('남');
		member.setPhone("01092185331");
		member.setEmail("wonjung5331@naver.com");
		
		System.out.println(member.getMemberId());
		System.out.println(member.getMemberPwd());
		System.out.println(member.getMemberName());
		System.out.println(member.getAge());
		System.out.println(member.getGender());
		System.out.println(member.getPhoe());
		System.out.println(member.getEmail());
		
	}
}
