package com.modelo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class homeController {
	
	@GetMapping("/")
	public String home() {
		return "home";
		
	}

}
