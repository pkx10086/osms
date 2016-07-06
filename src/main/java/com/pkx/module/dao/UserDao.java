package com.pkx.module.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pkx.module.entity.User;

@Repository
public interface UserDao {
	
	public List<User> findAll(int pageNo,int pageSize);

}
