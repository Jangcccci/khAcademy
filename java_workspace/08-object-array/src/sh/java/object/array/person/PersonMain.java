package sh.java.object.array.person;

import java.util.Scanner;

public class PersonMain {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PersonMain main = new PersonMain();
//		main.test1();
//		main.test2();
//		main.test3();
//		main.test4();
		main.test5();
	}
	
	/**
	 * 실행클래스
	 * 매니저클래스 - Person[]을 관리(사용자입력값으로 Person객체 만들기, Person배열 출력하기...)
	 * DTO클래스
	 */
	public void test5() {
		PersonManager manager = new PersonManager();
		manager.inputPersons();
		manager.printPersons();
	}
	
	/**
	 * n명의 person객체 관리하기
	 */
	public void test4() {
		Person[] arr = new Person[100];
		int index = 0; // 다음 person 객체 index | 이제까지 입력된 person객체 수
		
		//입력부
		for(int i = 0; i < arr.length; i++) {
			
			arr[index++] = inputPerson();
			
			System.out.print("계속 입력하시겠습니까?(y/n) : ");
			if(sc.next().charAt(0) == 'n') {
				break;
			}
		}
		
		//출력부
		
//		for(Person person : arr) {
//			if(person != null)
//				System.out.println(person);
			//위 코드는 100번 돌지만 아래는 입력한 만큼만 돌기때문에 더 효율적이다.
//			if(person == null) {
//				break;
//			}
//			System.out.println(person);
//		}
		//index를 이용한 출력
		for(int i = 0; i < index; i++) {
			System.out.println(arr[i].personInfo());
		}
	}

	/**
	 * refactoring
	 * - 작동하는 코드를 대상으로 중복제거/변수명으로 직관적으로 변경등을 통해 코드 효율성/가독성을 높이는 것!
	 * 
	 */
	public Person inputPerson() {
		Person person = new Person();
		System.out.print("이름 : ");
		person.setName(sc.next());
		System.out.print("나이 : ");
		person.setAge(sc.nextInt());
		System.out.print("결혼여부(true/false) : ");
		person.setMarried(sc.nextBoolean());
		
		return person;
	}
	/**
	 * 사용자입력값으로 Person 객체배열 생성
	 */
	public void test3() {
		
		Person[] arr = new Person[3];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("이름 : ");
			String name = sc.next();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("결혼여부(y/n) : ");
			boolean married = sc.next().charAt(0) == 'y' ? true : false;
			
			
			
			Person person = new Person(name, age, married);
			arr[i] = person;
//			arr[i] = new Person(name, age, married);
			System.out.println("---------------------");
		}
		
		for(Person person : arr)
			System.out.println(person.personInfo());
	}

	/**
	 * 객체배열 초기화
	 *  - 배열변수선언 - 배열객체할당 - 인덱스별객체할당
	 *  
	 */
	public void test2() {
		Person[] arr = {
				new Person("홍길동", 33, false),
				new Person("심사임당", 48, true),
				new Person("이순신", 41, true),
		};
		
		for(Person person: arr) {
			System.out.println(person.personInfo());
		}
	}
	
	
	/**
	 * 객체배열
	 */
	public void test1() {
		//배열 참조변수 선언
		Person[] arr;
		//배열객체 할당
		arr = new Person[3];
		//인덱스별 Person객체 할당
		arr[0] = new Person("홍길동", 33, false);
		arr[1] = new Person("심사임당", 48, true);
		arr[2] = new Person("이순신", 41, false);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d : %s\n", i, arr[i].personInfo());
		}
	}
}
