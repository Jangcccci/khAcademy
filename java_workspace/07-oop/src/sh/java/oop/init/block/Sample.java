package sh.java.oop.init.block;

/**
 * 초기화블럭
 * -전역변수의 값대입을 위한 코드 실행블럭
 * 	1. 인스턴스변수용 초기화블럭
 * 
 *		인스턴스변수의 값대입 절차
 *			1. 타입별 기본값 대입
 *			2. 명시한 초기값 대입
 *			3. 초기화블럭의 값대입
 *			4. 생성자메소드의 값대입
 * 
 *  2. 클래스변수용 초기화블럭
 *  
 *  	클래스변수의 값대입 절차
 *  		1. 타입별 기본값 대입
 *  		2. 명시한 초기값 대입
 *  		3. static 초기화블럭의 값대입
 *
 */
public class Sample {
//	int num; //=> 0 
	int num = 1; //=> 1
//	static int snum; => 0
	static int snum = 9;
	
	
	{
		System.out.println("[초기화블럭 실행전] : " + num);
		
		//인스턴스변수의 초기화 블럭
		num = 2;

		System.out.println("[초기화블럭 실행후] : " + num);
	}
	
	static {
		//클래스변수의 초기화 블럭
		System.out.println("[static초기화블럭 실행전] : " + snum);
		snum=99;
		System.out.println("[static초기화블럭 실행후] : " + snum);
	}
	
	/**
	 * 생성자 메소드
	 * -new연산자에 의해 호출되는 메소드
	 * -리턴타입이 없고 클래스명과 반드시 동일해야함
	 */
	public Sample() {
		System.out.println("[생성자메소드 실행전] : " + num);
		num = 3;
		System.out.println("[생성자메소드 실행후] : " + num);
		
		System.out.println(Sample.snum);
	}
}
