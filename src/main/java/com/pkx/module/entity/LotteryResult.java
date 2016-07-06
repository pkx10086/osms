package com.pkx.module.entity;

import java.util.Date;

/**
* 类说明：
* @author pankx
* @date 2016年7月6日 上午10:34:20
*/
public class LotteryResult {
	
	
	private String id;
	
	private String lotteryCode;
	private String expect;
	private String openCode;//以-标志隔开
	private Date openTime;//
	private Date openTimeStamp;
	private Date createTime;
	private String revRemark;
	private String revRemark2;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(String lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public String getExpect() {
		return expect;
	}
	public void setExpect(String expect) {
		this.expect = expect;
	}
	public String getOpenCode() {
		return openCode;
	}
	public void setOpenCode(String openCode) {
		this.openCode = openCode;
	}
	public Date getOpenTime() {
		return openTime;
	}
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
	public Date getOpenTimeStamp() {
		return openTimeStamp;
	}
	public void setOpenTimeStamp(Date openTimeStamp) {
		this.openTimeStamp = openTimeStamp;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getRevRemark() {
		return revRemark;
	}
	public void setRevRemark(String revRemark) {
		this.revRemark = revRemark;
	}
	public String getRevRemark2() {
		return revRemark2;
	}
	public void setRevRemark2(String revRemark2) {
		this.revRemark2 = revRemark2;
	}
	
	
	@Override
	public String toString() {
		return "LotteryResult [id=" + id + ", lotteryCode=" + lotteryCode + ", expect=" + expect + ", openCode="
				+ openCode + ", openTime=" + openTime + ", openTimeStamp=" + openTimeStamp + ", createTime="
				+ createTime + ", revRemark=" + revRemark + ", revRemark2=" + revRemark2 + "]";
	}
	
	
	
}
