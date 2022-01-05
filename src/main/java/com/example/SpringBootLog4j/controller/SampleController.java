package com.example.SpringBootLog4j.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	public SampleController() {
		
	}
     
	public static final Logger logger = LogManager.getLogger(SampleController.class);
	
    @GetMapping("/get")
	public String hello() {
		logger.debug("Logging for checking controller");
		logger.info("Hi hi -----------------------------");
		return "welcome to Jenkins";
	}
	
	
	
}
