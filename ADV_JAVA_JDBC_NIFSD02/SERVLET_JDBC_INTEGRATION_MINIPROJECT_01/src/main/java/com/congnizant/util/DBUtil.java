package com.congnizant.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.congnizant.constant.CommonConstant;

public class DBUtil {

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
	public static Connection getConnection() throws SQLException {
		// step2 create the connection object
		Connection con = DriverManager.getConnection(CommonConstant.URL, CommonConstant.USER, CommonConstant.PASSWORD);
		return con;
	}

	public static void closeConnection(Statement stmt, Connection con)  {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public static void closeConnection(Statement stmt, Connection con, ResultSet rs) {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

}
