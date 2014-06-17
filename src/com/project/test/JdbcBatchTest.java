package com.project.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcBatchTest {
	public static void main(String[] args) {
		String drivername = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String username = "root";
		String password = "787305788";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(drivername);
			conn = DriverManager.getConnection(url , username , password);
			for (int i = 0; i < 10000000; i++) {
				ps=  conn.prepareStatement("insert into users(id,name) values("+i+","+i+")");
				ps.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
