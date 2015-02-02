package com.sin.lag.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.sin.lag.pojo.User;
import com.sin.lag.service.IUserService;

@Controller
@SessionAttributes("loginUser")
public class RegisterController {
	
	@Resource
	private IUserService userService;
	
	Logger logger = Logger.getLogger(RegisterController.class);
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register() {
		return "front/register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@Valid User user ,BindingResult bindingResult ,Model model,ModelMap map) {
		User resultUser = userService.findUser(user);
		if(bindingResult.hasErrors()) {
			return "front/register";
		}
		if(null != resultUser ) {
			model.addAttribute("errorMessage", "email已经被使用");
			return "front/register";
		}
		
		userService.add(resultUser);
		logger.info("----------"+JSON.toJSONString(resultUser));
		return "redirect:/index";
	}
	
	
	
	
}
