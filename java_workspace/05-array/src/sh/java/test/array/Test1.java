package sh.java.test.array;

public class Test1 {
	
	/**
	 * 
	 * - 클래스 : sh.java.test.array.Test1.java
	   - 메소드명 : public void test()

    길이가 100인 배열을 선언하고 1부터 100까지의 값을 순서대로 배열 인덱스에 넣어 그 값을 출력하는 코드를 작성하시오.

	 */
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		t1.test();
	}
	
	public void test() {
		int[] arr = new int[100];
		
		for(int i = 0; i < 100; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
	}
	
	

}
