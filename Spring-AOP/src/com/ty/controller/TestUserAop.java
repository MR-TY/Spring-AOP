package com.ty.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.ty.dao.UserDAO;

public class TestUserAop {
	@Test
	public void test() {
		//注解形式
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		UserDAO userDAO = context.getBean(UserDAO.class);
//		userDAO.Perform();
		
		//配置文件形式
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		UserDAO userDAO = context.getBean(UserDAO.class);
		userDAO.Perform();
	}
}
