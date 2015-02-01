package com.sin.lag.service;

import java.util.List;

import com.sin.lag.pojo.Category;

public interface ICategoryService {
	void add(Category category);

	void constructOptions(StringBuilder options,int pid,int level);
	void constructId(List<Integer> ids,int pid);
	void delete(int pid);
}
