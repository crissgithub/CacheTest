package com.criss.wang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "测试接口", description = "测试接口")
@Controller
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@ApiOperation(value = "hello方法接口", notes = "hello方法接口")
	@ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		logger.info("kdjfkdjfkdfkjfdk");
		return "hello world";
	}
}
