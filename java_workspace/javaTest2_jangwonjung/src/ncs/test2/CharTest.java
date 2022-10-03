package ncs.test2;

import java.util.Arrays;

public class CharTest {

	public static void main(String[] args) {
		
	char[] arr = args[0].toCharArray();
	char[] arr2 = new char[arr.length];
	
	for(int i = 0; i < arr.length; i++) {
		arr2[arr.length - 1 - i] = arr[i];
	}
	
	System.out.println(Arrays.toString(arr2).toUpperCase());
	}
}
