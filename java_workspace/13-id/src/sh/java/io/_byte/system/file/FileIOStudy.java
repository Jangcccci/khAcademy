package sh.java.io._byte.system.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileIOStudy {

	public static void main(String[] args) {
		FileIOStudy study = new FileIOStudy();
		
//		study.test1();
//		study.test2();
		study.test3();
		
		System.out.println("...정상종료...");
	}
	
	/**
	 * @실습문제 : 다운로드에 있는 Stream구분.png 파일을 읽어서 프로젝트루트에 복사하기
	 * 
	 * 1.7 try with resource구문 지원
	 * - 스트림클래스 생성시 자동으로 반환
	 */
	private void test3() {
		String filename = "/Users/jangcccci/Downloads/Stream.png";
		String copyFilename = "Stream-copy.png";
		
//		BufferedInputStream bis = null;
//		BufferedOutputStream bos = null;
//		try {
//			bis = new BufferedInputStream(new FileInputStream(filename));
//			bos = new BufferedOutputStream(new FileOutputStream(copyFilename));
		// 객체 생성하고 try에 finally 계속 쓰면 귀찮으니까 try(객체생성)하면 된다.
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFilename));){
			
			int len = 0;
			byte[] bf = new byte[8192];
			while((len = bis.read(bf)) != -1) {
					System.out.println(len + " " + Arrays.toString(bf));
					bos.write(bf, 0, len); // 읽어온 만큼만 처리하겠다.
				}
				System.out.println("파일 복사 완료!");
			} catch(Exception e) {
				e.printStackTrace();
			}
//		finally {
//				try {
//					bis.close();
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//				
//				try {
//					bos.close();
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
	}
	/**
	 * 주스트림 + 보조스트림
	 * - FileInputStream + BufferedInputStream
	 * - FileOutPutStream + BufferedOutputStream
	 */
	private void test2() {
		String filename = "helloworld.txt";
		String copyFilename = "helloworld-copy2.txt";
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(filename));
			bos = new BufferedOutputStream(new FileOutputStream(copyFilename));
			
			int len = 0;
			byte[] bf = new byte[8192]; // 8kb - BufferedInputStream 내부적으로 사용하는 버퍼
			while((len = bis.read(bf)) != -1) {
				System.out.println(len + " " + Arrays.toString(bf)); // 콘솔 출력
				bos.write(bf, 0, len); // 0번지부터 읽어온 마지막 번지까지 파일 출력
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 대상이 파일인 입출력
	 * 
	 * - 상대경로(현재위치 기준으로 찾는 경로) - java프로그램에서는 프로젝트 루트기준
	 * - 절대경로(루트부터 시작하는 경로: window c:\ / mac, linux : /)
	 * 
	 * 모든 스트림객체는 사용 후 반납(close)해야 한다.
	 * 
	 * - 같은 파일에 대해서는 동시에 입출력하지 않는다.
	 * 
	 */
	private void test1() {
//		String fileName = "helloworld.txt"; //상대경로
//		String copyFileName = "helloworld-copy.txt";
		String fileName = "/Users/jangcccci/Workspaces/java_workspace/13-id/helloworld.txt"; //절대경로
		String copyFileName = "/Users/jangcccci/Workspaces/java_workspace/13-id/helloworld-copy.txt";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fileName); // throws FileNotFoundException
//			fos = new FileOutputStream(copyFileName); 
			// 존재하지 않는 파일인 경우 새로 생성한다.
			// 존재하는 파일인 경우 뎦어쓴다.
			fos = new FileOutputStream(copyFileName, true); 
			// 존재하는 파일인 경우 이어쓰기 모드가 된다.
			
			int data = 0;
			while((data = fis.read()) != -1) {// throws IOException
				System.out.println(data + " " + (char) data); // 콘솔에 출력
				fos.write(data); // 파일에 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} 
//			catch (IOException e) {
//				e.printStackTrace();
//			} catch (NullPointerException e) {//파일명을 잘못 입력한 경우 null.close()가 실행되기 때문에.
//				e.printStackTrace();
//			}
			catch(Exception e) { // 보통 여러개 쓰기 귀찮으니 Exception으로 퉁친다.
				e.printStackTrace();
			}
			// fis.close();에서 예외가 발생되면 fos는 close가 되지 않기 때문에 같이 쓰지 않는다.
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
