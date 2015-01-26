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
	public User getUserById(int userId) {
		return userDao.queryUserById(userId);
	}

	@Override
	public List<User> queryAllUser() {
		return this.userDao.queryAllUser();
	}

}
