package com.chinatelecom.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;

import com.chinatelecom.dao.LoginDao;
import com.chinatelecom.model.User;
import com.chinatelecom.service.LoginService;

public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDao userlogin;
	
	@Override
	public User loginUser(String name,String passwd){
		return userlogin.loginUser(name, passwd);
	}
	
}
