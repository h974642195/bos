package com.baiqiu.sso.service.impl;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baiqiu.sso.mapper.UserMapper;
import com.baiqiu.sso.pojo.User;
import com.baiqiu.sso.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
    /**
     * 用户注册
     * @param User
	 * @return boolean
	 * @author BruceLee
	 * @Date 2017年11月30日 下午1:39:16
	 * @version 1.0.0
     */
	public Boolean saveUser(User user) {
		/*user.setUsername(user.getUsername());
		// 密码通过MD5进行
		user.setPassword(DigestUtils.md5Hex(user.getPassword()));
		user.setTelephone(user.getTelephone());
		user.setIntegral(0);
		user.setSex(1);
		user.setEmail(user.getEmail());
		user.setUser_image("1");
		user.setQq("");
		user.setWechat("");
		user.setBirthday(new Date());
		user.setAdress("");
		user.setOringe("PC");
		user.setAddtime(new Date());
		return this.userMapper.insert(user) == 1;*/
		
		if(!StringUtils.isBlank(user.getPassword())){
			user.setPassword(DigestUtils.md5Hex(user.getPassword()));
		}else{
			user.setPassword(DigestUtils.md5Hex("123456"));
		}
		
		user.setIntegral(0);
		user.setSex(1);
		user.setOringe("PC");
		user.setAddtime(new Date());
		
		try {
			//将会员添加到数据库
			int outcome = userMapper.insert(user);
			
			//将会员推送到会员通
			
			
			
			
			if(outcome == 1){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 用户登录校验
	 * 单点登录实现
	 * @param verCode
	 * @return
	 */
	public String checkLogin(String telephone, String password) {
//		User record=new User();
//		record.setTelephone(telephone);
		User user=this.userMapper.queryBytelephone(telephone);
		if(null==user){
			return null;
		}
		//比对密码是否正确
		if(!StringUtils.equals(DigestUtils.md5Hex(password),user.getPassword())){
			System.out.println(DigestUtils.md5Hex(password)+"shujukumima"+user.getPassword());
			return null;
		}
		//登录成功
		//生成token
	//	String token=DigestUtils.md5Hex(System.currentTimeMillis()+username);
		
		//将用户数据保存到redis中
		return "1";
	}
}
