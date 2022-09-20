package sh.java.array;

import java.util.Arrays;

/**
 *  배열복사
 *   - 얕은 복사 shallow copy
 *   	-heap영역의 배열객체에 대한 주소값 복사
 *   	-같은 배열객체를 공유.
 *   
 *    - 깊은 복사 deep copy
 *    	-heap영역에 동일한 크기/값을 가진 배열객체 복사
 *    	-참조변수별로 다른 배열을 참조
 *
 */
public class ArrayCopyStudy {

	public static void main(String[] args) {
		ArrayCopyStudy study = new ArrayCopyStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 *  System.arraycopy
	 *  - 배열 일부 복사
	 *  - 두 배열 합치기 작업에 유용하다.	
	 */
	public void test4() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = new int[5];
		System.arraycopy(arr, 5, arr2, 0, 5);
		
		for(int i : arr2) {
			System.out.println(i);
		}
		
		int[] a = {1,2,3};
		int[] b = {4,5,6,7};
		int[] c = new int[7];
		
		int start = 0;// 이렇게 하면 a배열을 수정해도 영향받지 않음
		System.arraycopy(a, start, c, start, a.length);
		start += a.length;
		System.arraycopy(b, 0, c, start, b.length);
		
		for(int i = 0; i < c.length; i++) {
			System.out.printf("c[%d] = %d\n", i, c[i]);
		}
	}
	
	/**
	 *  - System.arraycopy():void
	 *  - Arrays.copy():T[]
	 *  - clone()
	 */
	public void test3() {
		
		int[] arr1 = {1, 2, 3};
		
		//System.arraycopy(src, start, dest, start, length):void
//		int[] arr2 = new int[arr1.length];
//		System.arraycopy(복사할 배열, 몇번째 인덱스부터, 복사받을 배열, 몇번째 인덱스부터 받을지, 몇개 받을지);
//		arrayEquals(arr1, arr2);
//		일부만 복사한다거나 두 배열 합치기에 유용
		
		//Arrays.copyOf
//		int[] arr3 = Arrays.copyOf(arr1, arr1.length);
//		arrayEquals(arr1,arr3);
		
		//clone
		int[] arr4 = arr1.clone();
		arrayEquals(arr1, arr4);
		
	}
	
	public void arrayEquals(int[] arr1, int[] arr2) {
		System.out.printf("주소값 일치여부 : %b\n", arr1 == arr2); //false
		System.out.printf("배열내용 일치여부 : %b\n", Arrays.equals(arr1, arr2)); //true
	}
	/**
	 * 얕은 복사
	 *  heap메모리에 있는 배열객체에대한 주소값을 복사
	 */
	public void test1() {
		char[] arr1 = {'a', 'b', 'c'};
		char[] arr2 = arr1; // 참조 주소값을 복사
		
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());// 동일한 주소
		System.out.println(arr1 == arr2);// == 을 배열₩에 사용하면 주소값을 비교해서 true/flase를 결정
		
		arr1[1] = 'x';
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%c - %c, %c\n", i, arr1[i], arr2[i]);
		} //arr1[1]만 바꿨는데 arr2[1]도 바꼈다. 같은 주소값을 갖고 있기 때문이다.
		
	}
	
	/**
	 * 깊은 복사
	 * 1. 반복문을 통한 직접 복붙
	 * 2. System.arraycopy
	 * 3. Arrays.copy
	 * 4. clone
	 */
	public void test2() {
		char[] arr1 = {'가', '나'	, '다'};
		char[] arr2 = new char[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; // 좌항의 공간에 우항의 값을 대입하라!
		}
		
		System.out.println(arr1 == arr2);//flase
		System.out.println(Arrays.equals(arr1, arr2));//true 배열의 내용비교
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());// 다른 주소
		
		arr1[1] = '켘';
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%d - %c, %c\n", i, arr1[i], arr2[i]);
		}
	}
}
