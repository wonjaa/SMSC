package com.ssm.smsc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ssm.smsc.domain.Product;
import com.ssm.smsc.domain.User;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> getAllProductData() {
		String JDBC_DRIVER = "cubrid.jdbc.driver.CUBRIDDriver";
		String DB_URL = "jdbc:cubrid:localhost:30000:smsc:::";

		String USER = "dba";
		String PASS = "smsc";

		Connection conn = null;
		PreparedStatement pstmt = null;

		List<Product> pList = new ArrayList<Product>();
		
		

		try {
			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			String sql = "SELECT product_no, [name], [desc], number	FROM product";

			pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			// STEP 5: Extract data from result set
			while (rs.next()) {
				Product product = new Product();
				product.setProduct_no(rs.getInt("product_no"));
				product.setName(rs.getString("name"));
				product.setDesc(rs.getString("desc"));
				product.setNumber(rs.getInt("number"));		
						
				pList.add(product);

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

		System.out.println(pList.toString());
		return pList;
	}

	@Override
	public Product getProductData(Integer product_no) {

		String JDBC_DRIVER = "cubrid.jdbc.driver.CUBRIDDriver";
		String DB_URL = "jdbc:cubrid:localhost:30000:smsc:::";

		String USER = "dba";
		String PASS = "smsc";

		Connection conn = null;
		PreparedStatement pstmt = null;

		Product product = new Product();

		try {
			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			String sql = "SELECT product_no, [name], [desc], number	FROM product WHERE [product_no] =?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, product_no);

			ResultSet rs = pstmt.executeQuery();
			// STEP 5: Extract data from result set
			while (rs.next()) {
				product.setProduct_no(rs.getInt("product_no"));
				product.setName(rs.getString("name"));
				product.setDesc(rs.getString("desc"));
				product.setNumber(rs.getInt("number"));

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

		return product;
	}

	@Override
	public void updateProductData(Product product) {
		String JDBC_DRIVER = "cubrid.jdbc.driver.CUBRIDDriver";
		String DB_URL = "jdbc:cubrid:localhost:30000:smsc:::";

		String USER = "dba";
		String PASS = "smsc";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			String sql = "UPDATE product SET [name]=?, [desc]=?, number=? WHERE	[product_no]=?;";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, product.getName());
			pstmt.setString(2, product.getDesc());
			pstmt.setInt(3, product.getNumber());
			pstmt.setInt(4, product.getProduct_no());

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
	public void insertProductData(Product product) {
		String JDBC_DRIVER = "cubrid.jdbc.driver.CUBRIDDriver";
		String DB_URL = "jdbc:cubrid:localhost:30000:smsc:::";

		String USER = "dba";
		String PASS = "smsc";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			String sql = "INSERT INTO product (product_no, [name], [desc], number) VALUES (?, ?, ?, ?);";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, product.getProduct_no());
			pstmt.setString(2, product.getName());
			pstmt.setString(3, product.getDesc());
			pstmt.setInt(4, product.getNumber());

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
	public int getTotalProductNum() {

		String JDBC_DRIVER = "cubrid.jdbc.driver.CUBRIDDriver";
		String DB_URL = "jdbc:cubrid:localhost:30000:smsc:::";

		String USER = "dba";
		String PASS = "smsc";

		Connection conn = null;
		PreparedStatement pstmt = null;

		int count = 0;

		try {
			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			String sql = "SELECT count(*) FROM product";

			pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			// STEP 5: Extract data from result set
			while (rs.next()) {
				count = rs.getInt("count(*)");

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

		return count;
	}

	@Override
	public void deleteProductData(Integer product_no) {

		String JDBC_DRIVER = "cubrid.jdbc.driver.CUBRIDDriver";
		String DB_URL = "jdbc:cubrid:localhost:30000:smsc:::";

		String USER = "dba";
		String PASS = "smsc";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			String sql = "DELETE FROM product WHERE product_no = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, product_no);

			pstmt.executeUpdate();
			// STEP 5: Extract data from result set

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

}
