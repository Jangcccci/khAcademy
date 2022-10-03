package sh.java.polymorphism.basic;

public class Eagle extends Animal implements Flyable{
	
	@Override
	public void fly() {
		System.out.println("이글이 " + NUM_OF_WINGS + "개의 날개로 비행합니다.");
	}
	
	@Override
	public void say() {
		System.out.println("저는 이글입니다.");
	}
	
	@Override
	public void attack() {
		peck();
	}
	
	public void peck() {
		System.out.println("이글이 쪼았습니다.");
	}

}
