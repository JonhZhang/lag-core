package com.sin.lag.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sin.lag.pojo.User;

public interface IUserDao {
	
	
	@Select("select id,user_name as username,password,age from user_t")
	List<User> queryAllUser();
	User queryUserById(int id);
	@Update("update user_t set user_name=#{username},age=#{age} where id=#{id}")
	void updateUser(User user);
	@Insert("insert into user_t(id,user_name,age,password) values(#{id},#{username},#{age},#{password})")
	void add(User user);
}
