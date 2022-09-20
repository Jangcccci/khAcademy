package com.sh.test.multi.dimentional.array.test;

import java.util.Arrays;
import java.util.Random;

public class Sample {

	public static void main(String[] args) {
		Sample sp = new Sample();
		
//		sp.exercise1();
//		sp.exercise2();
//		sp.exercise3();
//		sp.exercise4();
		sp.exercise1copy();
	}
	
	/**
	 * [2차원 배열 실습문제]
 - 클래스 생성 : com.sh.test.multi.dimentional.array.test.Sample.java

[문제 1]
 - 메소드명 : public void exercise1()
 - 구현내용 : 
    1. 3행 5열 2차원배열 선언 및 생성
    2. 1~100사이의 임의의 정수를 모든 방에 기록함
    3. 열의 값이 5의 배수인 경우만 값(행,열) 출력함

[문제 2]
 - 메소드명 : public void exercise2()
 - 구현내용 : 
    1. 3행4열 2차원배열 선언 및 생성
    2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
    3. 아래의 내용처럼 처리함
        0열    1열    2열    3열    
    0행    값    값    값     0행 값들의 합계
    1행    값    값    값    1행 값들의 합계
    2행    값    값    값    2행 값들의 합계
	 */
	public void exercise1() {
		int[][] arr = new int [3][5];
		Random rnd = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[0].length; j++) {
				int num = rnd.nextInt(100) + 1;
				if(num % 5 == 0) {
					arr[i][j] = num;
					System.out.print(arr[i][j] + " ");
				}else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}		
	}
	
	public void exercise1copy() {
		int[][] arr = new int [3][5];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = (int)(Math.random() * 100 + 1); 
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] % 5 == 0? arr[i][j] + " " : 0 + " ");
			}
			System.out.println();
		}		
	}
	
	public void exercise2() {
		int[][] arr = new int[3][4];
		Random rnd = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				int num = rnd.nextInt(100) + 1;
				if(j != 3)
					arr[i][j] = num;
				else
					arr[i][j] = arr[i][0] + arr[i][1] + arr[i][2];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void exercise3() {
        Random rnd = new Random();
        int[][] arr = {
                {0, 0, 0},    
                {0, 0, 0},    
                {0, 0, 0},    
        };
        int sum = 0;
        
        for(int i = 0; i < arr.length;i++) {
            for(int j = 0; j < arr[i].length;j++) {
                arr[i][j] = rnd.nextInt(100)+1;
                sum += arr[i][j];
                
                System.out.print(arr[i][j] + " ");
            }
            System.out.printf("%d",sum);
            System.out.println();
        }
    }
	
    public void exercise4() {
        int[][] arr = new int[3][4];
        
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;

            for(int j = 0; j < arr[i].length - 1; j++) {
                arr[i][j] = (int)((Math.random() * 100) + 1);
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
}
}
