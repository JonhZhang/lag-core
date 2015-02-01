package com.sin.lag.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
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
		StringBuilder options = new StringBuilder();
		categoryService.constructOptions(options , 0, 0);
		model.addAttribute("options", options);
		return "front/adminAdd";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@Valid Category category,BindingResult bindingResult) {
		categoryService.add(category);
		return "redirect:/add";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String delete( int pid) {
		categoryService.delete(pid);
		return "redirect:/add";
	}
	
}
