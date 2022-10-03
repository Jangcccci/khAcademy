package sh.java.object.array.student;

public class StudentMain {

	public static void main(String[] args) {

		StudentManager manager = new StudentManager();
		
		manager.inputStudents(); // 학생정보 n명 입력
		manager.printStudents(); // 입력한 학생정보만 출력
		
		// 1번 홍길동 01012341234
		// 2번 신사임당 01044443333
		// ...
	}

}
