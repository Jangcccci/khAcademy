package com.sh.oop.method.static_;

public class Run {

	/**
	 *     public static void main(String[] args) {
        //1 toUpper메소드 호출시 "kh academy"를 전달하면, "KH ACADEMY"가 리턴

        //2 setChar메소드 호출시  "java", 0, 'x'를 전달하고, "xava" 리턴

        //3 getAlphabetLength호출시 "안녕, 난 James야!" 전달하고, 5 리턴

        //4 concat 호출시 "hello", "world" 호출후 "helloworld" 리턴
    }

	 */
	
	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		
		System.out.println(sm.toUpper("kh academy"));
		System.out.println(sm.setChar("java", 0, 'x'));
		System.out.println(sm.getAlphatlength("안녕, 난 James야!"));
		System.out.println(sm.concat("hello", "world"));
	}
	
}
