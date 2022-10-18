package sh.java.network.soket.tcp.chat.server;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	private static int PORT = 7777;
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		new ChatServer().start();
		
	}

	/**
	 * chat server
	 */
	private void start() {
		try {
			// 1. ServerSocket생성
			ServerSocket serverSocket = new ServerSocket(PORT);
			InetAddress localhost = InetAddress.getLocalHost();
			
			while(true) {
				System.out.println(localhost.getHostAddress() + ":" + PORT + "에서 챗서버 응답대기...");
				
				// 2. 클라이언트 최초 요청처리
				Socket socket = serverSocket.accept();
				System.out.println(socket.getInetAddress().getHostAddress() + "로부터 연결요청!");
				
				// 3. 소켓 입출력스트림객체 생성
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream());){
					
					// 웰컴메세지 전송
					pw.println("🍔환영합니다🍕");
					pw.flush();
					
					String msg = null;
					while((msg = br.readLine()) != null) {
						if("exit".equals(msg)) {
							System.out.println("클라이언트가 채팅을 나갔습니다.");
						}
						
						System.out.println("클라이언트 : " + msg);
						System.out.print("서버 : ");
						pw.println(sc.nextLine());
						pw.flush();
						
					}
				}
				
				System.out.println(socket.getInetAddress().getHostAddress() + "로부터 연결이 해제되었습니다...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
