package ncs.test4;

import java.util.Arrays;

public class TestSort {

	public static void main(String[] args) {
		int[] intArr = new int[10];
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 50 + 51);
		}
		
		System.out.println(Arrays.toString(intArr));
		
		for(int i = 0; i < intArr.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < intArr.length; j++) {
				if(intArr[min] < intArr[j])
					min = j;
			}
			swap(intArr, i, min);
		}
		
		System.out.println(Arrays.toString(intArr));
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp;
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
