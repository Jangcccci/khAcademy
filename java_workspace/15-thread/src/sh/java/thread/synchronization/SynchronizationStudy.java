package sh.java.thread.synchronization;

/**
 * 동기화
 * - 멀티스레딩 환경에서 공유자원에 대해 한 번에 한 쓰레드만 접근 가능하도록 지정하는 것.
 * 
 * 임계영역 Critical Section
 * - lock을 획득한 쓰레드만 접근가능한 공유자원
 * 
 * 동기화처리
 * 1. 해당메소드는 synchronized 지정 - 이때 임계영역은 해당객체(메소드가 될 수 없다)
 * 2. 메소드 안에 synchronized block 지정 - 임계영역으로 처리할 객체 지정
 * 
 * @author jangcccci
 *
 */
public class SynchronizationStudy {

	public static void main(String[] args) {
		SynchronizationStudy study = new SynchronizationStudy();
		study.test1();
	}

	private void test1() {
		Account acc = new Account(1000);
		
		Thread atm1 = new Thread(new ATM(acc));
		Thread atm2 = new Thread(new ATM(acc));
		
		atm1.setName("ATM1");
		atm2.setName("ATM2");
		
		atm1.start();
		atm2.start();
	}
	
	class ATM implements Runnable {
		private Account acc;
		
		public ATM(Account acc) {
			super();
			this.acc = acc;
		}

		@Override
		public void run() {
			while(acc.balance > 0) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				long money = (int)(Math.random()* 3 + 1)* 100;
				acc.withdraw(money);
			}
			System.out.println(Thread.currentThread().getName() + " End!");
		}
		
	}
	
	class Account{
		private long balance;
		
		public Account(long balance) {
			this.balance = balance;
		}
		
//		public synchronized void withdraw(long money) {
		public void withdraw(long money) {
			String name = Thread.currentThread().getName();
			
			synchronized(this) {
			System.out.printf("[%s] 출금시도 %d원 | 현재잔액 %d원\n", name, money, this.balance);
			if(money <= this.balance) {
				balance -= money;
				System.out.printf("[%s] 출금 %d원 | 현재잔액 %d원\n", name, money, this.balance);
			}
			else {
				System.out.printf("[%s] 잔액부족! 출금시도 %d원 | 현재잔액 %d원\n", name, money, this.balance);
			}
			}
		}
		
		
	}
}
