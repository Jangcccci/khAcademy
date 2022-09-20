package sh.java.oop.student;

public class Student {

	//상태 - 클래스 영역에 작성
	private String name;
	private char gender;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	//행위
	public void study() {
		System.out.println(name +"이/가 공부하고 있습니다.");
	}
	
	public void introduce() {
		System.out.printf("안녕하세요 저는 [%s]입니다. [%d]살 [%c]자에요. 반갑습니다!\n", name, age, gender);
	}
}
