package com.sin.lag.dao;

import com.sin.lag.pojo.User;

public interface IUserDao {
	
	void initUser(User user);
	
	User findUser(User user);
	
	
}
