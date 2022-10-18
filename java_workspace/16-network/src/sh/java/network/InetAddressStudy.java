package sh.java.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressStudy {

	public static void main(String[] args) {
		InetAddressStudy study = new InetAddressStudy();
//		study.test1();
		study.test2();
		
	}

	/**
	 * 내 컴퓨터의 ip주소
	 * - localhost 내 컴퓨터를 가리키는 도메인 네임
	 * - 127.0.0.1 내 컴퓨터를 가리키는 ip주소
	 * 
	 */
	private void test2() {

		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost.getHostAddress()); // 강의장 네트워크내
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	/**
	 * java.net.InetAddress
	 * 
	 * - 호스트명(도메인)과 ip주소를 관리하는 클래스
	 * - InetAddress는 생성자 호출이 아닌 static메소드를 통해 객체를 생성
	 * 
	 */
	private void test1() {

		try {
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println(naver.getHostAddress()); // 223.130.200.104
			
			InetAddress[] navers = InetAddress.getAllByName("naver.com");
			for(InetAddress n : navers) {
				System.out.println(n.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
