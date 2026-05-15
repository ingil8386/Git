package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsertTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		// DB 접속 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydatabase";
		String user = "ingil8386";
		String pass = "1234";

		System.out.println("데이터베이스 매니지먼트 프로그램");

		while (!exit) {
			System.out.println("--------------------------------");
			System.out.println("작업을 선택하세요");
			System.out.println("0:종료, 1:입력, 2:조회, 3:수정, 4:삭제");
			System.out.print("선택 : ");

			int choiced = sc.nextInt();

			switch (choiced) {

			case 0:
				exit = true;
				break;

			case 1:
				System.out.println("[입력작업]");

				System.out.print("userid 입력 : ");
				String userid = sc.next();

				System.out.print("name 입력 : ");
				String name = sc.next();

				System.out.print("hp 입력 : ");
				String hp = sc.next();

				System.out.print("age 입력 : ");
				int age = sc.nextInt();

				try {
					Connection conn = DriverManager.getConnection(host, user, pass);

					String sql = "INSERT INTO User1 VALUES (?, ?, ?, ?)";
					PreparedStatement psmt = conn.prepareStatement(sql);

					psmt.setString(1, userid);
					psmt.setString(2, name);
					psmt.setString(3, hp);
					psmt.setInt(4, age);

					int result = psmt.executeUpdate();

					if (result > 0) {
						System.out.println("데이터 입력 완료!");
					}

					psmt.close();
					conn.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;

			case 2:
				System.out.println("[조회작업]");

				try {
					Connection conn = DriverManager.getConnection(host, user, pass);

					String sql = "SELECT * FROM User1";
					PreparedStatement psmt = conn.prepareStatement(sql);

					ResultSet rs = psmt.executeQuery();

					System.out.println("--------------------------------");
					System.out.println("userid\tname\thp\t\t\tage");
					System.out.println("--------------------------------");

					while (rs.next()) {
						String rUserid = rs.getString("userid");
						String rName = rs.getString("name");
						String rHp = rs.getString("hp");
						int rAge = rs.getInt("age");

						System.out.println(rUserid + "\t" + rName + "\t" + rHp + "\t" + rAge);
					}

					rs.close();
					psmt.close();
					conn.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;

			case 3:
				System.out.println("[수정작업]");

				System.out.print("수정할 userid 입력 : ");
				String updateUserid = sc.next();

				System.out.print("새 name 입력 : ");
				String updateName = sc.next();

				System.out.print("새 hp 입력 : ");
				String updateHp = sc.next();

				System.out.print("새 age 입력 : ");
				int updateAge = sc.nextInt();

				try {
					Connection conn = DriverManager.getConnection(host, user, pass);

					String sql = "UPDATE User1 SET name = ?, hp = ?, age = ? WHERE userid = ?";
					PreparedStatement psmt = conn.prepareStatement(sql);

					psmt.setString(1, updateName);
					psmt.setString(2, updateHp);
					psmt.setInt(3, updateAge);
					psmt.setString(4, updateUserid);

					int result = psmt.executeUpdate();

					if (result > 0) {
						System.out.println("데이터 수정 완료!");
					} else {
						System.out.println("해당 userid가 존재하지 않습니다.");
					}

					psmt.close();
					conn.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;

			case 4:
				System.out.println("[삭제작업]");

				System.out.print("삭제할 userid 입력 : ");
				String deleteUserid = sc.next();

				try {
					Connection conn = DriverManager.getConnection(host, user, pass);

					String sql = "DELETE FROM User1 WHERE userid = ?";
					PreparedStatement psmt = conn.prepareStatement(sql);

					psmt.setString(1, deleteUserid);

					int result = psmt.executeUpdate();

					if (result > 0) {
						System.out.println("데이터 삭제 완료!");
					} else {
						System.out.println("해당 userid가 존재하지 않습니다.");
					}

					psmt.close();
					conn.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;

			default:
				System.out.println("잘못 입력했습니다. 다시 선택하세요.");
				break;
			}
		}

		System.out.println("프로그램 종료");
		sc.close();
	}
}