package com.project.test;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

public class ShiroHelloWorld {
	private static Logger logger = Logger.getLogger(ShiroHelloWorld.class);
	@Test
	public void testShiroHelloWorld(){
		logger.info("Shiro Execute Begin~ ");
		// 1.获得SecurityManager 工厂，此处使用Ini配置文件初始化SecurityManager
		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:config/shiro.ini");
		// 2.得到 SecirutyManager 实例，并绑定给 SecurityUtils
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		// 3.得到 Subject 及创建用户名、密码身份验证 Token 
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang","123");
		try {
			// 4.登录（即身份验证）
			subject.login(token);
			logger.info("身份验证成功！");
		} catch (Exception e) {
			logger.info("身份验证失败！");
			e.printStackTrace();
		}
		// 断言用户已经登录
		Assert.assertEquals(true, subject.isAuthenticated());
		
		// 6.退出
		subject.logout();
	}
}
