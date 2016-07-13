package com.pkx.common.base;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import common.quarzt.LzstoneTimeTask;
import common.util.Exceptions;
import common.util.PropertiesUtil;
import common.util.QuartzUtils;

/**
* 类说明：
* @author pankx
* @date 2016年7月6日 下午2:47:11
*/
public class ApplicationContextListener implements ServletContextListener {
	private Logger logger = LoggerFactory.getLogger(ApplicationContextListener.class);  
	PropertiesUtil p=PropertiesUtil.getProperties();
	QuartzUtils quartzUtils = new QuartzUtils();
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		this.logger.info("The application start...");  
        
        /* 注册定时任务 */  
        try { 
        	quartzUtils.addJob("name-1","group-1",LzstoneTimeTask.class, p.readValueBykey("quarzt.test.name"));
        	quartzUtils.start();
            this.logger.info("The scheduler register...");  
        }catch(Exception e){
        	logger.error("定时调用错误:[message]"+Exceptions.getStackTraceAsString(e));
        	
        }
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		this.logger.info("The application stop...");  
			/* 注销定时任务 */  
        	quartzUtils.shutdown(); 
	}

}
