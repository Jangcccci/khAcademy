package com.thread.alphabet;

public class UpperAlphbetThread implements Runnable{

	@Override
	public void run() {
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.println((char)i);
		}
	}

}
