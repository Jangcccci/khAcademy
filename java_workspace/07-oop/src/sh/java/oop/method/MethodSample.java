package sh.java.oop.method;

public class MethodSample {
	
	private int n = 10;
	private static int s = 99;
	
	public static void main(String[] args) {
		MethodSample sample = new MethodSample();
		System.out.println(sample.n); //10
		System.out.println(MethodSample.s); //99
		sample.print(); //10 99
		System.out.println(sample.n);//20
		MethodSample.test(); //99
	}
	
	/**
	 * 인스턴스메소드(non-static메소드 / 멤버메소드)
	 * -인스턴스변수/클래스변수 모두 사용이 가능
	 * -현재객체를 의미하는 숨은 this참조변수를 갖는다.
	 * ->sample.print(); => this = sample
	 */
	public void print() {
		System.out.println(this.n); //10
		System.out.println(s); //99
		this.n += 10;
		
		//static메소드 호출가능
//		MethodSample.test();
//		test();
	}
	
	/**
	 * 클래스메소드(static메소드)
	 * -객체를 만들지 않고, 클래스명.test()으로 호출!
	 * -클래스변수만 접근가능!
	 * -this 참조변수가 없다. (객체로 접근하지 않기 때문에)
	 */
	public static void test() {
//		System.out.println(n);//Cannot make a static reference to the non-static 
		//인스턴스변수는 객체가 생성된 뒤에 생성되므로 static메소드에서 사용하지 못한다(생명주기가 다름)
//		print();//같은 이유로 사용불가
		System.out.println(s); //99
	}
}
