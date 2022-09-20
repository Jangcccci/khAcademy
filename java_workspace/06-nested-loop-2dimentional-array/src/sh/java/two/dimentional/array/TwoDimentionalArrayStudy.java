package sh.java.two.dimentional.array;

/**
 * 
 * 2차원배열이란?
 * - 배열안의 배열
 * - 두개의 인덱스를 가진다. 행인덱스, 열인덱스
 * - 중첩반복문을 통해 제어할 수 있다.
 * 
 *
 */
public class TwoDimentionalArrayStudy {

	public static void main(String[] args) {
		TwoDimentionalArrayStudy study = new TwoDimentionalArrayStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
		
	}
	/**
	 * 
	 * @실습문제 아래 학생의 점수를 이차원 배열에 옮겨 담고, 각 학생별 평균점수를 구하라.
	 * - 3행4열 2차원배열 사용. 평균점수를 4열에 대입 후 출력.	
	 * 
	 * - 홍길동 90, 70, 55
	 * - 신사임당 100, 95, 100
	 * - 이순신 80, 75, 90	
	 */
	public void test4() {
		double[][] scores = {
				{90, 70, 55, 0},
				{100, 95, 100, 0},
				{80, 75, 90, 0}
		};
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[0].length; j++) {
				if(j==3) {
					scores[i][j] = (scores[i][0] + scores[i][1] + scores[i][2])/3;
					System.out.printf("%.1f ", scores[i][j]);
					break;
				}
				System.out.print((int)scores[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public void test4Teacher() {
		double[][] scores = new double[3][4];
		
		scores[0][0] = 90;
		scores[0][1] = 70;
		scores[0][2] = 55;
		scores[1][0] = 100;
		scores[1][1] = 95;
		scores[1][2] = 100;
		scores[2][0] = 80;
		scores[2][1] = 75;
		scores[2][2] = 90;
		
		for(int i = 0; i < scores.length; i++) {
			double[] temp = scores[i];
			temp[3] = (temp[0] + temp[1] + temp[2])/3;
		}
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[0].length; j++) {
				System.out.printf("%.1f ", scores[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * 초기화
	 * - 배열변수선언, 배열객체할당, 값대입까지 한번에 처리
	 * 
	 */
	public void test3() {
		int[][] scores = {
				{90, 80, 70},
				{100, 77, 95}
		};
		
		String[][] names = {
				{"홍길동", "홍진경", "홍난파"},
				{"이순신", "이영자", "이대호"}
		};
		
		for(int[] temp : scores) {
			for(int score : temp) {
				System.out.print(score + " ");
			}
			System.out.println();
		}
		
		for(String[] temp : names) {
			for(String name : temp) {
				System.out.print(name + " ");
			}
			System.out.println();
		}
		
		//for(int[] : dd)  ->  행을 나눈다.
	}
	
	/**
	 * @실습문제 
	 * - 2 * 26 2차원 배열에 알파벳 대소문자 대입 후 출력
	 * - 0행 대문자
	 * - 1행 소문자
	 */
	
	public void test2Teacher() {
		char[][] arr;
		arr = new char[2][26];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i==0)
					arr[i][j] = (char)('A' + j);
				else
					arr[i][j] = (char)('a' + j);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public void test2() {
		char[][] arr;
		arr = new char[2][26];
		
		char a = 'a';
		char A = 'A';
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i <1)
					arr[i][j] = A++;
				else
					arr[i][j] = a++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * 1. 배열변수 선언
	 * 2. 배열객체 할당
	 * 3. 각 인덱스별로 값할당
	 * 4. 사용
	 */
	public void test1() {
		int[][] arr;
		
		arr = new int[2][3];// 2 * 3 6개의 int공간을 생성. 그 공간은 int의 기본값 0으로 세팅.
		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
//		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		
		// 인덱스별 대입되는 값이 규칙적인 경우 중첩반복문을 통해서 값대입이 가능.
		int k = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
