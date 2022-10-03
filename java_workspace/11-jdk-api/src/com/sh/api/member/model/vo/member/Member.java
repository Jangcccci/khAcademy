package com.sh.api.member.model.vo.member;

import java.util.Calendar;

/**
 * - 회원 com.sh.api.member.model.vo.member
    - memberNo : int
    - memberName : String
    - height : int
    - weight : int
    - birth : Calendar
    + information() : String

 */
public class Member {

	private int memberNo;
	private String memberName;
	private int height;
	private int weight;
	private Calendar birth;
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Member(int memberNo, String membetName, int height, int weight, Calendar birth) {
		super();
		this.memberNo = memberNo;
		this.memberName = membetName;
		this.height = height;
		this.weight = weight;
		this.birth = birth;
	}
	
	


	public int getMemberNo() {
		return memberNo;
	}


	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public Calendar getBirth() {
		return birth;
	}


	public void setBirth(Calendar birth) {
		this.birth = birth;
	}


	public String information() {
		return memberNo + " " + memberName + " " + height + " " + weight + " " + birth.get(Calendar.YEAR) + "년" + birth.get(Calendar.MONTH) + "월" + birth.get(Calendar.DATE) + "일";
	};
}
