package sh.java.oop.constructor;

import java.time.LocalDate;


/**
 * 생성자 메소드
 * - 객체생성 시에 new연산자를 통해 호출하는 메소드. 
 * - 객체의 필드값 초기화 처리
 * 
 * User user = new User();
 *                   |-> 얘가 생성자
 *                  
 * - 클래스명과 생성자명은 동일해야 한다.
 * - 리턴타입이 없어야한다.
 * 
 * - JVM이 제공하는 기본생성자(매개변수(parameter) 없는 애)	 자동생성기능
 * - 매개변수 있는 생성자를 하나라도 작성한다면 JVM은 기본생성자를 자동으로 만들어 주지 않는다.
 * 	-> 직접 작성해야한다.	
 * 
 * - 기본생성자/모든 파라미터생성자를 무조건 작성할 예정
 * 
 * 기본생성자가 필요한 이유
 * - 상속시 자식객체에서 부모생성자를 호출. 없으면 오류!
 * - 웹서버 프로그램 사용시 기본생성자를 호출해서 객체자동생성. 없으면 오류!	
 * 
 */
public class User {
	
	//필드
	private String userId;
	private String userPw;
	private String userName;
	private LocalDate createdAt;
	
	// 생성자
	public User() {
		System.out.println("User생성자가 호출되었습니다.");
	}
	
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	
	public User(String userId, String userPw, String userName, LocalDate createdAt) {
//		this.userId = userId;
//		this.userPw = userPw;
		this(userId, userPw);//다른 생성자 호출 :첫 줄에 단 한번만 사용가능
		this.userName = userName;
//		this(userId, userPw);//오류남
		this.createdAt = createdAt;
	}
	
	//메소드
	public String userInfo() {
		return "userId = " + userId + ", userPw = " + userPw + ", userName = " + userName +
				", creatAt = " + createdAt;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String id) {
		this.userId = id;
	}
	
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String pw) {
		this.userPw = pw;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String name) {
		this.userName = name;
	}
	
	public LocalDate getCreateAt() {
		return createdAt;
	}
	public void setCreatAt(LocalDate date) {
		this.createdAt = date;
	}
}
