package test.controller;

public class Test2 {

	public static void main(String[] args) {
		int result = 0;

		for (int i = 2; i < 6; i++) {
			for (int j = 1; j < 10; j++) {
				result = i * j;
				if (result % 2 != 0) {
					System.out.printf("%d * %d = %d\n", i, j, result);
				}
			}
		}
	}
}
