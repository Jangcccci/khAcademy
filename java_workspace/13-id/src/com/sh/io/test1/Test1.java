package com.sh.io.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * [실습문제 1]
 - 패키지 : com.sh.io.test1
 - 클래스 : Test1
    >> main() 포함
        => fileSave() 메소드 실행함

    >> 메소드 추가함
    + fileSave() : void
    => 키보드로 사용할 파일명을 입력받음
        BufferedReader의 readLine() 사용함
    => 파일출력용 스트림 객체 생성함
        FileWriter 사용함
    => 화면에 "파일에 저장할 내용을 입력하시오." 출력
        입력값을 읽어들여서 바로 파일에 기록 저장처리
        반복실행함
    => "exit"가 입력되면, 반복은 종료하고
        화면에 "파일에 성공적으로 저장되었습니다." 출력하고
    => 파일출력 스트림을 닫음.
 * @author jangcccci
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Test1 test = new Test1();
		test.fileSave();
	}
	//fileSava메소드 추가
	public void fileSave() {
		
		//=> 키보드로 사용할 파일명을 입력받음
        //BufferedReader의 readLine() 사용함
		FileWriter fw = null;
		System.out.println("파일명을 입력해주세요 : ");
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			//입력받은 파일명으로 파일 생성완료
			fw = new FileWriter(br.readLine());
			//파일에 저장할 내용 입력하기
			String str = null;
			System.out.println("파일에 저장할 내용을 입력하시오.");
			while(!"exit".equals(str = br.readLine())) {
				fw.write(str);
				fw.write("\n");
			}
			System.out.println("파일에 성공적으로 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	/**
	 * - 위에서 작성한 클래스에 메소드 추가함
     >> 메소드
    + fileRead() : void
    => 키보드로 읽을 대상파일명을 입력받음
    => 파일 읽기용 스트림 객체 생성함 : FileReader 사용
    => 파일 안의 내용을 읽어서, StringBuilder 에 보관함
    => 다 읽은 다음, StringBuilder 에 보관된 값을 String으로 바꾸어 화면에 출력함
	 */
	public void fileRead() {
		
	}
}
