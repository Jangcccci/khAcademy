package sh.java.oop.field;

/**
 * <전역변수> : 클래스 영역에 작성(메소드 밖)
 * 	- 여러 메소드에서 사용가능
 * 	- 클래스 변수 Class Variable(Static 변수)
 * 		-static 키워드가 있다. 공유가 목적이다!
 * 		-클래스당 하나만 선언.
 * 		-클래스명.클래스변수 (객체를 통해 접근하지 않는다)
 * 
 * 	- 인스턴스 변수 Instance Variable(non-static변수, 멤버변수)	
 * 		-static 키워드가 없다.
 * 		-생성된 객체마다(instance) 선언
 * 		-객체참조변수.필드명	
 * 
 * <지역변수> : 메소드 영역에 작성(매개변수도 지역변수다)
 * 	- 메소드 내부에서만 사용가능
 * 
 * 객체 == 메모리조각 == 필드뭉치
 * 
 * 변수별 생명주기 Life Cycle
 * ->생명주기가 짧을 수록 메모리 효율이 좋다.
 * - 지역변수 : 메소드 호출시 생성되고 메소드 리턴시 제거된다.
 * - 인스턴스변수 : 객체생성시 생성되고 객체 제거(GC)시 제거된다.
 * - 클래스변수 : 해당클래스 최초 사용시 생성되고 프로그램 종료시에 제거된다.
 *
 */
public class IPhone14 {
	
	//클래스 변수
	//보통 공유 목적의 상수로 사용한다. public static final
	//상수인 경우 초기화 필수!
	public static final double WIDTH = 5.7;
	public static final double HEIGHT = 17.3;
	//command + shift + x => 대문자 / +y => 소문자  
	

	
	//instance variable / non-static variable / 멤버변수
	private String owner;
	private String number;
	
	// getter/setter
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return this.owner;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumber() {
		return this.number;
	}
	
	public String info() {
		return "[" + this.owner + "]님의 핸드폰 입니다. 전화번호는 [" + this.number + "]입니다.";
	}
	
	public void callTo(IPhone14 to) {
		System.out.printf("%s이 %s에게 전화를 겁니다.", this.owner, to.owner);
		System.out.println();
	}
	//==같음
	public void callTo2(IPhone14 other) {
		String from = this.owner;
		String to = other.owner;
		System.out.printf("%s이 %s에게 전화를 겁니다.\n", from , to);
	}
}
