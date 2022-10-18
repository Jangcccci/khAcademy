package com.sh.io.test2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		StudentMain main = new StudentMain();
		main.test1();
		main.test2();
	}
	/**
	 * student.ser의 내용을 불러와(객체 읽어오기)
	 * 다음과 같이 출력
	 * 
	 * 1 홍길동 80 70 75.5
	 * 2 심사임당 90 50 70.0
	 */
	private void test2() {
		File file = new File("students.ser");
		
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			Object obj = ois.readObject();
			Student[] students = (Student[]) obj;
			for(Student student : students) {
//				System.out.println(student.getNo() + " " + student.getName() + " " + student.getKor() + " " + student.getEng() + " " + (double)(student.getKor()) + (double)(student.getEng())/2);
				System.out.printf("%d\t%s\t%d\t%d\t%.1f\n", student.getNo(), student.getName(), student.getKor(), student.getEng(), ((double)(student.getKor()) + (double)(student.getEng()))/2.0);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 *  학생 2명의 이름, 국어점수, 영어점수를 입력받아 학생객체를 생성하고, 배열에 추가.
	 *  - 생성된 배열을 students.ser에 저장 (객체 출력)
	 */
	private void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생1의 이름을 입력하세요 : ");
		String name1 = sc.next();
		System.out.print("학생1의 국어점수를 입력하세요 : ");
		int korScore1 = sc.nextInt();
		System.out.print("학생1의 영어점수를 입력하세요 : ");
		
		
		int engScore1 = sc.nextInt();
		System.out.print("학생2의 이름을 입력하세요 : ");
		String name2 = sc.next();
		System.out.print("학생2의 국어점수를 입력하세요 : ");
		int korScore2 = sc.nextInt();
		System.out.print("학생2의 영어점수를 입력하세요 : ");
		int engScore2 = sc.nextInt();
		
		
		int index = 0;
		Student[] students = {
				new Student(++index, name1, korScore1, engScore1),
				new Student(++index, name2, korScore2, engScore2)
		};
		
		File file = new File("students.ser");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
		
			oos.writeObject(students);
			System.out.println("파일 생성 완료!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
