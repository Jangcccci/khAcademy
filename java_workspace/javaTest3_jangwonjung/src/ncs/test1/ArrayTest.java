package ncs.test1;

public class ArrayTest {

	public static void main(String[] args) {

		int [][] array = {{12, 41, 36, 56, 21}, 
						  {82, 10, 12, 61, 45}, 
						  {14, 16, 18, 78, 65}, 
						  {45, 26, 72, 23, 34}};
		
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				sum += array[i][j];
			}
		}
		double average = sum/20.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
	}

}
