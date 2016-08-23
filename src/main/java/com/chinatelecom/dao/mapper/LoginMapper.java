package com.chinatelecom.dao.mapper;

import org.apache.ibatis.annotations.Param;

import com.chinatelecom.model.User;

public interface LoginMapper {
	public User loginUser(@Param(value="name") String name
			,@Param(value="passwd") String passwd);
}
