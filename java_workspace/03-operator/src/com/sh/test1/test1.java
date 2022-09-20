package com.sh.test1;

public class test1 {

	/**
	 1. 연산자 우선순위를 괄호로 표현하기

    	x = 3 + 4 + 5;
    	x = y = z;
    	z *= ++y + 5;
    	a || b && c || d;

    --------------------------------

    	예) x = ((3 + 4) + 5);
    	
    답안)
    	x = (3 + 4) + 5;
    	x = (y = z);
    	z *= (++y + 5);
    	((a || (b && c)) || d);
    	
     2. 처리과정을 표현하기
		예 : 
    	(1 < 2 || 3 != 3) =>
    	(true || (3 != 3)) =>
    	(true) =>
 		true

		문제

    	1. (true && true) || false 
    	=> true && true -> true / true || -> true
    	2. (false && true) || true
    	=> false && -> false / false || true -> true
    	3. (false && true) || false || true
    	=> false && -> false / false || false -> false -> false || true -> true
    	4. (5 > 6 || 4 > 3) && (7 > 8)
    	=> 5 > 6 -> false || 4 > 3 -> true -> true 
    	=> 7 > 8 -> false
    	=> true && false -> false
    	5. !(7 > 6 || 3 > 4)
    	=> 7 > 6 -> true // 3 > 4 -> false
    	=> true || -> true
    	=> !true -> false
	 */

}
