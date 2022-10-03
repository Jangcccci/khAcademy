package sh.java.inheritance.shape;

/**
 * Circle | Shape
 * 	- 일반화관계 : Circle에서 Shape로 일반화(추상화)되었다.
 * 	- Circle(자식)이 Shape(부모)을 상속한다.
 * 	- Circle is a Shape. -> is-a 상속관계
 * 	- 부모클래스의 멤버(필드/메소드)를 자식클래스인 것처럼 사용가능.
 * 	- 하나의 클래스만 상속가능
 * 
 * Circle | Point
 *	- Circle이 Point를 필드로 가지고 있다. (연관관계)
 *	- Circle has a Point -> has-a 포함관계
 *	- Point필드의 기능을 필드.메소드 호출을 통해 이용가능.
 *	- 개수제한없이 필드를 가질 수 있다.
 *
 * Override ( == Method Overriding)
 * 	- 상속받은 부모메소드를 재작성하는 것
 * 	- 메소드 시그니처(접근제한자, 리턴타입, 메소드명, 매개변수 선언부, 예외)가 모두 동일해야 한다.
 * 		- @Override 어노테이션을 통해 컴파일타임(==런타임/.java --> .class)에 체크!
 * 	- 접근제한자는 상속받은 것보다 더 개방할 수 있다.
 * 		- (private < / 아래의 이유로 의미없음) default(사실상 거의 사용하지 않음) < protected < public
 * 	- private/final 메소드는 override가 불가능하다. (상속할 수 없다)
 * 	- 선언부 예외를 일부만 던지거나 제거할 수 있다.
 * 
 */
public class Circle extends Shape{

	private Point center; //중심점
	private int r; //반지름
	
	public Circle() {}
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	public Point getCenter() {
		return this.center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public void draw() {
//		System.out.println("중심점이 (" + center.getX() + ", " + center.getY() + ")이고 "
//							+ "반지름이 " + this.r + "인 원을 그린다...");
		System.out.println("중심점이 " + this.center + "이고 "
				+ "반지름이 " + this.r + "인 원을 그린다...");
	}
	
	@Override
	public double getArea() {
		return r * r * Math.PI;
	}
	
}
