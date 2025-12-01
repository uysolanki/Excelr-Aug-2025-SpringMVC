package com.excelr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/greet")
	public String greet()
	{
		return "virat";
	}
}
