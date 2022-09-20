package com.sh.test.array.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * - 1 ~ 100사이의 난수 10개를 생성해 배열에 대입하고, 오름차순 정렬하세요.
 *
 */
public class Test {
	public static void main(String[] args) {
		Test t = new Test();
//		t.test();//선택정렬
//		t.test1();//순차정렬
		t.jungEun();
	}
	
    public void jungEun() {    
        int[] arr = new int[10];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100 + 1);
//            System.out.print(arr[i] + " ");
        }
//        for(int array : arr) {
//            System.out.print(array + " ");
//        }
        
        for(int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
                swap(arr, i, min);
            }
        }
        System.out.println("최종결과 : " + Arrays.toString(arr));
        
        
    }
	
	public void test() {
		
		//선택정렬
		
		Random rnd = new Random();
		int[] arr = new int[10];
		
		
		for(int i = 0; i < arr.length; i++) {
			int num = rnd.nextInt(100) + 1;
			arr[i] = num;
		}
		
		
		
		for(int i = 0; i < arr.length -1; i++) {
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j])
					min = j;
			}
			swap(arr, i, min);
		}
		System.out.print(Arrays.toString(arr));
	}
	
	//순차정렬
	
	public void test1() {
		
		int[] arr = new int[10];
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] =(int)(Math.random()*100) + 1;
		}
		
		
		
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
	
	
	
	
	
	
	
	
	public void print(int[] arr, int i, int j) {
		System.out.printf("%s \n",Arrays.toString(arr));
	}
	
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
