package com.sin.lag.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sin.lag.pojo.User;
import com.sin.lag.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUsers")
	public String toIndex(HttpServletRequest request,Model model) {
		
		List<User> users = userService.queryAllUser();
		model.addAttribute("users",users);
		
		
		System.out.println("追加");
		System.out.println("Iam 44183");
		return "index";
	}
	
}
