package com.sin.lag.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.sin.lag.pojo.Category;

public interface ICategoryDao {
	
	@Insert("INSERT INTO t_category (NAME,pid) VALUES(#{name},#{pid});")
	void add(Category category);
	
	List<Category> queryList(int pid);
}
