package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class Limitconfigurationcontroller {
	
	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitConfiguration()
	{
		return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}

}
