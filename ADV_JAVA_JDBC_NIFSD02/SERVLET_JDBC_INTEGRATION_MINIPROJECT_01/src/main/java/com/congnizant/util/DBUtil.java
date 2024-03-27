package com.congnizant.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.congnizant.constant.CommonConstant;

public class DBUtil {

	private static DBUtil INSTANCE = null;

	private DBUtil() {

	}

	public static synchronized DBUtil getInstace() {
		if (INSTANCE == null) {
			return new DBUtil();
		}
		return INSTANCE;
	}

	static {
		try {
			Class.forName(CommonConstant.DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * get connection
	 */
	public Connection getConnection() throws SQLException {
		// step2 create the connection object
		Connection con = DriverManager.getConnection(CommonConstant.URL, CommonConstant.USER, CommonConstant.PASSWORD);
		return con;
	}

	public void closeConnection(Statement stmt, Connection con) throws SQLException {
		if (stmt != null) {
			stmt.close();
		}
		if (con != null) {
			con.close();
		}
	}

	public void closeConnection(Statement stmt, Connection con, ResultSet rs) throws SQLException {
		if (stmt != null) {
			stmt.close();
		}
		if (con != null) {
			con.close();
		}
		if (rs != null) {
			rs.close();
		}
	}

}
