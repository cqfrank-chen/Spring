package com.itheima.ioc;
import org.springframework.context.*;
import org.springframework.context.support.*;
public class TestDl {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.say();
	}
}
