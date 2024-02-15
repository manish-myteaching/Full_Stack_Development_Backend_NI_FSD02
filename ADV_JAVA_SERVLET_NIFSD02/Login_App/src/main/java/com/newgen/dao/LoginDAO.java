package com.newgen.dao;

import java.util.HashMap;
import java.util.Map;

//Database
public class LoginDAO {

	public boolean getLogin(String userName, String password) {
		Map<String, String> map = new HashMap();
		map.put("manish", "12345");
		map.put("ramesh", "12345");
		map.put("ram", "12345");
		map.put("Anjali", "12345");
		if (map.containsKey(userName)) {
			String str = map.get(userName);
			if (password.equals(str)) {
				return true;
			} else {
				return true;
			}
		}
		return false;

	}

}
