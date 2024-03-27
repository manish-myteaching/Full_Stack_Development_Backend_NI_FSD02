/*
 * Copyright (c) 2024, Conginzant and/or its affiliates. All rights reserved.
 */

package com.congnizant.dao;

import com.congnizant.dto.UserInfoDTO;
import com.congnizant.vo.UserInfoVO;

/*
 * @Manish Verma
 * This is used for Registration flow
 */
public interface RegistrationDAO {

	UserInfoVO registerUserInfo(UserInfoDTO user);
	
	UserInfoVO UpdateUserInfo(UserInfoDTO user);

}
