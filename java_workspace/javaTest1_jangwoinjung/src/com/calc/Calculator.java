package com.calc;

public class Calculator {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		
		if (a > 0 && a < 10 && b > 0 && b < 10 && args.length == 2) {
			int sum = 0;
			for (int i = 0; i < args.length; i++) {
				sum += Integer.parseInt(args[i]);
			}
			System.out.printf("합 : %d\n", sum);

			int min = 0;
			for (int i = 0; i < args.length; i++) {
				if (i == 0)
					min = Integer.parseInt(args[i]);
				else
					min -= Integer.parseInt(args[i]);
			}
			System.out.printf("차 : %d\n", min);

			int mul = 1;
			for (int i = 0; i < args.length; i++) {
				mul *= Integer.parseInt(args[i]);
			}
			System.out.printf("곱 : %d\n", mul);

			int div = 1;
			for (int i = 0; i < args.length; i++) {
				if (i == 0)
					div = Integer.parseInt(args[i]);
				else
					div /= Integer.parseInt(args[i]);
			}
			System.out.printf("나누기 : %d\n", div);
		}
	}
}
