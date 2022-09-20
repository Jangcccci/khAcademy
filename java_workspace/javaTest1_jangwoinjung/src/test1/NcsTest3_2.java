package test1;

import java.util.Arrays;

public class NcsTest3_2 {

	public static void main(String[] args) {
		int[][] num = new int[5][3];
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[0].length; j++) {
				num[i][j] += 1;
			}
		}
		System.out.println(Arrays.deepToString(num));
	}
}
