package sh.java.oop.field;

public class Run {

	public static void main(String[] args) {
		IPhone14 phone1 = new IPhone14();
		
		phone1.setOwner("홍길동");
		phone1.setNumber("01012341234");
		System.out.println(phone1.info());
		
		IPhone14 phone2 = new IPhone14();
		
		phone2.setOwner("신사임당");
		phone2.setNumber("01099997777");
		System.out.println(phone2.info());
		
		phone1.callTo(phone2); // 홍길동이 심사임당에게 전화를 겁니다.
		
		IPhone14 phone3 = new IPhone14();
		
		phone3.setOwner("장원정");
		phone3.setNumber("01092185331");
		System.out.println(phone3.info());
		
		phone3.callTo(phone1);
		phone1.callTo(phone3);
		
		//static변수 사용법
		
//		IPhone14.WIDTH = 5.7;
//		IPhone14.HEIGHT = 17.7; => 상수기 때문에 final로 선언했으므로 오류난다.
		System.out.println("아이폰14의 너비는 " + IPhone14.WIDTH + "cm 입니다.");
		System.out.println("아이폰14의 높이는 " + IPhone14.HEIGHT + "cm 입니다.");
		
		System.out.println(phone3.WIDTH);//The static field IPhone14.WIDTH should be accessed in a static way
		//=> 호출되긴 하지만 클래스를 통해서 선언하는 것이 좋다.	
	}
}
