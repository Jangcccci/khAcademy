package sh.java.operator;

/*
` : backtick
~ : tilde
^ : carot
& : ampersand
* : astarique
- : hyphen dash
_ : underscore
/ : slash
\ : backslash
 */
public class OperatorStudy {

	public static void main(String[] args) {

		OperatorStudy study = new OperatorStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
//		study.test7();
		study.test8();

	}

	/**
	 * 복합대입연산(산술대입) - += - -= - *= - /= - %=
	 */
	public void test8() {
		int m = 10;

//		m = m + 2;
		m += 2;//12
		
		m -= 5;//7
		
		m *= 5;//35
		
		m /= 8;//4
		
		m %= 3;//1
		
		System.out.println(m);
	}

	/**
	 * 삼항연산자 조건식 ? 참일때 사용할 값 : 거짓일때 사용할 값
	 */
	public void test7() {
		int a = 10;
		int b = 20;
		int c = (a > b) ? a : b;
		System.out.println(c);

		// 출력 a 가 짝수면, a 출력, a+1 출력
		int result = (a % 2 == 0) ? a : a + 1;
		System.out.println(result);

		// 중첩
		int d = (a > b) ? a : (b > a ? b : 0);
		System.out.println(d);

//		int d = (a > b) ? 
//				a : 
//					(b > a ? b : 0);
//		System.out.println(d);
	}

	/**
	 * 논리연산자 연
	 */

	public void test6() {

		int x = 3;
		int y = 10;
		int a = 10;
		int b = 100;

		// 최종결과가 참인 조건식 5개

		System.out.println(y == a && y > x);
		System.out.println(y > x && y < b);
		System.out.println(x < a || y > b);
		System.out.println(x != y || a == b);
		System.out.println(a < b && x != y);

		// 최종결과가 거짓인 조건식 5개

		System.out.println(y == a && y > x);
		System.out.println(x > y || a > b);
		System.out.println(y != a && a < b);
		System.out.println(b > a && x == y);
		System.out.println(b == a || x > y);
	}

	/**
	 * 이항연산자 - 논리비교연산 - 좌항/우항 모두 논리값이 와야한다. - && AND 좌우항이 모두 참인 경우, 참 - \\ OR 좌우항중
	 * 하나라도 참이면, 참
	 * 
	 */

	public void test5() {
		int a = 1;
		int b = 1;

		// && AND - 좌항이 false 면 우항을 검사하지 않음
		System.out.println(a > 0 && b > 0);
		System.out.println(a > 0 && b == 0);
		System.out.println(a == 0 && b > 0);
		System.out.println(a == 0 && b == 0);

		System.out.println(a == 0 && b++ > 0);
		System.out.printf("a = %d, b = %d\n", a, b);
		System.out.println(a == 0 && b++ == 0);
		System.out.printf("a = %d, b = %d\n", a, b);

		// \\ OR - 좌항이 true 면 우항을 검사하지 않음
		System.out.println(a > 0 || b > 0);
		System.out.println(a > 0 || b == 0);
		System.out.println(a == 0 || b > 0);
		System.out.println(a == 0 || b == 0);

		System.out.println(a > 0 || b++ > 0);
		System.out.printf("a = %d, b = %d\n", a, b);
		System.out.println(a > 0 || b++ == 0);
		System.out.printf("a = %d, b = %d\n", a, b);

		// & AND
		// 좌항이 거짓이어도 우항을 검사하는 AND 연산자
		System.out.println(a == 0 && b++ > 0);
		System.out.printf("a = %d, b = %d\n", a, b);

		// | OR
		// 좌항이 참이어도 우항을 검사하는 OR 연산자
		System.out.println(a > 0 || b++ == 0);
		System.out.printf("a = %d, b = %d\n", a, b);
	}

	/**
	 * 이항연산자 - 비교연산
	 */

	public void test4() {

		int a = 5;
		int b = 3;

		System.out.println(a > b);// 크다 gt(Greater than)좌항 위주로 읽어야함!!(b가 a보다 작다 X!!)
		System.out.println(a < b);// 작다 lt(Less than)
		System.out.println(a >= b);// 크거나 같다 ge(Greater than or Eaual to)
		System.out.println(a <= b);// 작거나 같다 le(Less than or Eaual to)

		// 동등비교연산

	}

	/**
	 * 이항연산자 - 산술연산
	 */
	public void test3() {

		int a = 10;
		int b = 4;

		int result = a + b;
		System.out.println(result);

		result = a - b;
		System.out.println(result);

		result = a * b;
		System.out.println(result);

		result = a / b;// 몫
		System.out.println(result);

		result = a % b;// 나머지
		System.out.println(result);

		result = a + b * 10;// a + (b * 10);
		System.out.println(result);

		boolean isEven = a % 2 == 0;// 짝수
		System.out.println(isEven);

		boolean isOdd = a % 2 != 0;// 홀수
		System.out.println(isOdd);

	}

	public void test2() {

		int x = 10;
		int y = 10;
		int z = ++x;

		System.out.println("x = " + x);// 11
		System.out.println("z = " + z);// 11

		z = y++;
		System.out.println("y = " + y);// 11
		System.out.println("z = " + z);// 10

		x = 20;
		z = x++ + --y;

		System.out.println("x = " + x);// 21
		System.out.println("y = " + y);// 10
		System.out.println("z = " + z);// 30

		int m = 3;
		int n = m++ + m;
		System.out.println("m = " + m);// 4
		System.out.println("n = " + n);// 7

	}

	public void test1() {

		int a = +9;
		int b = -10;
		System.out.println(a + b); // -1

		// 증감연산자 ++ --
		// 해당 변수의 값을 1증가, 1감소
		int c = 5;
		c++;
		System.out.println(c);
		c--;
		System.out.println(c);
		// 전위증감연산자 ++x / --x : 먼저 1을 증감 시킨 후 인접연산에 사용된다.
		// 후위증감연산자 x++ / x-- : 인접연산에 사용된 후 1을 증감처리한다.
		int x = 10;
		++x;
		System.out.println(x);// 1
		--x;
		System.out.println(x);// 10

		int y = 3;
		int z = x + y++;
//		System.out.println(z);//14
		System.out.println(z);// 13
		System.out.println(y);// 4

	}
}
