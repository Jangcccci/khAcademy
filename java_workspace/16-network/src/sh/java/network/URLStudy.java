package sh.java.network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

public class URLStudy {

	public static void main(String[] args) {
		URLStudy study = new URLStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	
	/**
	 * @실습문제 : 인터넷 이미지파일 다운로드
	 */
	private void test3() {
		try {
			URL url = new URL("https://mblogthumb-phinf.pstatic.net/MjAyMDA5MzBfMTQz/MDAxNjAxNDU0NjQ2MTQ2.j4BF8brAORpqM95d7-_yolEFGB-kEvZRqDZ3MZtD9ekg.AfCQ6EZbvdwRg0_BA-73lN2grfPCBoFBJ2ubhYENy9sg.JPEG.yunny_23/3D056E1A-9BB0-40C8-9046-9EB7B48E98E3-323-0000003CDE7A5723_file.jpg?type=w800");
			URLConnection conn = url.openConnection();
			try(BufferedInputStream bi = new BufferedInputStream(conn.getInputStream());
				BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("image.jpg"));	){
//				int data = 0;
				byte[] data = new byte[8192];
				int len = 0;
				while((len = bi.read(data)) != -1) {
					System.out.println(Arrays.toString(data));
					bo.write(data, 0, len);
				}
				System.out.println("파일 다운로드 완료!");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	/**
	 * URL + URLConnection
	 */
	private void test2() {
		try {
			URL url = new URL("https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html");
			URLConnection conn = url.openConnection();
			// 응답을 읽을 입력스트림
			try(BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new FileWriter("InetAddress.html"));
					){
				String data = null;
				while((data = br.readLine()) != null) {
					System.out.println(data);
					bw.write(data);
					bw.newLine();
				}
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * URI
	 * - URL
	 * - URN
	 * 
	 * java.net.URL 인터넷주소를 파싱(parsing)해서 관리하는 클래스
	 */
	private void test1() {

		try {
			URL url = new URL("https://docs.oracle.com:443/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html?username=honggd&mode=readonly#getByName(java.lang.String)");
			System.out.println(url.getProtocol()); // https
			System.out.println(url.getHost()); // docs.oracle.com
			System.out.println(url.getPort()); // 443
			System.out.println(url.getPath()); // /en/java/javase/11/docs/api/java.base/java/net/InetAddress.html
			System.out.println(url.getQuery()); // username=honggd&mode=readonly
			System.out.println(url.getRef()); // bookmarking/anchor // getByName(java.lang.String)
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
