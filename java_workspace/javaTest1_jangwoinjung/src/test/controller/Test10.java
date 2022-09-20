package test.controller;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test10 {
	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56}, 
						  {82, 10, 12, 61}, 
						  {14, 16, 18, 78}, 
						  {45, 26, 72, 23}}; 
		
		int[] copyAr = new int[array.length * array[0].length];
		
		int index = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i][j] % 3 == 0) {
					copyAr[index] = array[i][j];
					index++;
				}
			}
		}
		
		
		for(int i = 0; i < copyAr.length-1; i++) {
			int min = i;
			for(int j = i+1; j < copyAr.length; j++) {
				if(copyAr[min] == copyAr[j]) {
					copyAr[min] = 0;
				}else if(copyAr[min] > copyAr[j]) {
					min = j;
				}
			}
			swap(copyAr, i, min);
		}
		
		index = 0;
		int count = 0;
		
		for(int i = 0; i < copyAr.length; i++) {
			if(copyAr[i] == 0) {
				count++;
			}
		}
		
		int[] arr1 = new int[count];
		int[] arr2 = new int[copyAr.length - count];
		
		for(int i = 0; i < copyAr.length; i++) {
			if(i < count) {
				arr1[i] = copyAr[i];
			}else {
				arr2[i-count] = copyAr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		
			
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
}
	
}