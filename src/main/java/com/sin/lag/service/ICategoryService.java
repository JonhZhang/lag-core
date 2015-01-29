package com.sin.lag.service;

import java.util.List;

import com.sin.lag.pojo.Category;

public interface ICategoryService {
	void add(Category category);

	List<Category> queryList(int pid);
}
