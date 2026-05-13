package sub1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DeserialTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\GGG\\Desktop\\apple.data";

		try {
			// 파일 입력 스트림
			FileInputStream fis = new FileInputStream(path);

			// 역직렬화를 위한 보조 스트림
			ObjectInputStream ois = new ObjectInputStream(fis);

			// 객체 역직렬화
			Apple apple = (Apple) ois.readObject();

			// 읽어온 객체 확인
			apple.show();

			// 스트림 닫기
			ois.close();

			System.out.println("객체 역직렬화 완료");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}