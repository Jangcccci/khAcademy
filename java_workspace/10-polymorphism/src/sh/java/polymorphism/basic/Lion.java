package sh.java.polymorphism.basic;

public class Lion extends Animal implements Runnable, Barkable{
	
	@Override
	public void bark(String sound) {
		System.out.println("라이언이 " + sound + "했습니다.");
	}
	
	@Override
	public void run() {
		System.out.println("라이언이 " + NUM_OF_LEGS + "발로 달립니다.");
	}

	public void kick() {
		System.out.println("라이언 킥!!!");
	}
	
	@Override
	public void say() {
		System.out.println("저는 라이언입니다.");
	}
	
	@Override
	public void attack() {
		kick();
	}
}
