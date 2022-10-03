package com.oop.employee.model.vo;

public class Employee {

	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonusPct;
	
	public Employee(){}
	
	public Employee(int empNo, String name, char gender, String phone){
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		
		this.bonusPct = 0.02;// 기본값처리 가능
	}
	
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonusPct){
		this(empNo, name, gender, phone);
		this.dept = dept;
		this.salary = salary;
		this.bonusPct = bonusPct;
	}
	
	public int getEmpNo() {
		return this.empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return this.gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getDept() {
		return this.dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public double getBonusPct() {
		return this.bonusPct;
	}
	public void setBonusPct(double bonusPct) {
		this.bonusPct = bonusPct;
	}
	
	public void printEmployee() {
		System.out.printf("%d, %s, %c, %s, %s, %d, %.2f\n",empNo,name,gender,phone,dept,salary,bonusPct);
	}
}
