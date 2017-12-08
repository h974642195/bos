package com.baiqiu.sso.service;

import org.springframework.transaction.annotation.Transactional;

import com.baiqiu.sso.pojo.User;

@Transactional
public interface UserService {
	

	public Boolean saveUser(User user);

	public String checkLogin(String telephone, String password);
	
}
