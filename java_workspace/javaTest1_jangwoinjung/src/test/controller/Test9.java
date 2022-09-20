package test.controller;

import java.util.Arrays;

public class Test9 {
	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };

		for (int num = 0; num < array.length; num++) {
			for (int i = 0; i < array.length - 1; i++) {
				int min = i;
				for (int j = i + 1; j < array.length; j++) {
					if (array[num][min] > array[num][j])
						min = j;
				}
				swap(array, num, i, min);
			}
		}
		
		System.out.println(Arrays.deepToString(array));
		
		
		int[] arrMax = {array[0][3], array[1][3], array[2][3], array[3][3]};
		int[] arrMin = {array[0][0], array[1][0], array[2][0], array[3][0]};
		
		for(int i = 0; i < arrMax.length-1; i++) {
			int max = i;
			for(int j = i+1; j < arrMax.length; j++) {
				if(arrMax[max] > arrMax[j])
					max = j;
			}
			swap1(arrMax,i,max);
				
		}
		for(int i = 0; i < arrMin.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < arrMin.length; j++) {
				if(arrMin[min] < arrMin[j])
					min = j;
			}
			swap1(arrMin,i,min);
		}
		
		
		System.out.printf("최대값 : %d\n",arrMax[3]);
		System.out.printf("최소값 : %d", arrMin[3]);
	}

	
	public static void swap(int[][] arr,int num, int i, int j) {
		int tmp = arr[num][i];
		arr[num][i] = arr[num][j];
		arr[num][j] = tmp;
	}
		
	public static void swap1(int[] arr, int i, int j) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
	}
}
