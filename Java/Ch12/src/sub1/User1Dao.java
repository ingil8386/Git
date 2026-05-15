package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User1Dao {

	// DB 정보
	private static String host = "jdbc:mysql://127.0.0.1:3306/studydb";
	private static String user = "heocoding";
	private static String pass = "1234";

	// 입력
	public static void insert(User1DTO dto) {
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);

			String sql = "INSERT INTO User1 VALUES (?, ?, ?, ?)";
			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getUserid());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getHp());
			psmt.setInt(4, dto.getAge());

			psmt.executeUpdate();

			psmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 수정
	public static void update(User1DTO dto) {
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);

			String sql = "UPDATE User1 SET "
					+ "name = ?, "
					+ "hp = ?, "
					+ "age = ? "
					+ "WHERE userid = ?";

			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getHp());
			psmt.setInt(3, dto.getAge());
			psmt.setString(4, dto.getUserid());

			psmt.executeUpdate();

			psmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 삭제
	public static void delete(User1DTO dto) {
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);

			String sql = "DELETE FROM User1 WHERE userid = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getUserid());

			psmt.executeUpdate();

			psmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 조회
	public static void select() {
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);

			String sql = "SELECT * FROM User1";
			PreparedStatement psmt = conn.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				String userid = rs.getString("userid");
				String name = rs.getString("name");
				String hp = rs.getString("hp");
				int age = rs.getInt("age");

				System.out.println("----------------------------");
				System.out.println("userid : " + userid);
				System.out.println("name   : " + name);
				System.out.println("hp     : " + hp);
				System.out.println("age    : " + age);
			}

			rs.close();
			psmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}