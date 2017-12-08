package com.baiqiu.sso.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baiqiu.common.utils.Md5Util;
import com.baiqiu.common.utils.PropertyUtils;
import com.baiqiu.common.utils.RestServiceUtil;
import com.baiqiu.sso.pojo.VerificationCode;
import com.baiqiu.sso.request.SmsRequest;
import com.baiqiu.sso.service.SendMesService;

/**
 * 发送验证码
 * 
 * @ClassName SendMesServiceImpl
 * @Description TODO
 * @author LiLei
 * @Date 2017年8月15日 上午9:59:59
 * @version 1.0.0
 */
@Service(value = "sendMesService")
@Transactional
public class SendMesServiceImpl implements SendMesService {

	private static Logger logger = LoggerFactory.getLogger(SendMesServiceImpl.class);
	
	/*@Value("${message.account.pwd}")
	private String password;
	
	@Value("${message.account.url}")
	private String basicUrl;
*/
	/**
	 * 发送短信
	 */
	@Override
	public String sendMessage(VerificationCode verCode) {
		String result = "";
		try {
			result = sendMsg(verCode);
			
			if(StringUtils.isBlank(result)){
				return "";
			}else{
				JSONObject obj = JSON.parseObject(result);
				String status =  (Integer)obj.get("status") + "";
				if(!"2".equals(status)){
					String message =  (String)obj.get("message");
					logger.info("------------------------------------->message:" + message);
				}
				return status;
			}
			
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return result; 
	}
	
	/**
	 * 发送短信
	 * @Description 
	 * @param verCode
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	private String sendMsg(VerificationCode verCode) throws ClientProtocolException, IOException {
		
		String password = PropertyUtils.getProperty("message.account.pwd");
		String basicUrl = PropertyUtils.getProperty("message.account.url");
		
		logger.info("------------>password:" + password);
		logger.info("------------>basicUrl:" + basicUrl);
		String content = verCode.getSendMessage();
		logger.info("------------>content:" + content);
		String telephone = verCode.getTelephone();
		logger.info("------------>telephone:" + telephone);
		
		String oid = UUID.randomUUID().toString();
		
		SmsRequest request = new SmsRequest();
		request.setContent(content);
		request.setOid(oid);
		request.setTelephone(telephone);
		request.setPassword(Md5Util.GetMD5Code(password));
		
		String parameter = JSON.toJSONString(request);
		logger.info("------------------>parameter: " + parameter);
	    
		List<NameValuePair> param=new ArrayList<NameValuePair>();
		param.add(new BasicNameValuePair("data", parameter));
		logger.info("------------------------>param : " + param.toString());
		String  result= RestServiceUtil.restService(param, basicUrl);
		logger.info("------------------------>result : " +result);
		return result;
	}
	
}
