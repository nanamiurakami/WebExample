package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemoDAO {
	static final String URL =  "jdbc:mysql://localhost/memo?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";

//メモの全部を見つける
	public ArrayList<Memo> findAll() {
		ArrayList<Memo> list = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(URL,USER,PASS);){

			String sql = "SELECT * FROM memo";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int mid = rs.getInt("mid");
				String title = rs.getString("title");
				String body =rs.getString("body");

				Memo m = new Memo (mid,title,body);
				list.add(m);

			}
			stmt.close();

		} catch (SQLException e) {
			System.out.println("findAllエラー:"+e.getMessage());
			}
		return list;
	}

//midでメモを見つける
	public Memo findByMid(int mid) {
		Memo m = null;
		try (Connection con = DriverManager.getConnection(URL,USER,PASS);){

			String sql = "SELECT * FROM memo WHERE mid=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, mid);

			ResultSet rs = stmt.executeQuery();

			if(rs.next()) {
				String title = rs.getString("title");
				String body =rs.getString("body");

				m = new Memo(mid,title,body);
			}

			stmt.close();

		} catch (SQLException e) {
			System.out.println("findByMidエラー:"+e.getMessage());
		}
		return m;
	}


}



