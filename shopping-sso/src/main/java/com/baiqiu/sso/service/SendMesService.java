package com.baiqiu.sso.service;

import com.baiqiu.sso.pojo.VerificationCode;


public interface SendMesService {
	public String sendMessage(VerificationCode verCode);
}
