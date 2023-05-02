package com.helloHuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class greeting {
	@RequestMapping("")
	public String greet(@RequestParam(value="name", required=false) String humanName) {
		if(humanName == null) {
			return "hello human" ;
		}else
			return "hello "+humanName;
	}

}
