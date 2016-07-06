package com.pkx.module.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkx.module.dao.LotteryDao;
import com.pkx.module.entity.Lottery;

@Service
public class LotteryService {
	
	@Autowired
   private	LotteryDao lotteryDao;
	/**
	 * 功能描述：添加彩票种类
	 * @author pankx
	 * @date 2016年7月6日 下午4:18:04
	 * @param @param lottery
	 * @param @return 
	 * @return boolean
	 */
	public boolean add(Lottery lottery){
	     int effectRows = lotteryDao.insertSelective(lottery);
	     if(effectRows>0){
	    	 return true;
	     }
	     return false;
	}

}
