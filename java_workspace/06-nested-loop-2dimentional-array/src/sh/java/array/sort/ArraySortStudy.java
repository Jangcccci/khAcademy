package sh.java.array.sort;

import java.util.Arrays;

/**
 * 
 * 배열 정렬 알고리즘
 * - 순차정렬
 * - 선택정렬
 * - 버블정렬
 * - 삽입정렬
 * - 퀵정렬
 * - 합병정렬
 * ...
 *
 */
public class ArraySortStudy {

	public static void main(String[] args) {
		ArraySortStudy study = new ArraySortStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * 
	 * 로또번호 생성기
	 * - 1~45 중에 6개 중복없는 난수를 뽑아 오름차순 정렬 
	 */
	
	public void test4() {
		int[] lotto = new int[6];
		
		int index = 0;
		int cnt = 0;
		label123:
		for(;;) {
			cnt++;
			int n = (int)(Math.random() * 45 + 1);
			
			//중복제거
			for(int i = 0; i < index; i++) {
				if(lotto[i] == n)
					continue label123;
			}
			lotto[index++] = n;
			
			if(index == lotto.length)
				break;
		}
		
		System.out.println(cnt);
		System.out.println(Arrays.toString(lotto));
	}
	
	/**
	 * 선택정렬
	 * - 매회차에 최소값을 찾고, 마지막에 해당하는 자리에 값교환.
	 * - 순차정렬 대비 값교환 횟수가 적어 성능이 좋다.
	 */
	public void test3() {
		int[] arr = {4, 3, 0, 2, 1};
		
		for(int i = 0; i < arr.length - 1; i++) {
			//최소값에 해당하는 인덱스를 미리 지정
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j])
					min = j;
				print(arr, i , j, min);
			}
			swap(arr, i , min); // 회차마다 딱 한번 자리교환
		}
		
		System.out.println("최종결과" + Arrays.toString(arr));
	}
	
	/**
	 * 순차정렬
	 * - 회차에 해당하는 인덱스에 알맞은 수를 찾음
	 * - 비교횟수, 교환횟수가 많음
	 */
	
	public void test2() {
		int[] arr = {4, 3, 0, 2, 1};
		
		// i = 0, 1, 2, 3
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j])//arr[i] < arr[j] -> 내림차순정렬됨
					swap(arr, i, j);
			
				print(arr, i, j);
			}
		}
	}
	
	public void print(int[] arr, int i, int j) {
		System.out.printf("%d %d : %s\n", i, j ,Arrays.toString(arr));
	}
	public void print(int[] arr, int i, int j, int min) {
		System.out.printf("%d %d : %s (%d)\n", i, j ,Arrays.toString(arr), min);
	}
	/**
	 * 
	 * 값교환
	 */
	public void test1() {
		int m = 20;
		int n = 30;
		
		//값교환
		int tmp = m;
		m = n;
		n = tmp;
		
		System.out.printf("m = %d, n = %d\n", m, n);
		
		int[] arr = {2, 1, 3};
		
		//0번지와 1번지 값교환
//		tmp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = tmp;
		swap(arr, 0, 1);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
