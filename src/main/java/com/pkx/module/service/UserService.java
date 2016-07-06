package com.pkx.module.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkx.module.dao.UserDao;
import com.pkx.module.entity.User;

@Service
public class UserService {
	
	@Autowired
   private	UserDao userDao;
	
	public List<User> findAll(int pageNo,int pageSize){
	  	return userDao.findAll(pageNo,pageSize);
	}

}
