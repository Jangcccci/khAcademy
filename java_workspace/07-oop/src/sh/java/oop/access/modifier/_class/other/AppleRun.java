package sh.java.oop.access.modifier._class.other;
import sh.java.oop.access.modifier._class.Apple;

public class AppleRun {

	public static void main(String[] args) {

		Apple apple = new Apple(); // public Class
		
		//다른 패키지라서 import를 사용한다고 해도 아예 사용불가
//		PineApple pineapple = new PineApple(); // default Class
//		Tomato tomato = new Tomato(); // default Class
	}

}
