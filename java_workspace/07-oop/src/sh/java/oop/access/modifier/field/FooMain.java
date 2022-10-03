package sh.java.oop.access.modifier.field;

public class FooMain {

	public static void main(String[] args) {
		Foo foo = new Foo();
		
		System.out.println(foo.a);
		System.out.println(foo.b);
		System.out.println(foo.c);
//		System.out.println(foo.d); // private : 클래스 외부에서 접근불가
		
		foo.k();
		foo.l();
		foo.m();
//		foo.n(); //private메소드라서 클래스 외부에서 접근불가!
	}

}
