package test.controller;

public class Test3 {

	public static void main(String[] args) {
		
		int i = 1;
		double sum = 0;
		double result = 0;
		
		
		while(i < 101) {
				sum += (double)i;
				i++;
				if(i == 100)
					result = sum / i ;
		}
		System.out.printf("합계 : %f\n", sum);
		System.out.printf("평균 : %f", result);
		
	}
}
