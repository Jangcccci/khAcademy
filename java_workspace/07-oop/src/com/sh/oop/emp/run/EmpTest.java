package com.sh.oop.emp.run;

import java.util.Scanner;

import com.sh.oop.emp.model.Employee;

/**
 * 
 * * 실행용 클래스 : com.sh.oop.emp.run.EmpTest 메뉴작성 : 메소드 작성
 * 
 * =>메뉴 화면의 예 public void mainMenu(){} 사원 정보 관리 프로그램 ************
 * 
 * 1. 새 사원 정보 입력 => empInput() 메소드 실행 
 * 2. 사원 정보 삭제 => 사원객체 참조변수에 null대입할 것. 
 * 3. 사원정보 출력 => empOutput() 메소드 실행 
 * 9. 끝내기
 ********************************************
 * @author jangcccci
 *
 */

public class EmpTest {

	public static void main(String[] args) {
		EmpTest empTest = new EmpTest();
		Employee emp = new Employee();
		Scanner scanner = new Scanner(System.in);

		for (;;) {
			empTest.mainMenu();
			System.out.print("원하는 메뉴를 선택해주세요 : ");
			int choice = scanner.nextInt();
			
			
			switch(choice) {
			case 1 : emp.empInput();break;
			case 2 : empTest.subMenu(emp);
					 break;
				
			case 3 : emp = null; System.out.println(emp);break;
			
			case 4 : if(emp !=null){
				emp.empOutput();break;
				}else {
					System.out.println(emp);
					break;
				}
			
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			
			default : System.out.println("잘못입력하셨습니다.");break;
			
			}
		}

	}

	public void mainMenu() {
		System.out.println("******* 사원 정보 관리 프로그램 ************");
		System.out.println();
		System.out.println("1. 새 사원 정보 입력");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 삭제");
		System.out.println("4. 사원정보 출력");
		System.out.println("9. 끝내기");
		System.out.println("****************************************");
	}
	
	public void subMenu(Employee emp) {
		Scanner scanner = new Scanner(System.in);
		
		for(;;){
		
			System.out.println("********** 사원 정보 수정 메뉴 **********");
			System.out.println("1. 이름 변경 => setEmpName()");
			System.out.println("2. 급여 변경 => setSalary()");
			System.out.println("3. 부서 변경 => setDept()");
			System.out.println("4. 직급 변경 => setJob()");
			System.out.println("5. 이전 메뉴로 이동 => return 처리할 것");
			System.out.print("원하는 메뉴를 선택해주세요 : ");
			
			int choice2 = scanner.nextInt();
			
			switch(choice2) {
				case 1 : System.out.print("수정할 이름을 입력해주세요 : ");
					 	 String str1 = scanner.next(); 
					 	 emp.setEmpName(str1); 
					 	 break;
				case 2 : System.out.print("수정할 급여를 입력해주세요 : ");
						int num = scanner.nextInt(); 
						emp.setSalary(num); 
						break;
				case 3 : System.out.print("수정할 부서를 입력해주세요 : ");
						 String str2 = scanner.next(); 
						 emp.setDept(str2); 
						 break;
				case 4 : System.out.print("수정할 직급을 입력해주세요 : ");
						 String str3 = scanner.next(); 
						 emp.setJob(str3); 
						 break;
				case 5 : System.out.println("이전 메뉴로 이동합니다."); return;
				default : System.out.println("잘못입력하셨습니다.");break;
				}
			}
	}
	
	

}
