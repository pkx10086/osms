package com.pkx.module.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

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
	@Transactional
	public boolean batchAdd(List<Lottery> lotterys) throws RuntimeException{
		if(lotterys==null || lotterys.size()<=0){
			return false;
		}
		if(ObjectUtils.isEmpty(lotterys)){
			return false;
		}
		
		for(Lottery lott:lotterys){
			int effectRows = lotteryDao.insertSelective(lott);
			if(effectRows<=0){
				throw new RuntimeException("[throw Exception] batchAdd lottery is fail,the reason is effectRows is 0");
			}
		}
		return true;
	}
	
	
	public List<Lottery> getLottery(String lotteryType){
		return this.lotteryDao.getLottery(lotteryType);
		
	}
}
