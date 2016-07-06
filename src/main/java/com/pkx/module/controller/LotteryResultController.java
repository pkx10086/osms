package com.pkx.module.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pkx.module.entity.User;
import com.pkx.module.service.UserService;

import common.util.DateUtil;

@Controller
public class LotteryResultController {
	
	@Autowired
	UserService userService;
	@RequestMapping(value="add")
	public ModelAndView add(){
		
		List<User> users=userService.findAll(1,1);
		System.out.println("-----------controller----------------"+users);
		return new ModelAndView("index");
	}

}
