package member.controller;

import member.model.vo.other.Member;

public class MemberManager{

	public static final int MAX_MEMBER_COUNT = 40;
	Member[] member = new Member[MAX_MEMBER_COUNT];
	
	private int memberIndex;
	
	public void printData() {
		System.out.println("----------------------------------------<<회원정보>>-----------------------------------------");
		System.out.printf("%-15s %-15s %-15s %-15s\n", "이름","등급","포인트","이자포인트");
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i=0; i<memberIndex;i++) {
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", member[i].getName(), member[i].getGrade(), member[i].getPoint(), member[i].getInterestPoint());
		}
	}
	
	public void insertMember(Member member) {
		this.member[memberIndex++] = member;
	}
	
	public void printBuyInfo(int price) {
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i=0; i<memberIndex;i++) {
			System.out.printf("%s등급회원 %s는 %d원 상품을 %d원에 구매합니다.\n", member[i].getGrade(), member[i].getName(), price, member[i].buy(price));
		}
		System.out.println("------------------------------------------------------------------------------------------------");
	}
	
}
