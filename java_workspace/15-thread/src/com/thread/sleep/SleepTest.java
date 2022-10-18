package com.thread.sleep;

public class SleepTest {
	
	public static void main(String[] args) {
		SleepTest test = new SleepTest();
		test.sendAphorism();
	}

	/**
	 * <문제 1> 
 	- 실행용클래스 com.thread.sleep.SleepTest
 	+ sendAphorism() : void 

 	- 좋아하는 속담, 경구 10개를 문자열배열에 담고, 3초마다 랜덤하게 출력하세요.
 	- 10번 출력후 종료하세요.
	 */
	
	public void sendAphorism() {
		Thread th = new Thread(new SleepThread());
		
		th.start();
	}
	
	class SleepThread implements Runnable {
		String[] arr = {"가나다라", "마바사아", "자차카타"};

		@Override
		public void run() {
			for(int i = 0; i < 10; i ++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int num = (int)(Math.random()*3);
				System.out.println(arr[num]);
			}
		}
		
	}
}
