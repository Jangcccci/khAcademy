package sh.java.oop.method;

import java.util.Arrays;

/**
 *
 * Call by value
 * 	- 기본형인 경우
 * 	- 값복사
 * 	
 * Call by reference
 * 	- 참조형인 경우
 * 	- 주소값 복사(얕은 복사)	
 * 
 * Call by value/reference는 매개변수가 기본형이냐 참조형이냐로 구분 가능하다. 단, 문자열은 call by value처럼 작동한다.
 * 
 */
public class CallByValueOrReference {
	public static void main(String[] args) {
		CallByValueOrReference instance = new CallByValueOrReference();
		
		//call by value
		int a = 10;
//		instance.call(a);
//		a = instance.call(a); // 이렇게 변경하고 메소드에서 return을 주면 20으로 변경 가
//		System.out.println(a); //10
		
		//call by reference
		int[] arr = {1,2,3};
//		instance.call(arr);
//		System.out.println(Arrays.toString(arr)); // {1, 20, 3}
		
		instance.call(a, arr);
		System.out.println(a); //10
		System.out.println(Arrays.toString(arr)); // {1, 20, 3}

		// 예외예외!!!!! 문자열은 call by vaule처럼 작동한다.
		String name = "홍길동";
		instance.call(name);
		System.out.println(name);
	}
	
	public void call(String name) {
		name += "길동";
	}
	
	public void call(int n, int[] arr) {
		n += 10; // call by value
		arr[1] *= 10; // call by reference
	}
	
	public void call(int arr[]) {
		arr[1] *= 10;
	}
	
	public int call(int n) {
		n += 10;
		return n;
	}
}
