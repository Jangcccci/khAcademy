package sh.java.oop.method;

/**
 * 
 * 재귀함수(메소드)
 * 	- 스스로를 다시 호출하는 메소드
 * 	- 반복호출을 통한 효율적인 코드작성 가능 
 *	- 주의점 : 종료조건을 제시하지 못하면 무한반복으로 인해 StackOverFlowError발생
 *	=> 코드를 간결하게 가져갈 수 있다.	
 *
 *- tree구조(메뉴), 주사위2개 굴리기(두 수가 같으면 한번 더 굴리기), 하노이의 탑 등이 재귀함수로 처리하기 적합
 */
public class RecursionStudy {

	public static void main(String[] args) {
		RecursionStudy study = new RecursionStudy();
		int result = study.factorial(5);
		study.factorial(5);
		System.out.println(result);
	}

	/**
	 * 5! = 5 * 4 * 3 * 2 * 1
	 * 
	 */
	public int factorial(int n) {
		if(n == 1)
			return 1; // 재귀함수 호출종료!
		return n * factorial(n - 1);
	}
}
