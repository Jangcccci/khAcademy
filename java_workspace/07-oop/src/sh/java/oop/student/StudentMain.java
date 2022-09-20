package sh.java.oop.student;

/**
 * 객체란?	
 *- 클래스를 바탕으로 new연산자를 사용해 메모리에 적재된 결과물.
 *
 *클래스
 *- 상태 : 정적인 값 field (이름, 나이, 키, 몸무게, 아이디, 비밀번호, 주소...)
 *- 행위 : 동적인 처리를 담당. method (회원가입, 로그인, 상품주문, 정보설정, 정보가져오기...)
 *
 *하나의 클래스를 가지고 n개의 객체 생성가능(갯수 제한이 없다)
 *- Student클래스를 갖고 철수 학생객체, 영희 학생객체, ...를 만들 수 있다.
 *- 거꾸로 말하면 여러 학생객체를 관리하기 위해서 클래스를 사용할 수 있다.
 *
 *클래스 설계
 *-작성하고자 하는 프로그램에 따라 클래스는 특정상태와 특정행위를 가진다.
 *->학생관리 프로그램 - 이름, 성별, 학년, 반, 번호, 과목별 점수...
 *->학생인적성 프로그램 - 이름, 성별, 학년, 반, 번호, 취미, 가정환경, 상담내용...
 *->쇼핑몰 프로그램 - 아이디, 비밀번호, 이름, 나이, 구매내역, 배송지, 회원등급...
 *...	
 *
 *추상화 Abstraction
 *- 사전적 의미 : 구체적 사물의 공통된 특징(폴더정리)
 *- 프로그래밍적 의미 : 프로그램에 필요한 기능(행위)/속성(상태)을 호출하고 불필요한 것을 제거하는 과정
 *
 *객체 지향 3대 특징
 *1. 캡슐화 (Encapsulation)
 *
 *-캡슐화 원칙
 *-> 필드의 접근제어자를 private로 한다.
 *-> 필드 + 메소드를 같이 클래스에 작성
 *-> 메소드의 접근제어자는 public으로 한다.
 *2. 상속 (Inheritance)
 *3. 다형성
*/

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student();
		// 상태
		student1.setName("김철수");
		student1.setGender('남');
		student1.setAge(15);
		System.out.println(student1.getName());
		System.out.println(student1.getGender());
		System.out.println(student1.getAge());
		//행위
		student1.study();
		student1.introduce();
		
		//하나의 클래스에 여러개의 객체를 만들 수 있다.
		//하나의 클래스지만 객체당 다른 메모리 조각을 할당한다.
		Student student2 = new Student();
		student2.setName("이영희");
		student2.setGender('여');
		student2.setAge(17);
		System.out.println(student2.getName());
		System.out.println(student2.getGender());
		System.out.println(student2.getAge());
		
		student2.study();
		student2.introduce();
		
		Student student3 = new Student();
		student3.setName("장원정");
		student3.setGender('남');
		student3.setAge(30);
		System.out.println(student3.getName());
		System.out.println(student3.getGender());
		System.out.println(student3.getAge());
		student3.study();
		student3.introduce();
	}
}
