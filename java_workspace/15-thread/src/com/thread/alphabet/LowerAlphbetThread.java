package com.thread.alphabet;

public class LowerAlphbetThread implements Runnable{

	@Override
	public void run() {
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.println((char)i);
		}
	}

}
