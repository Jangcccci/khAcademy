package sh.java.oop.field;

public class StudentMain {

	public static void main(String[] args) {
		KHStudent khs1 = new KHStudent();
		
		khs1.setName("장원정");
		khs1.setPhone("01092185331");
		khs1.info();
		
		KHStudent khs2 = new KHStudent();
		khs2.setName("이형진");
		khs2.setPhone("01011112222");
		khs2.info();
	}
}
