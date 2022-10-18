package ncs.test6;

import java.util.Scanner;

public class Calculator{

	public double getSum(int data) throws InvalidException{
		
			if(data < 2 || data > 5) {
				throw new InvalidException("입력 값에 오류가 있습니다.	");
			}
			int i = 0;
			int sum = 0;
			while(i <= data) {
				sum += i;
				i++;
			}
			return sum;
		
	}
}
