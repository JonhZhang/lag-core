package com.sin.lag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sin.lag.dao.ICategoryDao;
import com.sin.lag.pojo.Category;
import com.sin.lag.service.ICategoryService;


@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Resource
	private ICategoryDao categoryDao;
	
	@Override
	public void add(Category category) {
		categoryDao.add(category);
	}

	@Override
	public List<Category> queryList(int pid) {
		return categoryDao.queryList(pid);
	}

	

}
