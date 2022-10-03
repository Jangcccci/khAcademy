package sh.java.error;

/**
 * 
 * 소스코드상(예외처리) 복구가 불가능한 오류
 * 
 * @author jangcccci
 *
 */
public class ErrorStudy {

	public static void main(String[] args) {
		ErrorStudy study = new ErrorStudy();
//		study.test1();
		study.test2();
		
		System.out.println("...정상종료...");
	}
	
	/**
	 * StackOverflowError
	 * - 복구불가
	 */
	
	private void test2() {
		System.out.println("test2!!!"); // Exception in thread "main" java.lang.StackOverflowError
		test2();
	}
	
	/**
	 * OutOFMemoryError - heap 메모리 공간을 모두 소진한 경우
	 * - 복구불가
	 */
	private void test1() {
		long[] arr = new long[Integer.MAX_VALUE]; //Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
	}
}
