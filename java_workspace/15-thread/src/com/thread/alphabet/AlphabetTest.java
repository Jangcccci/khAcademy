package com.thread.alphabet;

public class AlphabetTest {

	
	public static void main(String[] args) {
		Thread upper = new Thread(new UpperAlphbetThread());
		Thread lower = new Thread(new LowerAlphbetThread());
		
		upper.start();
		lower.start();
	}
}

//java.concurrent