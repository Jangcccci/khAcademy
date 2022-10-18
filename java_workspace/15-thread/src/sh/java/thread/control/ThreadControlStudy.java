package sh.java.thread.control;

import java.util.Scanner;

/**
 * 쓰레드 생명주기
 * 	- NEW : 생성
 * 	- RUNNABLE : 실행 || 실행대기
 * 	- WAITING/TIMED_WAITING/BLOCKED : 일시정지
 * 	- TERMINATED : 제거
 */
public class ThreadControlStudy {

	public static void main(String[] args) {
		ThreadControlStudy study = new ThreadControlStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
		
		System.out.println(Thread.currentThread().getName() + " End!");
	}
	/**
	 * @실습문제 :
	 * - 2의 배수를 출력하는 쓰레드 생성 (1초간격 출력)
	 * - 3의 배수 출력쓰레드(2초간격 출력)
	 */
	
	private void test4() {
		Thread th1 = new Thread(new SleepThread2(2, 1000), "2의 배수 쓰레드");
		Thread th2 = new Thread(new SleepThread2(3, 2000), "3의 배수 쓰레드");
		
		// 데몬쓰레드를 통해 멈추는 방법
		th1.setDaemon(true);
		th2.setDaemon(true);
		
		th1.start();
		th2.start();
		
		
		// interrupt를 통해 멈추는 방법
		System.out.println("엔터를 누르세요...");
		new Scanner(System.in).nextLine();
		th1.interrupt();
		th2.interrupt();
	}
	
	
	class SleepThread2 implements Runnable{

		int num;
		long millis;
		
		
		public SleepThread2(int num, long millis) {
			this.num = num;
			this.millis = millis;
		}
		
		@Override
		public void run() {
			int i = 1;
			for(;;) {
				try {
					System.out.printf("[%s]%d * %d = %d\n",Thread.currentThread().getName(),num, i, num * i++);
					Thread.sleep(millis);
				} catch (InterruptedException e) {
					break;
				}
			}
		}
		
	}
	
	/**
	 * interrupt
	 * - 다른 쓰레드에 interruptedException을 유발해 (종료 || 분기)처리가 가능하다.
	 * 
	 */
	private void test3() {
		Thread th = new Thread(new SleepThread(), "초시계쓰레드");
		th.start();
		
		System.out.println("엔터를 누르면, 초시계가 멈춥니다...");
		new Scanner(System.in).nextLine();
		th.interrupt();
	}

	/**
	 * Daemon Thread
	 * - 백그라운드에서 작동하는 쓰레드
	 * - 일반쓰레드가 모두 종료하면 데먼쓰레드는 자동으로 종료된다.
	 * 
	 */
	private void test2() {
		Thread th = new Thread(new SleepThread(), "초시계쓰레드d");
		th.setDaemon(true); // 일반쓰레드 -> 데몬쓰레드
		th.start();
		
		System.out.print("아무 글자나 입력하세요...");
		new Scanner(System.in).nextLine();
	}

	/**
	 * sleep
	 * - 특정 쓰레드를 지정한 milli초만큼 일시정지 시킨다.
	 * 
	 */
	private void test1() {
		new Thread(new SleepThread(), "초시계쓰레드").start();
	}
	
	class SleepThread implements Runnable{

		@Override
		public void run() {
			for(int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000); // 1초 지연
				} catch (InterruptedException e) {
					e.printStackTrace();
					break;
				}
				System.out.println("[" + Thread.currentThread().getName() + "] " + i);
			}
			
			System.out.println(Thread.currentThread().getName() + " End!");
		}
		
	}

}
