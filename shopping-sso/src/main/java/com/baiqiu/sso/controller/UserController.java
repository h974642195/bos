package com.baiqiu.sso.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.baiqiu.sso.pojo.User;
import com.baiqiu.sso.pojo.VerificationCode;
import com.baiqiu.sso.service.UserService;
import com.baiqiu.sso.service.impl.SendMesServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private SendMesServiceImpl sendMsg;

	@RequestMapping(value = "/register", method = RequestMethod.GET, produces = "text/plain;charset=utf-8")
	public String toRegister() {
		return "register";
	}

	/*
	 * @RequestMapping(value = "/register", method = RequestMethod.GET ,produces
	 * ="text/plain;charset=utf-8") public ModelAndView toRegister() { return
	 * new ModelAndView("/register.jsp"); }
	 */
	// /**
	// * 注册功能实现
	// * @param liuxin
	// * @return
	// */
	// @RequestMapping(value = "doRegister1", method = RequestMethod.POST)
	// @ResponseBody
	// private Map<String, Object> doRegister(User user) {
	// Map<String, Object> result = new HashMap<String, Object>();
	// Boolean bool = this.userService.saveUser(user);
	// if (bool) {
	// result.put("status", "200");
	// } else {
	// result.put("status", "300");
	// }
	// return result;
	// }
	/**
	 * 注册功能实现
	 * 
	 * @param liuxin
	 * @return
	 */
	@RequestMapping(value = "doRegister", method = RequestMethod.POST)
	private String doRegister(User user, Model model) {
		Boolean bool = this.userService.saveUser(user);
		if (bool) {
			return "/login";
		} else {
			model.addAttribute("msg", "注册失败");
			return "/register";
		}

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = "text/plain;charset=utf-8")
	public String showLogin() {
		return "login";
	}
	/**
	 * 用户登录
	 * @return
	 */
	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST, produces = "text/plain;charset=utf-8")
	public String checkLogin(@RequestParam("telephone") String telephone,
			@RequestParam("password") String password,Model model) {
		String token=this.userService.checkLogin(telephone,password);
		if(null==token){
			//登录失败
			model.addAttribute("msg", "登录失败");
			return "login";
		}else{
			model.addAttribute("msg", "登录成功");
			return "index";
		}
		
	}
	/**
	 * 发送验证码
	 */
	@RequestMapping(value = "/checkCode", method = RequestMethod.GET, produces = "text/plain;charset=utf-8")
	public Map<String,String> sendMassage(@RequestParam("telephone") String telephone){
		VerificationCode verCode=new VerificationCode();
		Map<String, String> result=new HashMap<String, String>();
		int code=(int)((Math.random()*9+1)*100000);
		verCode.setSendMessage("【achette】您正在加入雅氏官方会员。您的验证码是： "+code+"，请勿泄漏验证码");
		verCode.setVerCode(String.valueOf(code));
		verCode.setTelephone(telephone);
		sendMsg.sendMessage(verCode);
		result.put("code", String.valueOf(code));
		return result;
	}
	
	
	@RequestMapping(value = "/showIndex", method = RequestMethod.GET, produces = "text/plain;charset=utf-8")
	public String showIndex() {
		return "index";
	}
	@RequestMapping(value = "{pageName}", method = RequestMethod.GET)
	private String toPage(@PathVariable("pageName") String pageName) {
		return pageName;
	}
}
