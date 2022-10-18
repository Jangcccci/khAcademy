package net.network.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// 키보드로 호스트명 또는 도메인명을 입력받는다.
			System.out.print("도메인명을 입력해주세요 : ");
			String domainName = sc.nextLine();
			//입력받은 호스트명을 가지고, ip 주소를 조회해서 출력한다.
			InetAddress[] ipAddress = InetAddress.getAllByName(domainName);
			if(ipAddress.length > 0) {
				//조회한 ip 갯수가 1개 이상이면 루프문으로 모두 출력함
				for(InetAddress ia : ipAddress) {
					System.out.println(ia.getHostAddress());
			}
			}else {
				//예외처리는 try~catch로 직접 처리함
				throw new UnknownHostException();
			}
			
			
		} catch (UnknownHostException e) {
			System.err.println("유효하지 않는 도메인입니다.");
			e.printStackTrace();
		}
		
	}

}
