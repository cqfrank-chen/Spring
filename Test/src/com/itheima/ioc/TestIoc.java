package com.itheima.ioc;
import org.springframework.context.*;
import org.springframework.context.support.*;
public class TestIoc {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.say();
	}
}
