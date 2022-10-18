package ncs.test2;

import java.text.DecimalFormat;
import java.util.Arrays;

public class StringTest {
	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		
		//str에서 데이터를 분리한다.
		String[] st = str.split(",");
		
		int i = 0;
		for(double d : data) {
			d = Double.parseDouble(st[i++]);
			sum += d;
		}
		double average = sum/data.length;
		
		DecimalFormat df = new DecimalFormat("##.000");
		
		System.out.println("합계 : " + df.format(sum));
		System.out.println("평균 : " + df.format(average));
	}
	
	
	
}
