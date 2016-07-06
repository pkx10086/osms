package com.pkx.module.entity;

import java.math.BigInteger;
import java.util.Date;


public class User {
	
	private BigInteger id ;
	private String account;
	private String password;
	private String nick; 
	private String realName;
	private String headPic;
	//private Sex sex;
	private Date birthday;
	private String homeAddr;
	private String hometownAddr;
	private Date loginDate;
	private Date logoutDate;
	
	
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getHeadPic() {
		return headPic;
	}
	public void setHeadPic(String headPic) {
		this.headPic = headPic;
	}
/*	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}*/
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getHomeAddr() {
		return homeAddr;
	}
	public void setHomeAddr(String homeAddr) {
		this.homeAddr = homeAddr;
	}
	public String getHometownAddr() {
		return hometownAddr;
	}
	public void setHometownAddr(String hometownAddr) {
		this.hometownAddr = hometownAddr;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public Date getLogoutDate() {
		return logoutDate;
	}
	public void setLogoutDate(Date logoutDate) {
		this.logoutDate = logoutDate;
	}
	
	
/*	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", password=" + password + ", nick=" + nick + ", realName="
				+ realName + ", headPic=" + headPic + ", sex=" + sex + ", birthday=" + birthday + ", homeAddr="
				+ homeAddr + ", hometownAddr=" + hometownAddr + ", loginDate=" + loginDate + ", logoutDate="
				+ logoutDate + "]";
	}*/
	
	
	
}
