package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.HaProxyApplication;

@RestController
public class PortController {
private final Logger logger = LoggerFactory.getLogger(PortController.class);
	
	@RequestMapping(method = RequestMethod.GET, path = "/port")
	public String getPort() throws Exception {
		logger.info(HaProxyApplication.port);
		return HaProxyApplication.port + " port";
	}
}
