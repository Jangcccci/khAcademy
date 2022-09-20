package com.sh.oop.emp.model;

import java.util.Scanner;

/**
 * 
 * <객체실습>
클래스명 : com.sh.oop.emp.model.Employee

    - 사원정보 관리용 클래스
    - Field 작성 : 캡슐화 반드시 적용함

    사번 : - empNo:int
    이름 : - empName:String
    소속부서 : - dept:String
    직급 : - job:String
    나이 : - age:int
    성별 : - gender:char
    급여 : - salary:int
    보너스포인트 : - bonusPoint:double
    핸드폰 : - phone:String
    주소 : - address:String

Employee 클래스의 메소드 작성
1. 키보드입력용 메소드 : empInput()
2. emp객체 모든 필드 출력용 메소드 : empOutput()
3. getter/setter메소드


 * @author jangcccci
 *
 */
public class Employee {
//	Employee emp = new Employee();

	//필드값
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	
	//getter setter
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	public String getJob() {
		return job;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	

	
	Scanner sc = new Scanner(System.in);
	
	
	
	public void empInput() {
		System.out.print("사번 : ");
//		setEmpNo(sc.nextInt());
		this.empNo = sc.nextInt();
		System.out.print("이름 : ");
		setEmpName(sc.next());
		System.out.print("소속부서 : ");
		setDept(sc.next());
		System.out.print("직급 : ");
		setJob(sc.next());
		System.out.print("나이 : ");
		setAge(sc.nextInt());
		System.out.print("성별 : ");
		setGender(sc.next().charAt(0));
		System.out.print("급여 : ");
		setSalary(sc.nextInt());
		System.out.print("보너스포인트 : ");
		setBonusPoint(sc.nextDouble());
		System.out.print("핸드폰 : ");
		setPhone(sc.next());
		sc.nextLine();
		System.out.println("주소 : ");
		setAddress(sc.nextLine());
		
		}
	
	
	
	public void empOutput() {
		System.out.printf("사번 : %d\n", getEmpNo());
		System.out.printf("이름 : %s\n", getEmpName());
		System.out.printf("소속부서 : %s\n", getDept());
		System.out.printf("직급 : %s\n", getJob());
		System.out.printf("나이 : %d\n", getAge());
		System.out.printf("성별 : %c\n", getGender());
		System.out.printf("급여 : %d\n", getSalary());
		System.out.printf("보너스포인트 : %f\n", getBonusPoint());
		System.out.printf("핸드폰 : %s\n", getPhone());
		System.out.printf("주소 : %s\n", getAddress());
	}
}

