package sh.java.collections.list;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private int no;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
	/**
	 * 특정 필드를 기준으로 정수값을 반환한다.
	 * - this.no < other.no 면 음수를 반환한다.
	 * - this.no == other.no 면 0을 반환한다.
	 * - this.no > other.no 면 양수를 반환한다.	 
	 *
	 */
	@Override
	public int compareTo(Student other) { // Comparable의 <>를 지정하지 않으면 Object가 온다.
		// no 오름차순 기준 정렬
		return this.no - other.no;
		// no 내림차순 기준 정렬
//		return this.no - other.no;
	}

	
	// 주소값 비교에서 필드값 비교로 바꾸기
//	@Override
//	public boolean equals(Object obj) {
//		Student other = (Student) obj;
//		if(this.no != other.no) 
//			return false;
//		if(!this.name.equals(other.name))
//			return false;
//		return super.equals(obj);
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}
	
	
}
