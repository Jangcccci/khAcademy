package sh.java.inheritance.basic;

public class Parent {

	String name;
	int age;
	
	public void say() {
		System.out.println("애비다.");
	}
	
	public String info() {
		return "name = " + name + ", age = " + age;
	}
}
