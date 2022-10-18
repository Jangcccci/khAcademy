package baemin.order.manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import baemin.order.member.Member;
import baemin.order.member.MemberIO;
import baemin.store.Store;
import baemin.store.menu.Menu;

public class MemberManager {
	private MemberIO memberIO = new MemberIO();
	private HashMap<String, Member> memberMap;
	private List<Integer> basketStore = new ArrayList<>();
	private String user = null;
	int totalPrice;

	List<Store> stores = new ArrayList<>();
	List<Menu> menuList = new ArrayList<>();

	public void setMemberMap(HashMap<String, Member> memberMap) {
		this.memberMap = memberMap;
	}

	public HashMap<String, Member> getMemberMap() {
		return this.memberMap;
	}

	public MemberManager() {
		File memberFile = new File("memberFile.ser");

		try {
			boolean exist = memberFile.exists();

			if (exist) {
				this.memberMap = memberIO.loadMemberFile();
				if (this.memberMap == null) {
					this.memberMap = memberIO.loadMemberFile();
				}
			} else {
				FileOutputStream fos = new FileOutputStream(memberFile);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 회원추가
	public boolean memberPut(Member member) {
		if (memberMap.containsKey(member.getId())) {
			return false;
		}
		memberMap.put(member.getId(), member);
		memberIO.saveMemberFile(memberMap);
		return true;

//		Set<Map.Entry<String, Member>> memberSet = memberMap.entrySet();
//		Iterator<Map.Entry<String, Member>> iter = memberSet.iterator();
//		boolean bool = false;
//		
//		while(iter.hasNext()) {
//			Entry<String, Member> entry = iter.next();
//			if(member.getId().equals(entry.getKey())) {
//				bool =  false;
//			}else {
//				// 생성된 Member객체를 Map에 추가
//				memberMap.put(member.getId(), member);
//				// 실제 파일에도 실시간 기록
//				memberIO.saveMemberMap(memberMap);
//				bool = true;
//			}
//		}
//		return bool;	
	}

	// 회원탈퇴
	public boolean memberRemove(Member member) {
		
		if (memberMap.containsKey(member.getId())) {
			if (!member.getPassword().equals(memberMap.get(member.getId()).getPassword())) {
				System.out.println("비밀번호가 일치하지 않습니다.");
				return false;
			} else {
				memberMap.remove(member.getId());
				memberIO.saveMemberFile(memberMap);
				return true;
			}
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return false;
		}
	}

	// 로그인
	public boolean login(Member member) {

		if (memberMap.containsKey(member.getId())) {
			if (!member.getPassword().equals(memberMap.get(member.getId()).getPassword())) {
				System.out.println("비밀번호가 일치하지 않습니다.");
				return false;
			} else {
				this.user = member.getId();
				return true;
			}
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return false;
		}
	}

	// 잔액확인
	public void status() {
		System.out.printf("[%s]님의 현재 잔액은 [%d]원입니다.\n", user, memberMap.get(user).getBalance());
	}

	// 계좌충전
	public boolean deposit(long money) {
		if (money > 0) {
			long totalMoney = memberMap.get(user).getBalance() + money;
			memberMap.get(user).setBalance(totalMoney);
			memberIO.saveMemberFile(memberMap);
			return true;
		}
		return false;
	}

	// 장바구니 추가
	public boolean addBasket(int index, Menu menu) {
		
		basketStore.add(index);

		if (memberMap.get(user).getBasket() == null) {
			menuList.add(menu);
			memberMap.get(user).setBasket(menuList);
			totalPrice += menu.getPrice();
			System.out.println(memberMap.get(user).getBasket());
			return true;
		} else {
			if (basketStore.get(0).equals(index)) {
			menuList.add(menu);
			memberMap.get(user).setBasket(menuList);
			totalPrice += menu.getPrice();
			System.out.println(memberMap.get(user).getBasket());
			return true;
			} else {
				System.out.println("같은 가게의 메뉴만 장바구니에 담을 수 있습니다.");
				return false;
			}
		}
	}

	// 장바구니 비우기
	public void removeBasket() {
		basketStore.removeAll(basketStore);
		menuList.removeAll(menuList);
		memberMap.get(user).setBasket(null);
	}

	// 주문
	public boolean subBalance() {
		long balance = 0;
		balance = memberMap.get(user).getBalance();
		if (balance >= totalPrice) {
			memberMap.get(user).setBalance(balance -= totalPrice);
			removeBasket();
			memberIO.saveMemberFile(memberMap);
			return true;
		} else {
			System.out.println("잔액이 부족합니다. 충전해주세요.");
			removeBasket();
			return false;
		}
	}
    // 환불
    public void refund() {
        long balance = memberMap.get(user).getBalance();
        memberMap.get(user).setBalance(balance += totalPrice);
        removeBasket();
        memberIO.saveMemberFile(memberMap);
        removeBasket();
        System.out.printf("주문취소하여 환불되었습니다. 환불금액 : %s, 현재 잔액 : %s\n", totalPrice, balance);
    }
    

    public void run() {
        boolean bool = subBalance();
        if (bool == true) {
        	long start = System.currentTimeMillis();
            Thread stopThread = new Thread(new SleepThread(1000));
            stopThread.start();
            new Scanner(System.in).nextLine();
            stopThread.interrupt();
            long end = System.currentTimeMillis();
            if(!((end - start) > 11000)) {
                refund(); 
            }else {
               return;
            }
        } else {
            return;
        }
        return;
    }
    class SleepThread implements Runnable {
    	String[] array = new String[] { "!!조리시작!! 10초안에 아무키나 누르면 주문이 취소됩니다.", "~~조리중~~ 9초안에 아무키나 누르면 주문이 취소됩니다.",
    			"~~조리중~~ 8초안에 아무키나 누르면 주문이 취소됩니다.", "~~조리중~~ 7초안에 아무키나 누르면 주문이 취소됩니다.", "~~조리중~~ 6초안에 아무키나 누르면 주문이 취소됩니다.",
    			"!!배달시작!! 5초안에 아무키나 누르면 주문이 취소됩니다.", "~~배달중~~ 4초안에 아무키나 누르면 주문이 취소됩니다.", "~~배달중~~ 3초안에 아무키나 누르면 주문이 취소됩니다.",
    			"~~배달중~~ 2초안에 아무키나 누르면 주문이 취소됩니다.", "~~배달중~~ 1초안에 아무키나 누르면 주문이 취소됩니다.", "!!!배달 완료!!! 맛있게 드세요~~~" };
    	
        private int milli;

        public SleepThread(int milli) {
            super();
            this.milli = milli;
        }

        @Override
        public void run() {
                for(int i = 0; i < array.length; i++){
                    try {
                    	System.out.printf("%s\n", array[i]);
                        Thread.sleep(milli);
                    } catch (InterruptedException e) {
                    	return;
                    }
                }
                return;
        }
    }
}
