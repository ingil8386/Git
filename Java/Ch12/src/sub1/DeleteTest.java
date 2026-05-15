package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {

		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydatabase";
		String user = "ingil8386";
		String pass = "1234";

		try {
			// 1) 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2) DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);

			//SQL 실행 객체생성
			Statement stmt = conn.createStatement();

			//SQL 실행
			String sql = "DELETE User1 VALUES ('J101','김유신','010-1211-1011',21)";
			stmt.execute(sql);

			//SQL 결과처리
			
			//DB연결헤제
			stmt.close();
			conn.close();
			
			
			
			
			if (conn != null) {

				System.out.println("데이터베이스 접속 성공!!!");
			} 
			else {
				System.out.println("데이터베이스 접속 실패!!!");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("insert 완료");

	}
}
