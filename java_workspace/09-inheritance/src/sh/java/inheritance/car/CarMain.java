package sh.java.inheritance.car;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car("소나타", "블랙", 4);
		System.out.println(car);
		System.out.println(car.hashCode());
//		System.out.println(car.toString());
		
		
		Car car2 = new Car("소나타", "블랙", 4); // 동일하진 않지만 동등하다.
		System.out.println(car2);
		System.out.println(car2.hashCode());
		/*
		 * identity 동일성(같은 객체인가/주소값이 같은가) / == 동일성 비교
		 * equality	동등성(값이 같은가) / equals메소드를 오버라이드해서 동등성 비교
		 */
		
		System.out.println(car == car2); // false
		System.out.println(car.equals(car2));// Override 전에는 동일성 비교이기 때문에 false가 출려되므로 Override해야됨
		System.out.println(car.hashCode() == car2.hashCode());
		
		//clone
		Car car3 = car.clone();
		System.out.println(car == car3);
		System.out.println(car.equals(car3));
		System.out.println(car.hashCode() == car3.hashCode());
	}
}
