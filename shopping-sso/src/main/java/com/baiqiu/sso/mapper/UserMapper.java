package com.baiqiu.sso.mapper;

import com.baiqiu.sso.pojo.User;
import com.github.abel533.mapper.Mapper;

public interface UserMapper extends Mapper<User>{
	public User queryBytelephone(String telephone);
}
