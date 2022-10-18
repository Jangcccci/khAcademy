package sh.java.io._char.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRWStudy {

	public static void main(String[] args) {
		FileRWStudy study = new FileRWStudy();
//		study.test1();
		study.test2();
	}
	/**
	 * 문자기반 스트림을 사용한 복사
	 */
	private void test2() {
		File file = new File("helloworld.txt");
		File copyfile = new File("helloworld-copy3.txt");
		try(
			BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedWriter bw = new BufferedWriter(new FileWriter(copyfile))){
			
			String data = null;
			
			while((data = br.readLine()) != null) {
				bw.write(data);
				bw.write("\n");// br.readLine() 은 한 줄을 읽어서 개행문자를 제외하고 반환하기 때문에 개행처리를 원하면 붙여준다.	
			}
			System.out.println("파일 복사 완료");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * File
	 * 
	 */
	private void test1() {
//		String filename = "helloworld.txt";
		
		//존재하거나 존재하지 않는 실제 파일을 가르키는 자바객체
		File file = new File("helloworld.txt");
		try(
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedReader br = new BufferedReader(new FileReader(file));
				){
			int data = 0;
			
			while((data = bis.read()) != -1) {
				System.out.print((char) data + " "); // byte 단위
			}
			System.out.println();
			
//			while((data = br.read()) != -1) {
//				System.out.print((char) data + " "); // char 단위
//			}
//			System.out.println();
			
			String line = null;
			int n = 0;
			while((line = br.readLine()) != null) {
				System.out.println(++n + " " + line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
