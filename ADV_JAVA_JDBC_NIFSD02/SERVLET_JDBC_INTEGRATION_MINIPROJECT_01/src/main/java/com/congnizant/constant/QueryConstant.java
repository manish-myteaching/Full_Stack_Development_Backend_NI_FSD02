package com.congnizant.constant;

public class QueryConstant {

	public static String INSERT_USER_INFO_QUERY = "INSERT INTO USER_INFO " + "VALUES(?,?,?,?)";

	public static String SELECT_USER_INFO_QUERY = "SELECT * FROM USER_INFO " + "WHERE USER_NAME=? AND PASSWORD=?";

	public static String UPDATE_USER_INFO_QUERY = "UPDATE USERINFO SET USERNAME=? ";

}
