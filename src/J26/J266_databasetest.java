package J26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class J266_databasetest {

	public static void main(String[] args) throws Exception {
		// 在libs資料夾內的所有 .jar 檔上點右鍵 > Build path > add to build path 即會存於Referenced Libraries資料夾內
		Connection $conn = DriverManager.getConnection("jdbc:derby:J266_databasetest_hello1;create=true");

		String url = "jdbc:derby:J266_databasetest_hello2;create=true";
		Connection conn = null;
		Statement st = null;
		conn = DriverManager.getConnection(url);
		System.out.println("資料庫連結成功");
		st = conn.createStatement();
		// 建立資料表
		String sql = "CREATE TABLE frp(" + "ID INTEGER not null primary key," + "NAME VARCHAR(10),"
				+ "GENDER VARCHAR(5)," + "EMAIL VARCHAR(50)" + ")";
		st.executeUpdate(sql);
		// 插入紀錄
		String sql2 = "INSERT INTO frp(id,name,gender,email)" + "VALUES(2,\'KyntonKCC\',\'Sir\',\'kyntonchuang2003@gmail.com\')";
		st.executeUpdate(sql2);
		// 查看紀錄
		String sql3 = "select * from frp";
		ResultSet rs = st.executeQuery(sql3);
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			String email = rs.getString("email");
			System.out.printf("%d\t%s\t%s\t%s\n", id, name, gender, email);
		}

	}

}
