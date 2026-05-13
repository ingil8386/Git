package sub1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileIOTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\GGG\\Desktop\\test1.txt";
		String target = "C:\\Users\\GGG\\Desktop\\test2.txt";

		try {
			FileInputStream fis = new FileInputStream(source); // 파일 읽기
			FileOutputStream fos = new FileOutputStream(target); // 파일 쓰기

			while (true) {
				int data = fis.read();

				if (data == -1) {
					break;
				}
				char ch = (char) data;
				System.out.println(ch);
				fos.write(data);

			}

			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("프로그램종료");
	}
}