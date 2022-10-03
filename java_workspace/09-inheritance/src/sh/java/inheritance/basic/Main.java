package sh.java.inheritance.basic;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.name = "고길동";
		parent.age = 33;
		parent.say();
		System.out.println(parent.info());
		
		Child child = new Child();
		child.name = "고새롬";
		child.age = 15;
		child.say();
		System.out.println(child.info());
		child.game();
		
		GrandChild grandchild = new GrandChild();
		grandchild.name = "고설";
		grandchild.age = 3;
		grandchild.say();//Override 전 Parent, Child클래스에서 모두 상속받았지만 가장 가까운 상속 클래스인 Child클래스 꺼를 가져오게 된다.
		System.out.println(grandchild.info());
		
		Child2 child2 = new Child2();
		child2.name = "고명재";
		child2.age = 20;
		child2.say();
		System.out.println(child2.info());
		//Child2는 Child와 같이 Parent에게 상속받았지만 둘은 아무 관계가 없다.
		
	}

}
