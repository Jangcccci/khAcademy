package sh.java.network.soket.tcp.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	
	private static final String SERVER_IP = "192.168.110.30"; // 127.0.0.1
	private static final int PORT = 7777;
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		new ChatClient().start();
	}

	private void start() {
		try {
			// 1. 서버소켓에 연결요청
			Socket socket = new Socket(SERVER_IP, PORT);
			System.out.println(SERVER_IP + ":" + "에 접속했습니다...");
			
			// 2. 소켓 입출력스트림생성
			try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream())){
				
				String msg = null;
				while((msg = br.readLine()) != null) {

					System.out.println("서버 : " + msg);
					System.out.print("클라이언트 : ");
					String sendMsg = sc.nextLine();
					pw.println(sendMsg);
					pw.flush();
					
					if("exit".equals(sendMsg)) {
						break;
					}
				}
				
			}
			System.out.println("서버와 접속이 해제되었습니다...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
