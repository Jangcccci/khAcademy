package sh.java.array;

public class ArrayStudy {

	public static void main(String[] args) {
		ArrayStudy study = new ArrayStudy();
		
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();
		
//		System.out.println(study);
	}
	
	/**
	 * 배열의 특징
	 * - heap영역에 생성되는 객체이다.
	 * 	- hashCode값을 갖는다.
	 * 	- toString을 통해 객체정보를 확인할 수 있다.
	 * - 크기를 변경할 수 없다.
	 * - 삭제는 Garbage Collector에 의해 처리
	 * 	- 주소값 제거만 가능(null). 실제 메모리상의 삭제는 GC가 처리
	 */
	public void test6() {
		int[] arr = new int[5];
		int[] arr2 = new int[10];
		
		// hashCode
		System.out.println(arr.hashCode()); // 객체의 식별코드 : 주소값은 아니다!!!
		System.out.println(arr2.hashCode());
		
		// toString() : 객체정보를 문자열로 출력해야 할때 자동으로 출력된다.
		System.out.println(arr); // type@hashCode (16진수)
		System.out.println(arr.toString());
		
		// 배열크기변경 불가
		arr = new int[7]; // -> 크기변경이 아니라, 새 배열을 할당
		System.out.println(arr.hashCode());
		
		// 객체 삭제
		arr = null; // stack 메모리에서 주소값 제거하고 연결이 끊어진 haep 메모리의 객체는 GC가 지움
		
		// NullPointerException 주의
		System.out.println(arr); //null
//		System.out.println(arr.length); // java.lang.NullPointerException / .앞의 객체가 null인지 확인할 것!
//		System.out.println(arr[0]); // NPE
		
		
	}
	
	/**
	 * @실습문제 : 알파벳소문자배열을 생성하고 출력
	 */
	public void test5() {
		char[] ch = new char[26];
		for(int i = 0; i < ch.length; i++) {
			ch[i] = (char)('a' + i);
//			System.out.println(ch[i]); -> 이렇게 하면 foreach문 안 써도 출력가능 
		}
		for(char j : ch) {
			System.out.println(j);
		}
	}
	
	/**
	 * String[]
	 * - 참조형이지만, 기본형배열처럼 사용가능 
	 */
	public void test4() {
//		String[] names = new String[3];
//		
//		// 값대입 - 모든 참조형의 기본값 : null
//		names[0] = "홍길동";
//		names[1] = "신사임당";
//		names[2] = "이순신";
		
		String[] names = {"홍길동", "신사임당", "이순신"};
		
		for(String name : names) {
			System.out.println(name);
		}
	}
	
	/**
	 * 배열에 값대입
	 * - 배열요소간의 규칙성이 있다면, 반복문을 통해 값대입이 가능하다.
	 * - {'A', 'B', 'C', 'D', 'E'}
	 */
	public void test3() {
		char[] arr; // stack에 arr변수 생성
		arr = new char[5];// heap에 char배열(길이5) 생성 후 주소값을 arr에 대입.
		//== char[] arr = new char[5];
		//arr[0] = 'A' 65
		//arr[1] = 'B' 66
		//arr[2] = 'C' 67
		//arr[3] = 'D' 68
		//arr[4] = 'E' 69
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)(65 + i); // == arr[i] = (char)('A' + i);
		}
		
		//foreach문
		for(char ch : arr) {
			System.out.println(ch);
		}
	}
	
	/**
	 * 배열 초기화
	 * - 배열변수선언 + 배열객체할당 + 인덱스별 값대입
	 */
	public void test2() {
//		int[] scores = {100, 90, 80 ,75, 55};
		int[] scores = new int[] {100, 90, 80, 75, 55};
		
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] = %d\n", i, scores[i]);
		}
		
//		System.out.println(scores[5]);// -> 없는 인덱스값을 출력하면 오류남 java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	
		//향상된 for문 : foreach문 (인덱스를 통한 처리가 필요없는 경우)
		//for(변수 : 배열){} - 변수? 배열의 요소를 하나 담을 변수
		for(int score : scores) {
			System.out.println(score);
		}
	}
	
	/**
	 * 배열 사용순서
	 * 1. 배열변수 선언
	 * 2. 배열할당(heap메모리)
	 * 3. 인덱스별 값대입
	 * 4. 사용
	 * 
	 * 홍길동의 시험점수
	 * 국어 : 100
	 * 영어 : 90
	 * 수학 : 80
	 * 사회 : 75
	 * 과학 : 55
	 */
	public void test1() {
		
		//1. 배열선언
		int[] scores; // == int scores[];
		//참조형이다. - 객체에 대한 주소값이 들어있다. int != int[]
		//stack 메모리에 선언
		
		//2. 배열할당 - 크기지정
		scores = new int[5];
		//heap 메모리에 주소값 할당
		
		//3. 인덱스별로 값대입
		//heap영역은 변수를 지정할때 타입별 기본값으로 초기화된다.
		//byte, short, int, long : 0
		//float, double : 0.0
		//char : 0 ' ' null문자
	    //boolean : false 가 기본값 
		
		
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		scores[3] = 75;
		scores[4] = 55;
		
		//4. 사용
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		// 총점 / 평균
		int sum = 0;
		System.out.println("배열의 길이 : " + scores.length);
		for(int i = 0; i < scores.length; i++) {
			System.out.println(i + " : " + scores[i]);
			sum += scores[i];
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum / scores.length);
		
	}
	
}
