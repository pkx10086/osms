package com.pkx.module.dao;

import org.springframework.stereotype.Repository;

import com.pkx.module.entity.Lottery;

@Repository
public interface LotteryDao {
	
	/**
	 * 功能描述：添加彩票种类
	 * @author pankx
	 * @date 2016年7月6日 下午4:11:43
	 * @param @param lottery
	 * @param @return 
	 * @return int
	 */
	public int insertSelective(Lottery lottery);
	

}
