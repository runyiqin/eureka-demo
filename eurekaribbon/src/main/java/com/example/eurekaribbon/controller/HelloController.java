package com.example.eurekaribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : qinry
 * @version V1.0
 * @Project: eurekademo
 * @Package com.example.eurekaribbon.controller
 * @Description: TODO
 * @date Date : 2019年08月02日 14:01
 */
@RestController
public class HelloController {

	@RequestMapping(value = "/getHello",method = RequestMethod.GET)
	@HystrixCommand
	public String getHello(String name){
		return "Hello==="+name;
	}
}
