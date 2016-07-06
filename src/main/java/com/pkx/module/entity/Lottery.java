package com.pkx.module.entity;

import java.util.Date;

/**
* 类说明：彩票种类
* @author pankx
* @date 2016年7月6日 上午10:24:01
*/
public class Lottery {
	
	
	private String id; //
	private String lotteryName;
	private String lotteryCode;
	private long sort;
	private Date createTime;
	private Date updateTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLotteryName() {
		return lotteryName;
	}
	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}
	public String getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(String lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public long getSort() {
		return sort;
	}
	public void setSort(long sort) {
		this.sort = sort;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@Override
	public String toString() {
		return "Lottery [id=" + id + ", lotteryName=" + lotteryName + ", lotteryCode=" + lotteryCode + ", sort=" + sort
				+ ", createTime=" + createTime + "]";
	}
	
	
}
