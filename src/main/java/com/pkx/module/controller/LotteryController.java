package com.pkx.module.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pkx.module.entity.Lottery;
import com.pkx.module.service.LotteryService;

import common.util.HttpClientUtil;

@Controller
public class LotteryController {
	
	@Resource
	private LotteryService lotteryService;
	//从远程接口获得彩票种类。
	
	/**
	 * 功能描述：查找
	 * @author pankx
	 * @date 2016年7月6日 下午4:28:11
	 * @param @return 
	 * @return String
	 */
	@ResponseBody
	@RequestMapping(value="/getLottery",method=RequestMethod.GET)
	public List<Lottery> getLottery(HttpServletRequest request){
		String lotteryType = request.getParameter("lotteryType");
		List<Lottery> lotterys = this.lotteryService.getLottery(lotteryType);
		return lotterys;
	}
	
	public static void main(String[] args) {
		LotteryController lott = new LotteryController();
		///lott.getLottery();
		
	}
}
 