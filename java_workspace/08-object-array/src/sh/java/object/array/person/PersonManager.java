package sh.java.object.array.person;

import java.util.Scanner;

/**
 * PersonMain 실행클래스
 * PersonManager 매니져(콘트롤러)클래스
 * Person DTO 클래스
 * 
 * -의존관계 Dependency (메소드에서 지역변수로 사용하고 있다)
 * 	PersonMain ----------> PersonManager
 *
 * -연관관계 Association (필드(전역변수)로 다른 타입을 사용하고 있다)
 *  PersonManager가 Person을 가지고 있다. (has-a 포함관계)
 *  PersonManager -----실선-----> Person	
 */
public class PersonManager {
	public static final int MAX_PERSON = 100;
	Person[] persons;
	private int index;
	Scanner sc = new Scanner(System.in);
	
	public PersonManager() {
		persons = new Person[MAX_PERSON];
	}
	
	
	public void inputPersons() {
		for(int i = 0; i < persons.length; i++) {
			persons[index++] = inputPerson();
			
			System.out.println("계속 입력하시겠습니까?(y/n) : ");
			if(sc.next().charAt(0) == 'n') {
				break;
			}
		}
	}
	
	private Person inputPerson() {
		Person person = new Person();
		System.out.print("이름 : ");
		person.setName(sc.next());
		System.out.print("나이 : ");
		person.setAge(sc.nextInt());
		System.out.print("결혼여부(true/false) : ");
		person.setMarried(sc.nextBoolean());
		
		return person;
	}

	public void printPersons() {
		for(int i = 0; i < index; i++) {
			System.out.printf("%d : %s\n", i+1, persons[i]);
		}
	}

	
}
