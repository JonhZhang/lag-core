
package com.sin.lag.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sin.lag.pojo.User;
import com.sin.lag.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@Resource
	private IUserService userService;
	
	@RequestMapping
	public String toIndex(Model model) {
		List<User> users = userService.queryAllUser();
		model.addAttribute("users",users);
		return "index"; 
	}
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String edit(@PathVariable int id,Model model) {
		User user = userService.getUserById(id);
		model.addAttribute(user);
		return "userEdit";
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public String edit( User user) {
		System.out.println(user);
		userService.updateUser(user);
		return "redirect:/users";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(User user) {
		return "userAdd";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@Valid  User user,BindingResult result) {
		if(result.hasErrors()) {
			return "userAdd";
		}
		userService.add(user);
		return "redirect:/users";
	}
}
