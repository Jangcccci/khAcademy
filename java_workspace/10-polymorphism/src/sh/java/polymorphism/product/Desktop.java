package sh.java.polymorphism.product;

import java.util.Arrays;

/**
 * 
 * 상속
 * - 부모클래스가 가진 멤버(필드/메소드)를 자식클래스에서 선언없이 사용할 수 있도록 한다.
 * - 자식 클래스의 공통된 코드(중복된 코드)를 부모 클래스에서 효율적으로 관리할 수 있다.
 * 
 * 상속의 특징
 * - 부모의 멤버(필드/메소드)를 자식클래스에서 선언없이 접근
 * - 부모의 private멤버는 상속을 받았으나 직접 접근이 안됨.
 * 	-public메소드를 통해 제어
 * 	-super 부모생성자를 호출해서 부모클래스 안에서 값설정함.
 * 
 * - 모든 클래스는 Object클래스의 후손이다.
 * 	- == Object의 모든 메소드를 모든 클래스에서 사용가능함.
 * 	- 예) toString(), hashCode(), equals()
 * 	- extends 부모클래스 선언이 없다면, extends Object가 생략된 형태.
 * - 부모클래스의 생성자/초기화 블럭은 상속되지 않는다.
 * 	-자식 클래스에서 별도로 작성해야됨.
 * - 물려받은 메소드를 자식클래스에 따라 Override할 수 있다.
 * 	-단, 메소드시그니처가 동일해야 한다.
 * 
 * 모든 생성자는 첫줄에 this()또는 super()를 무조건 호출한다.
 * 	- 아무것도 적혀있지 않다면 super()가 생략된 것이다.
 * 
 * 
 * @author jangcccci
 *
 */
public class Desktop extends Product{
	
	private String os;
	private String[] hardwares;
	public Desktop() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * 물려받은 private필드에 직접접근할 수 없다.
	 * 
	 * @param productCode
	 * @param productName
	 * @param brand
	 * @param price
	 * @param os
	 * @param hardwares
	 */
	public Desktop(String productCode, String productName, String brand, int price, String os, String[] hardwares) {
//		this.productCode = productCode;
//		this.productName = productName;
//		this.brand = brand;
//		this.price = price;
		//위 방법은 private 필드이기 때문에 접근이 되지 않는다.
		
//		this.setProductCode(productCode);
//		this.setProductName(productName);
//		this.setBrand(brand);
//		this.setPrice(price);
		//위 방법이 가능하나 부모생성자 호출을 통해서 하는 것이 더 간단하다.
		
		//부모생성자 호출을 통해 private필드값 설정
		//super() 호출도 생성자 맨 첫줄에 단 한번 사용가능 / this()와 중복안됨
		super(productCode, productName, brand, price);
		
		this.os = os;
		this.hardwares = hardwares;
	}
	
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String[] getHardwares() {
		return hardwares;
	}
	public void setHardwares(String[] hardwares) {
		this.hardwares = hardwares;
	}
	
	public String desktopInfo() {
		return super.productInfo() + ", os = " + os + ", hardwares = " + Arrays.toString(hardwares);
	}
	@Override
	public String productInfo() {
		return desktopInfo();
		
	}
}
