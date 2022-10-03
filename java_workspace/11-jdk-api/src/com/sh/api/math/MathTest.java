package com.sh.api.math;

public class MathTest {

	public static void main(String[] args) {
		// 1. 3456.5324 => 올림해서 소수점첫째자리까지 표현
		double dnum = 3456.5434;
		System.out.println(Math.ceil(dnum * 10) / 10);
		// 2. 577.26784 => 반올림해서 소수점둘째자리까지 표현
		dnum = 577.27784;
		System.out.println(Math.round(dnum * 100) / 100.0);
		// 3. 552.2987 => 올림해서 소수점셋째자리까지 표현
		dnum = 552.2987;
		System.out.println(Math.ceil(dnum * 1000) / 1000);
		// 4. -845.215 => 내림해서 소수점첫째자리까지 표현
		dnum = -845.215;
		System.out.println(Math.floor(dnum * 10) / 10);
		// 5. 324456.24497 => 올림해서 소수점둘째자리까지 표현
		dnum = 324456.24497;
		System.out.println(Math.ceil(dnum * 100) / 100);
	}
}
