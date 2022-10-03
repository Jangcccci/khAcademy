package sh.java.polymorphism.basic;

import java.util.Random;

/**
 * 
 * 다형성(Polymorphism)
 * 	- 상속을 이용한 기술로, 자식객체를 부모타입의 참조변수에 담아 제어할 수 있는 기술
 *  
 *
 */
public class AnimalMain {

	public static void main(String[] args) {

		AnimalMain main = new AnimalMain();
//		main.test1();
//		main.test2();
//		main.test3();
//		main.test4();
//		main.test5();
//		main.test6();
//		main.test7();
//		main.test8();
		main.test9();
		
	}
	
	/**
	 * 인터페이스, 추상클래스는 new 연산자를 통해 객체화 할 수 없다.
	 * - 오직 자식클래스를 객체화 할 수 있다.
	 */
	public void test9() {
		Eagle eagle = new Eagle();
//		Animal animal = new Animal(); //Cannot instantiate the type
//		Runnable run = new Runnable(); //Cannot instantiate the type
	}
	
	/**
	 * @실습문제 : Eagle클래스(Animal상속, Flyable구현)
	 * 
	 * Flyable 인터페이스
	 * 	- fly:void 추상메소드
	 * 	- NUM_OF_WINGS = 2 상수
	 * 
	 */
	
	public void test8() {
		Eagle eagle = new Eagle();
		eagle.say();
		eagle.attack();
		eagle.fly();
	}
	
	/**
	 * 메소드구현(override) 강제화
	 * - 추상클래스의 추상메소드
	 * 	- 일반클래스 : 일반 필드/메소드를 가질 수 있다. (부모클래스를 쓸지 인터페이스를 쓸지 결정하는 기준)
	 * 
	 * - 인터페이스의 추상메소드
	 * 	- 규격을 제공할 목적으로 만든 변형 클래스
	 * 	- 추상메소드와 상수(public static final)만 가질 수 있다.
	 * 	- static 메소드, default메소드 추가(1.8부터)
	 * 
	 *   
	 */
	public void test7() {
		Animal tiger = new Tiger();
		Animal lion = new Lion();
		
		tiger.say();
		lion.say();
		tiger.attack();
		lion.attack();
		
		Runnable _tiger = new Tiger();
		Runnable _lion = new Lion();
		_tiger.run();
		_lion.run();
		
		((Animal)_lion).say();
		
		Tiger realTiger = new Tiger();
		realTiger.say();
		realTiger.attack();
		realTiger.run();
		
		Barkable barkTiger = new Tiger();
		Barkable barkLion = new Lion();
//		barkTiger.bark("어흥~");
//		barkLion.bark("어흥~");
		barkAction(new Tiger(), "어흥~");
		barkAction(new Lion(), "어흥~");
		
		Barkable[] barkAnimals = new Barkable[3];
		barkAnimals[0] = new Tiger();
		barkAnimals[1] = new Lion();
		barkAnimals[2] = new Tiger();
		
		for(Barkable b : barkAnimals) {
			b.bark("크아아악!");
		}
	}
	
	public void barkAction(Barkable barkAnimal, String sound) {
		barkAnimal.bark(sound);
	}
	
	public void test6() {
		Animal[] animals = new Animal[3];
		
		for(int i = 0; i < animals.length; i++) {
			animals[i] = generateAnimal();
			animals[i].say();
			animals[i].attack();
		}
	}
	/**
	 * 다형성과 Override	
	 * 정적바인딩
	 * - 어떤 메소드를 호출할지 작성된 타입에 의해 결정
	 * 동적바인딩
	 * - 다운캐스팅없이 자식클래스의 오버라이드된 메소드를 호출
	 * - 조건 : 오버라이드 + 다형성
	 * 
	 */
	public void test5() {
		Animal tiger = new Tiger();
		Animal lion = new Lion();
		
		tiger.say();
		lion.say();
		
		// downcasting 없이 Tiger#punch, Lion#kick 호출하기
		tiger.attack();
		lion.attack();
	}
	/**
	 * 리턴타입에서 다형성 활용하기
	 */
	public void test4() {
		Animal animal = generateAnimal();
		System.out.println(animal);
	}
	/**
	 * Tiger 객체 또는 Lion객체를 생성
	 * @return
	 */
	public Animal generateAnimal() {
		return new Random().nextBoolean() ? 
				new Tiger() : 
					new Lion();
	}
	/**
	 * 매개변수부에서 다형성 활용하기
	 */
	public void test3() {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		attack(tiger);
		attack(lion);
		
	}
	
//	public void attack(Tiger tiger) {} // 주석을 풀면 attack(Animal animal)메소드에도 담길 수 있지만 더 가까운 타입을 우선 호출한다.
//	public void attack(Lion lion) {}
	public void attack(Animal animal) { // 한 줄로 정리가능
		if(animal instanceof Tiger) {
			((Tiger)animal).punch();
		}else if(animal instanceof Lion) {
			((Lion)animal).kick();
		}
	}
	/**
	 * 다형성을 쓰는 이유 : 부모타입의 변수에 자식타입의 객체를 모두 담아 처리할 수 있다.
	 */
	public void test2() {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
//		Animal animal;
//		animal = tiger; //가능
//		animal = lion; //가능
		
		Animal[] animals = new Animal[3];
		animals[0] = new Tiger();
		animals[1] = new Lion();
		animals[2] = new Tiger();
		
		for(int i = 0; i < animals.length; i++) {
//			System.out.println(animals[i]);
			animals[i].say(); //가능
//			((Tiger) animals[i]).punch();//animals의 1번지는 Lion이기 때문에 오류남(형변환 불가능/ Tiger와 Lion은 상속관계가 아니기 때문에)
			
			// 객체 instancerof 클래스 : boolean
			// 현재 객체가 클래스에 담길 수 있니?	
			// instanceof 연산결과가 true라면 해당클래스로 무조건 형변환 할 수 있다. (ClassCastException이 발생하지 않음)
			if(animals[i] instanceof Tiger) {
				((Tiger)animals[i]).punch();
			}else if(animals[i] instanceof Lion) {
				((Lion)animals[i]).kick();
			}
		}
	}
	/**
	 * upcasting : 자식 타입을 부모타입으로 변환 (자동)
	 * downcasting : 부모 타입을 자식타입으로 변환 (명시적 형변환)
	 * 
	 * 자식객체가 부모타입의 변수에 대입되면, 부모타입의 멤버(필드/메소드)만 사용가능하다.
	 * 
	 */
	public void test1() {
		//upcasting
		Tiger tiger = new Tiger();
		Animal animal1 = tiger;
		//==Animal animal1 = Animal tiger;
		
		tiger.say();
		tiger.punch();
		
		animal1.say();
//		animal1.punch();
		
		//downcasting
		((Tiger) animal1).punch();// 형변환보다 .메소드가 우선순위가 높으므로 ()를 통해 형변환이 우선적으로 처리될 수 있게 처리
		Tiger anotherTiger = (Tiger) animal1;
		anotherTiger.say();
		anotherTiger.punch();
		
		Animal animal2 = new Lion();
		animal2.say();
//		animal2.kick();
		((Lion)animal2).kick();
		Lion anotherLion = (Lion) animal2;
		anotherLion.kick();
	}

}
