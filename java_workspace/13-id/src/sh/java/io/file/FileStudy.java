package sh.java.io.file;

import java.io.File;

public class FileStudy {

	public static void main(String[] args) {

		FileStudy study = new FileStudy();
		study.test1();
	}
	
	/**
	 * 
	 * java.io.File
	 * 	- 실제 파일을 가리키는 자바객체
	 */
	private void test1() {
		File file = new File("helloworld.txt");
		System.out.println(file.exists()); //파일이 존재하니?
		System.out.println(file.getPath()); // helloworld.txt
		System.out.println(file.getAbsolutePath()); // 절대경로 : /Users/jangcccci/Workspaces/java_workspace/13-id/helloworld.txt

		File foo = new File("foo");
		System.out.println(foo.exists());
		foo.mkdir(); // 디렉토리로 만들기 make directory
		System.out.println(foo.exists());
		System.out.println(foo.isDirectory());//디렉토리가 존재하니?
		
		File kar = new File("foo/bar/too/helloworld.txt");
		System.out.println(kar.exists());
		kar.mkdirs(); // 여러개의 디렉토리를 생성할때
		System.out.println(kar.exists());
		
		File destFile = new File("foo/bar/too/kar/helloworld.txt");
		file.renameTo(destFile);// 이동
		System.out.println(file.exists());
		System.out.println(destFile.exists());
	}

}
