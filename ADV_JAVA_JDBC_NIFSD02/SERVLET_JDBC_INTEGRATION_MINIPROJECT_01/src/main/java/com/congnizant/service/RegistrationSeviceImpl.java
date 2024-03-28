package com.congnizant.service;

import com.congnizant.dao.RegistrationDAO;
import com.congnizant.dao.RegistrationDAOImpl;
import com.congnizant.dto.UserInfoDTO;
import com.congnizant.vo.UserInfoVO;


public class RegistrationSeviceImpl implements RegistrationSevice {
	
	private static RegistrationSeviceImpl INSTANCE = null;
	private RegistrationSeviceImpl() {
	}

	public static synchronized RegistrationSevice getInstace() {
		if (INSTANCE == null) {
			return new RegistrationSeviceImpl();
		}
		return INSTANCE;
	}


	@Override
	public UserInfoVO registerUserInfo(UserInfoVO user) {
		System.out.println("Service Layer=>"+"registerUserInfo");
		
		//Call Persistance Layer
		RegistrationDAO rd=RegistrationDAOImpl.getInstace();
		UserInfoVO userInfo = rd.registerUserInfo(new UserInfoDTO(user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getUser(), user.getPassword()));
		
		if(userInfo !=null) {
			//Mail --Async 
			//3-rd party call
		}
		return userInfo;
	}

}
