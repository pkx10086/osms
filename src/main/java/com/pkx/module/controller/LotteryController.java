package com.pkx.module.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;

import common.util.HttpClientUtil;

@Controller
public class LotteryController {
	
	//从远程接口获得彩票种类。
	
	/**
	 * 功能描述：查找
	 * @author pankx
	 * @date 2016年7月6日 下午4:28:11
	 * @param @return 
	 * @return String
	 */
	public String getLottery(){
		//查询彩票种类
		String url="http://api.avatardata.cn/Lottery/List";
		String charset="UTF-8";
		Map<String,String> params = new HashMap<String,String>();
		params.put("key", "8fd52d9938ab4a319bcdc53dd182bf1b");
		params.put("lotterytype", "1");
		HttpClientUtil httpClientUtil = new HttpClientUtil();
		String str = httpClientUtil.doPost(url, params);
		System.out.println("str::"+str);
		return "";
	}
}
 