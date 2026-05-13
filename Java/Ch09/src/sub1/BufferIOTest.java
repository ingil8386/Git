package sub1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class BufferIOTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\GGG\\Desktop\\universe.mp4";
		String target = "C:\\Users\\GGG\\Desktop\\result.mp4";

		try {
			// 원본 파일 전체 크기
			File file = new File(source);
			long totalSize = file.length();

			// 기본 스트림
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);

			// 보조 스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			// 한 번에 읽을 바이트 배열
			byte[] buffer = new byte[1024];

			long copiedSize = 0; // 지금까지 복사한 크기
			int readByte = 0;
			int oldPercent = -1; // 같은 퍼센트 반복 출력 방지

			while ((readByte = bis.read(buffer)) != -1) {
				// 읽은 만큼 파일에 쓰기
				bos.write(buffer, 0, readByte);

				// 복사된 크기 누적
				copiedSize += readByte;

				// 진행률 계산
				int percent = (int) ((copiedSize * 100) / totalSize);

				// 퍼센트가 바뀔 때만 출력
				if (percent != oldPercent) {
					System.out.println("복사 진행률 : " + percent + "%");
					oldPercent = percent;
				}
			}

			// 버퍼 비워내기
			bos.flush();

			// 닫기
			bis.close();
			bos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램종료");
	}
}