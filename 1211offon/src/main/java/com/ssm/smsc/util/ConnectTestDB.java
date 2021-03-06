package com.ssm.smsc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTestDB {

	public void connectTest() {

		Connection conn;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ea) {
			System.err.print("ClassNotFoundException: ");
		}

		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/smsc";// 사용하는 데이터베이스명을
																// 포함한 url
			String userId = "root";// 사용자계정
			String userPass = "smsc";// 사용자 패스워드

			conn = DriverManager.getConnection(jdbcUrl, userId, userPass);// Connection
																			// 객체를
																			// 얻어냄

			stmt = conn.createStatement();// Statement 객체를 얻어냄

			System.out.println("제대로 연결되었습니다");// 성공시 화면에 표시됨

			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}

	public void selectQuery(){
	}
	
}
