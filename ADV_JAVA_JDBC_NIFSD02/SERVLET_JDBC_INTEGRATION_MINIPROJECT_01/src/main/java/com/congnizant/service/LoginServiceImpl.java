package com.congnizant.service;

import com.congnizant.dao.LoginDAO;
import com.congnizant.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
	private static LoginServiceImpl INSTANCE = null;
	private LoginServiceImpl() {
	}

	public static synchronized LoginService getInstace() {
		if (INSTANCE == null) {
			return new LoginServiceImpl();
		}
		return INSTANCE;
	}

	@Override
	public boolean getLogin(String userName, String Password) {
		LoginDAO ld = LoginDAOImpl.getInstace();
		boolean isLogin = ld.getLogin(userName, Password);
		if (isLogin == true) {
			return true;
		}
		return false;
	}

}
