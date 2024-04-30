package J26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class J267_mysqltest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/passocp?useSSL=false&useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String pw = "Kaicheng0928";
		Connection conn = null;
		Statement st = null;
		try {
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("資料庫連結成功");
			st = conn.createStatement();
			String sql = "select * from highscore";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				//注意資料表的資料型態是否相同
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("score");
				//注意資料表的資料型態是否相同
				System.out.printf("%d\t%s\t%d\t\n", id, name, age);
			}
		} catch (SQLException ex) {
			System.out.println(ex);
		}

	}

}
