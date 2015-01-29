package com.sin.lag.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {
	
	Logger logger = Logger.getLogger(IndexController.class);
	@RequestMapping("/index")
	public String toFrontIndex() {
		logger.info("step index");
		return "front/index";
	}
	
	
	
}
