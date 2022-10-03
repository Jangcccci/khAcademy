package sh.java.polymorphism.basic;

public class Tiger extends Animal implements Runnable, Barkable{
	
	@Override
	public void bark(String sound) {
		System.out.println("타이거가 " + sound + "했습니다.");
	}
	
	@Override
	public void run() {
		System.out.println("타이거가 " + Runnable.NUM_OF_LEGS + "발로 달립니다.");//Runnalble. 생략가능
	}

	
	public void punch() {
		System.out.println("타이거 펀치!");
	}
	
	@Override
	public void say() {
		System.out.println("저는 타이거입니다.");
	}
	
	@Override
	public void attack() {
		punch();
	}
}
