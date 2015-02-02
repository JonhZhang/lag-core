package com.sin.lag.service;

import java.util.List;

import com.sin.lag.pojo.User;

public interface IUserService {
	 List<User> queryUser();
	 User findUser(User user);
	 void add(User user);
}
