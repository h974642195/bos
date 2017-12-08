package com.baiqiu.common.utils;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

/**
 * 
 * @ClassName RestServiceUtil
 * @Description TODO
 * @author LiLei
 * @Date 2017年10月10日 下午1:39:16
 * @version 1.0.0
 */
public class RestServiceUtil {
	private static Logger logz = Logger.getLogger(RestServiceUtil.class);
	
	/**
	 * 调用rest接口
	 * @param param 入参
	 * @param url 接口地址
	 * @return HttpResponse.getEntity
	 */
	public static String restService(List<NameValuePair> param, String url) {
		//调用Rest接口
		HttpClient httpclient = new DefaultHttpClient();  
        String smsUrl=url;  
        HttpPost httppost = new HttpPost(smsUrl);  
        String conResult = "";  
        try {  
//		            httppost.addHeader("Content-type", "application/x-www-form-urlencoded");  
            httppost.setEntity(new UrlEncodedFormEntity(param,"UTF-8"));  
            HttpResponse response = httpclient.execute(httppost);  
            conResult = EntityUtils.toString(response  
                    .getEntity());  
            logz.info("^_^"+conResult);
		    } catch (ClientProtocolException e) {  
		        e.printStackTrace();  
		    } catch (IOException e) {  
		        e.printStackTrace();  
		    } finally {
		    	httppost.releaseConnection();
		    	httpclient.getConnectionManager().shutdown();
        }   
		return conResult;
	}
}
