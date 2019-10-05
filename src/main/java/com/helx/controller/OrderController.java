package com.helx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/getOrder")
	public String getOrder() {
		System.out.println("远程调用");
		return restTemplate.getForObject("http://member/getMsg", String.class);
	}
}
