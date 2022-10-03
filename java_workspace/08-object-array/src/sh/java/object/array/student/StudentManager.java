package sh.java.object.array.student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {

	Scanner sc = new Scanner(System.in);
	private final int MAX_STUDENT = 100;
	Student[] arr = new Student[MAX_STUDENT];
	private int index;
//	Student student = new Student();

	public StudentManager() {
	}

	public void inputStudents() {

		for (int i = 0; i < MAX_STUDENT; i++) {
			arr[index++] = inputStudent();

			System.out.print("계속 하시겠습니까?(y/n) : ");
			boolean choice = sc.next().charAt(0) == 'y' ? true : false;
			if (choice == false)
				break;
		}
	}

	public Student inputStudent() {
		Student student = new Student();
		System.out.print("학번 : ");
		int no = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("핸드폰번호 : ");
		String phone = sc.next();
		student = new Student(no, name, phone);

		return student;
	}

	public void printStudents() {
		for (int i = 0; i < index; i++) {
			System.out.printf("%d. %s\n", i + 1, arr[i].studentInfo());			
		}
	}
}
