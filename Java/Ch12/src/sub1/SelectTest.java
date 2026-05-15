package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 날짜 : 2026/05/15 이름 : 허민재 내용 : Java CRUD Insert 실습
 */
public class SelectTest {

	public static void main(String[] args) {

		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydatabase";
		String user = "ingil8386";
		String pass = "1234";

		try {
			// 1) DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);

			// 2) SQL 실행 객체 생성
			Statement stmt = conn.createStatement();

			String sql = "SELECT * FROM User1";
			ResultSet rs = stmt.executeQuery(sql);

			// 4) SQL 결과처리(SELECT 작업일 경우)
			while (rs.next()) {
				System.out.println("아이디 : " + rs.getString(1)); // 커서가 가르키는 튜플의 1번 컬럼값 참조
				System.out.println("이름 : " + rs.getString(2));
				System.out.println("휴대폰 : " + rs.getString(3));
				System.out.println("나이 : " + rs.getString(4));
			}

			// 5) DB 연결해제
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("select 완료...");

	}
}