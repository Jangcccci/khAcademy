package test.controller;

public class Test8 {
	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56}, 
						  {82, 10, 12, 61},
						  {14, 16, 18, 78},
						  {45, 26, 72, 23}};
		double sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				sum += (double)array[i][j];
			}
		}
		double avr = sum/16;
		
		System.out.printf("합 : %f\n", sum);
		System.out.printf("평균 : %f", avr);
	}
}
