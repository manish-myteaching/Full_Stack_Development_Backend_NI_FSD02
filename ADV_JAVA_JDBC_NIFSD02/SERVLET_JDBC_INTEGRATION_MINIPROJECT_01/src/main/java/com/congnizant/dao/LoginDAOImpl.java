package com.congnizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.congnizant.constant.QueryConstant;
import com.congnizant.util.DBUtil;
import com.congnizant.vo.UserInfoVO;

public class LoginDAOImpl implements LoginDAO {

	private static LoginDAOImpl INSTANCE = null;

	private LoginDAOImpl() {

	}

	public static synchronized LoginDAO getInstace() {
		if (INSTANCE == null) {
			return new LoginDAOImpl();
		}
		return INSTANCE;
	}

	@Override
	public boolean getLogin(String userName, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		System.out.println("DAO Layer=>" + "getLogin");
		try {
			con = DBUtil.getConnection();
			System.out.println("Perform the operation with DB");
			// step3 create the statement object

			pstmt = con.prepareStatement(QueryConstant.SELECT_USER_INFO_QUERY);
			pstmt.setString(1, userName);
			pstmt.setString(2, password);

			// step4 execute query
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {	
				DBUtil.closeConnection(pstmt, con, rs);		
		}

	}

}
