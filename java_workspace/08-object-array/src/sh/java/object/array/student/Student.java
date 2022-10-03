package sh.java.object.array.student;

public class Student {

	private int no;
	private String name;
	private String phone;
	
	public Student() {}
	public Student(int no, String name, String phone) {
		this.no = no;
		this.name = name;
		this.phone = phone;
	}
	
	public String studentInfo() {
		return no + ", " + name + ", " + phone;
	}
}
