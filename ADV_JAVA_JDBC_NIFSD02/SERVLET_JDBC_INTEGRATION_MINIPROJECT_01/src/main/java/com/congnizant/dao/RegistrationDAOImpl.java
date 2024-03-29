package com.congnizant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.congnizant.constant.QueryConstant;
import com.congnizant.dto.UserInfoDTO;
import com.congnizant.util.DBUtil;
import com.congnizant.vo.UserInfoVO;

public class RegistrationDAOImpl implements RegistrationDAO {

	private static RegistrationDAOImpl INSTANCE = null;

	private RegistrationDAOImpl() {

	}

	public static synchronized RegistrationDAO getInstace() {
		if (INSTANCE == null) {
			return new RegistrationDAOImpl();
		}
		return INSTANCE;
	}

	@Override
	public UserInfoVO registerUserInfo(UserInfoDTO user) {
		System.out.println("DAO Layer=>" + "registerUserInfo");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			System.out.println("Perform the operation with DB");
			// step3 create the statement object

			pstmt = con.prepareStatement(QueryConstant.INSERT_USER_INFO_QUERY);
			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getLastName());
			pstmt.setString(3, user.getUser());
			pstmt.setString(4, user.getPassword());

			// step4 execute query
			int res = pstmt.executeUpdate();
			if (res > 0) {
				System.out.println(res + " Record insert succesfully");
			}
			UserInfoVO userInfoVO = new UserInfoVO(user.getFirstName(), user.getLastName(), user.getUser(),
					user.getPassword());

			return userInfoVO;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(" Record is not insert succesfully");
			e.printStackTrace();
			return null;
		} finally {
			DBUtil.closeConnection(pstmt, con);
		}

	}

	@Override
	public UserInfoVO UpdateUserInfo(UserInfoDTO user) {
		System.out.println("DAO Layer=>" + "registerUserInfo");
		try {
			Connection con = DBUtil.getConnection();
			System.out.println("Perform the operation with DB");
			// step3 create the statement object
			PreparedStatement pstmt = con.prepareStatement(QueryConstant.UPDATE_USER_INFO_QUERY);
			pstmt.setString(1, user.getUser());

			// step4 execute query
			int res = pstmt.executeUpdate();
			if (res > 0) {
				System.out.println(res + " Record insert succesfully");
			}

			// step5 close the connection object
			DBUtil.closeConnection(pstmt, con);

			UserInfoVO userInfoVO = new UserInfoVO(user.getFirstName(), user.getLastName(), user.getUser(),
					user.getPassword());

			return userInfoVO;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" Record is not insert succesfully");
			e.printStackTrace();
			return null;
		}

	}

}
