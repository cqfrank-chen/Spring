package com.itheima.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImol implements UserDao{
	public void save() {
		System.out.println("userdao...save...");
	}
}
