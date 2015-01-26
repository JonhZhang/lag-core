package com.sin.lag.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sin.lag.pojo.User;

public interface IUserDao {
	
	
	@Select("select * from user_t")
	List<User> queryAllUser();
	User queryUserById(int id);
}
