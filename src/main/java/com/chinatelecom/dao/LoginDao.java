package com.chinatelecom.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinatelecom.dao.mapper.LoginMapper;
import com.chinatelecom.model.User;

@Repository
public class LoginDao {
	
	@Autowired
	private LoginMapper login;
	public User loginUser(String name,String passwd){
		return login.loginUser(name, passwd);
	}
}
