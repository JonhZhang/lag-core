package com.sin.lag.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sin.lag.pojo.Register;

@Controller
@RequestMapping
public class RegisterController {
	
	Logger logger = Logger.getLogger(RegisterController.class);
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register() {
		logger.info("step index");
		return "front/register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@Valid Register register) {
		
		return null;
	}
	
	
	
	
}
