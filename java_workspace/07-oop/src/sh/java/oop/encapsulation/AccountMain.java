package sh.java.oop.encapsulation;

/**
 *<캡슐화 원칙>
 *-> 필드(상태)의 접근제어자를 private로 한다.
 *-> 필드(상태) + 메소드(행동)를 같이 클래스 내부에 함께 	작성
 *-> 필드를 제어하는 메소드(행동)의 접근제어자는 public으로 한다.
 *
 *캡슐화 적용 전의 객체필드 직접접근방식은 보안적으로 위험하다.
 *- 클라이언트 코드 작성시 실수나 악의적인 행동을 방지할 수 없다.
 *=>대안으로 나온 것이 캡슐화
 */
public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
//		acc.name = "홍길동";
//		acc.balance = 1_000_000;
		
		acc.setName("홍길동");
		acc.setBalance(1_000_000);
		acc.status();
				
//		//입금
//		acc.balance += 500_000; //객체.필드명 == 객체필드 직접 접근방식
//		System.out.printf("[%s]님의 현재 잔액은 [%d]원 입니다.", acc.name, acc.balance);
		
		acc.deposit(500_000);
		acc.deposit(-500_000); //입금액이 음수인 경우 입금실패 해야한다.
		acc.status();
//		
//		//출금
//		acc.balance -= 700_000;
//		System.out.printf("[%s]님의 현재 잔액은 [%d]원 입니다.", acc.name, acc.balance);
		
		acc.withdraw(700_000);
		acc.withdraw(-700_000); // 출금액이 음수인 경우 출금실패 해야한다.
		acc.withdraw(1_000_000); // 출금액이 잔액보다 많은 경우 출금실패 해야한다.
		acc.status();
		
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
	}
}
