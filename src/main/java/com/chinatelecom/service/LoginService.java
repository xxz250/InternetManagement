package com.chinatelecom.service;

import org.springframework.stereotype.Service;

import com.chinatelecom.model.User;

@Service
public interface LoginService {
	public User loginUser(String name,String passwd);
}
