package com.project.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.service.IUsersService;

@Controller
public class TestController {
	
	private static Logger logger = Logger.getLogger(TestController.class);
	
	@Autowired
	private IUsersService usersService;
	
	@RequestMapping("login")
    public String index() {
//		List<Object> list = usersService.queryUsersAll();
		return "index";
    }
	
	@RequestMapping("/index.shtml")
	public String home(){
		return "index";
	}
}
