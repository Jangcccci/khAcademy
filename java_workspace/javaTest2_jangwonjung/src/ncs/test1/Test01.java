package ncs.test1;

import java.util.Scanner;

public class Test01 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		if(arr.length != 5) {
			System.out.print("다시 입력하세요.");
			return;
		}
		
		int[] arrInt = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			arrInt[i] = Integer.valueOf(arr[i]);
		}
		
		for(int i = 0; i < arrInt.length; i++) {
			if(arrInt[i] < 10 || arrInt[i] > 99) {
				System.out.println("다시 입력하세요");
				return;
			}
		}
			
		double score = ((arrInt[0] + arrInt[1]) / 2) * 0.6 + ((arrInt[2] + arrInt[3])/2) * 0.2 + arrInt[4] * 0.2;
			
		if(score >= 90) 
			System.out.println("Class: Gold Class");
		else if(score >= 80) 
			System.out.println("Class: Silver Class");
		else if(score >= 70) 
			System.out.println("Class: Bronze Class");
		else
			System.out.println("Class: Normal Class");
		
	}
}
