package com.mphasis.servlet;

import com.mpahsis.dto.User;
import com.mphasis.dao.RegisterDao;

public class RegisterBO {
	
	private RegisterDao userDao; 
	
	public boolean userRegisterBO(User user) {
		
		userDao = new RegisterDao(); 
		
		return userDao.insertRegistrationDetails(user);     
		
	}

}
