package sh.java.collections.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesStudy {
	/**
	 * Properties
	 * - HashTable 상속
	 * - K, V의 타입을 String, String으로 단순화한 map클래스.
	 * - 환경설정 정보등을 관리하는데 최적화되어 있다.
	 * @param args
	 */

	public static void main(String[] args) {
		PropertiesStudy study = new PropertiesStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	/**
	 * @실습문제 : resources/app.properties 파일 읽어와서 출력하기
	 */
	private void test3() {
		Properties prop = new Properties();
		File srcFile = new File("resources/app.properties");
//		== File srcFile = new File("resources/app", "properties"); // 부모디렉토리, 파일명
		try {
			prop.load(new FileReader(srcFile));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Set<String> keySet = prop.stringPropertyNames();
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = prop.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}
	/**
	 * file -> prop객체로 불러오기
	 */
	private void test2() {
		Properties prop = new Properties();
		File srcFile = new File("user.properties");
		try {
//			prop.load(new FileReader(srcFile));
			prop.loadFromXML(new FileInputStream("user.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		// prop의 특정요소 가져오기
		String userName = prop.getProperty("username");
		String password = prop.getProperty("password");
		String url = prop.getProperty("url");
		String xxx = prop.getProperty("xxx");
		
		System.out.println("username = " + userName);
		System.out.println("password = " + password);
		System.out.println("url = " + url);
		System.out.println("xxx = " + xxx); // null
		
		// 모든 요소 열람(keySet과 유사)
		Set<String> keySet = prop.stringPropertyNames();
		for(String key : keySet) {
			System.out.println(key + " = " + prop.getProperty(key));
		}
		
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = prop.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}
	/**
	 * prop객체 -> file저장
	 */
	private void test1() {
		Properties prop = new Properties();
		prop.setProperty("username", "honggd");
		prop.setProperty("password", "1234");
		prop.setProperty("url", "http://honggd.space");
		
		System.out.println(prop);
		
		//파일에 쓰기
		File destFile = new File("user.properties"); // 확장자는 꼭 properties가 아니어도 된다.
		try {
			prop.store(new FileWriter(destFile), "user information");// 출력 스트림, 주석
			prop.storeToXML(new FileOutputStream("user.xml"), "user information");
			
			System.out.println("user 출력완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
