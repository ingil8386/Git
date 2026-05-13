package sub1;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\GGG\\Desktop\\test3.txt";
		String target = "C:\\Users\\GGG\\Desktop\\test";

		// 파일 객체 생성
		File f1 = new File(source);
		File f2 = new File(target);

		try {
			// 파일 생성
			boolean fileResult = f1.createNewFile();

			// 디렉터리 생성
			boolean dirResult = f2.mkdir();

			System.out.println("===== 생성 결과 =====");
			System.out.println("파일 생성 여부 : " + fileResult);
			System.out.println("폴더 생성 여부 : " + dirResult);

			System.out.println();
			System.out.println("===== 파일 정보 =====");
			System.out.println("f1 존재 여부 : " + f1.exists());
			System.out.println("f1 파일 여부 : " + f1.isFile());
			System.out.println("f1 폴더 여부 : " + f1.isDirectory());
			System.out.println("f1 파일명 : " + f1.getName());
			System.out.println("f1 경로 : " + f1.getPath());
			System.out.println("f1 절대경로 : " + f1.getAbsolutePath());
			System.out.println("f1 크기 : " + f1.length() + " byte");

			System.out.println();
			System.out.println("===== 폴더 정보 =====");
			System.out.println("f2 존재 여부 : " + f2.exists());
			System.out.println("f2 파일 여부 : " + f2.isFile());
			System.out.println("f2 폴더 여부 : " + f2.isDirectory());
			System.out.println("f2 폴더명 : " + f2.getName());
			System.out.println("f2 경로 : " + f2.getPath());
			System.out.println("f2 절대경로 : " + f2.getAbsolutePath());

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("프로그램 종료");
	}
}