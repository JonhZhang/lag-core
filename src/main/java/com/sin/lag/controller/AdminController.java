package com.sin.lag.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sin.lag.pojo.Category;
import com.sin.lag.service.ICategoryService;

@Controller
@RequestMapping
public class AdminController {
	
	Logger logger = Logger.getLogger(AdminController.class);
	
	@Resource
	private ICategoryService  categoryService;
	
	@RequestMapping("/admin")
	public String toAdmin() {
		return "front/admin";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(Model model) {
		List<Category> list = categoryService.queryList(0);
		model.addAttribute("list", list);
		return "front/adminAdd";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@Valid Category category,BindingResult bindingResult) {
		System.out.println(category);
		category.setPid(0);
		categoryService.add(category);
		return "front/adminAdd";
	}
	
}
