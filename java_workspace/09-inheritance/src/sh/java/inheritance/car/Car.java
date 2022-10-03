package sh.java.inheritance.car;

import java.util.Objects;

public class Car {

	private String name;
	private String color;
	private int doorCnt;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, String color, int doorCnt) {
		super();
		this.name = name;
		this.color = color;
		this.doorCnt = doorCnt;
	}
	/**
	 * 복사생성자
	 * @param other
	 */
	public Car(Car other) {
		this.name = other.name;
		this.color = other.color;
		this.doorCnt = other.doorCnt;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoorCnt() {
		return doorCnt;
	}
	public void setDoorCnt(int doorCnt) {
		this.doorCnt = doorCnt;
	}
	
	@Override
	public String toString() {
		return "Car [name = " + name + ", color = " + color + ", doorCnt = " + doorCnt + "]";
	}
	/**
	 * 동등성 비교(원하는 컬럼값이 동일하다면 같은 객체로 간주한다)
	 * 
	 * 자바약속 : equals 비교결과가 true라면, hashCode값이 같아야 한다.
	 * 			(equals에 사용된 필드값 기준으로 hashCode를 재생성 해야한다)
	 * -equals와 hashCode는 같이 Override한다. (비교하는 필드가 동일)
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Car))
			return false;
		
		Car other = (Car) obj; // Car타입으로 강제 형변환
		
		if(this.name == null) {
			if(other.name != null)
				return false;
		}else {
			if(!this.name.equals(other.name))
			return false;
		}
		if(this.color == null) {
			if(other.color != null)
				return false;
		}else {
			if(!this.color.equals(other.color))
				return false;
		}
		if(this.doorCnt != other.doorCnt)
			return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.color, this.doorCnt);
	}
	/**
	 * Override ( == Method Overriding)
	 * 	- 상속받은 부모메소드를 재작성하는 것
	 * 	- 메소드 시그니처(접근제한자, 리턴타입, 메소드명, 매개변수 선언부, 예외)가 모두 동일해야 한다.
	 * 		- @Override 어노테이션을 통해 컴파일타임(==런타임/.java --> .class)에 체크!
	 * 	- 접근제한자는 상속받은 것보다 더 개방할 수 있다.
	 * 		- (private < / 아래의 이유로 의미없음) default(사실상 거의 사용하지 않음) < protected < public
   	 * 	- private/final 메소드는 override가 불가능하다. (상속할 수 없다)
   	 * 	- 선언부 예외를 일부만 던지거나 제거할 수 있다.
   	 * 	- 공변반환타입(1.5)	 : 부모메소드의 반환타입을 자식클래스 타입으로 변환 가능 
   	 * 
 	 * 복사생성자를 통한 clone처리
     * 
	 */
	
	@Override
	public Car clone() {// 공변반환타입 원래 반환타입은 Object였으나 Car로 변경
		return new Car(this);
	}
}
