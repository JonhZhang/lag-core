package com.sin.lag.service.impl;

import java.util.ArrayList;
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
	public void constructOptions(StringBuilder options,int pid,int level){
		int tempL = level;
		List<Category> categories =	categoryDao.queryList(pid);
		for(Category category : categories) {
			options.append("<option value='"+category.getId()+"'>"+culLevel(tempL)+category.getName()+"</option>");
			constructOptions(options,category.getId(),++level);
		}
	}
	
	@Override
	public void constructId(List<Integer> ids,int pid){
		List<Category> categories =	categoryDao.queryList(pid);
		for(Category category : categories) {
			ids.add(category.getId());
			constructId(ids,category.getId());
		}
	}

	private String culLevel(int level) {
		String split = "--";
		while(level>0) {
			split+="--";
			level--;
		}
		return split;
	}

	@Override
	public void delete(int pid) {
		List<Integer> ids = new ArrayList<Integer>();
		constructId(ids, pid);
		ids.add(pid);
		categoryDao.deleteBatch(ids.toArray(new Integer[0]));
	}
}
