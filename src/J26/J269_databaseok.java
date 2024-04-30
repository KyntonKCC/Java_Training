package J26;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class J269_databaseok {

	public static void main(String[] args) throws Exception {
		J268_memberframe member = new J268_memberframe();
		Connection conn = null;
		Statement st = null;
		String url = "jdbc:mysql://localhost:3306/passocp?serverTimezone=Asia/Taipei&useSSL=false&useUnicode=true&characterEncoding=utf-8";
		String user = "root"; // 帳戶 root
		String password = "Kaicheng0928"; // root 密碼
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("成功連結 Bank_db 資料庫");
		} catch (Exception e) {
			System.out.println(e);
		}
		Statement stmt = conn.createStatement();

		String sql6 = "SELECT * FROM pcok";
		ResultSet rs = stmt.executeQuery(sql6);
		ResultSetMetaData rsm = rs.getMetaData();
		System.out.println("總欄數為:" + rsm.getColumnCount());
		if (rs.next()) {
			member.textID.setText(String.valueOf(rs.getInt("ID")));
			member.textName.setText(rs.getString("NAME"));
			member.textSex.setText(rs.getString("SEX"));
			member.textEmail.setText(rs.getString("EMAIL"));
		}
		member.buttonNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					if (rs.next()) {
						member.textID.setText(String.valueOf(rs.getInt("ID")));
						member.textName.setText(rs.getString("NAME"));
						member.textSex.setText(rs.getString("SEX"));
						member.textEmail.setText(rs.getString("EMAIL"));
					}
				} catch (SQLException ea) {
				}
				;
			}
		});
		member.buttonPrev.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					if (rs.previous()) {
						member.textID.setText(String.valueOf(rs.getInt("ID")));
						member.textName.setText(rs.getString("NAME"));
						member.textSex.setText(rs.getString("SEX"));
						member.textEmail.setText(rs.getString("EMAIL"));
					}
				} catch (SQLException ea) {
				}
				;
			}
		});
		member.buttonEnd.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});

	}

}
