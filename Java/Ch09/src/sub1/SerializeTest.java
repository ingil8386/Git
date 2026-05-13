package sub1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializeTest {
	public static void main(String[] args) {
		Apple apple = new Apple("대한민국", 5000);

		String path = "C:\\Users\\GGG\\Desktop\\apple.data";

		try {
			FileOutputStream fos = new FileOutputStream(path);

			// 직렬화를 위한 보조 스트림
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// 객체 직렬화
			oos.writeObject(apple);

			// 스트림 닫기
			oos.close();

			System.out.println("객체 직렬화 완료");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}