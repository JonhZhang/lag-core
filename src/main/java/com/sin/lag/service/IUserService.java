package com.sin.lag.service;

import java.util.List;

import com.sin.lag.pojo.User;

public interface IUserService {
	 User getUserById(int userId);
	 List<User> queryAllUser();
}
