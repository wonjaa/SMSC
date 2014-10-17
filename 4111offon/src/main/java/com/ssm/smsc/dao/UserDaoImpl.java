package com.ssm.smsc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ssm.smsc.domain.Product;
import com.ssm.smsc.domain.User;
import com.ssm.smsc.util.ConnectTestDB;

public class UserDaoImpl implements UserDao {

	ConnectTestDB ctd;

	@Override
	public void insertUserData(User user) {

		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:3306/smsc";

		String USER = "root";
		String PASS = "smsc";

		Connection conn = null;
		PreparedStatement pstmt = null;


		try {
			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			String sql = "INSERT INTO user (id,pw,age,name) VALUES (?, ?, ?,?);";

			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPw());
			pstmt.setInt(3, user.getAge());
			pstmt.setString(4, user.getName());

			pstmt.executeUpdate();
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					conn.close();
			
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try

	}

	@Override
	public boolean checkUserData(User user) {

		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:3306/smsc";

		String USER = "root";
		String PASS = "smsc";

		Connection conn = null;
		PreparedStatement pstmt = null;

		String id = null;

		try {
			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			String sql = "SELECT id FROM user WHERE id = ? AND pw = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPw());

			ResultSet rs = pstmt.executeQuery();
			// STEP 5: Extract data from result set
			while (rs.next()) {
				id = rs.getString("id");

			}
			rs.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					conn.close();
			
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try

		boolean check = false;
		
		
		if (id.equals(user.getId())) {
			check = true;
		}
		return check;

	}

	

}
