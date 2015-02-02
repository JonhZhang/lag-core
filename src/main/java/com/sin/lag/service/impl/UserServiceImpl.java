package com.sin.lag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sin.lag.dao.IUserDao;
import com.sin.lag.pojo.User;
import com.sin.lag.service.IUserService;

@Component
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;

	@Override
	public List<User> queryUser() {
		return null;
	}
	
	public void add(User user) {
		userDao.insertUser(user);
	}

	@Override
	public User findUser(User user) {
		user.setPassword(null);
		return userDao.findUser(user);
	}

	

	

	
}
