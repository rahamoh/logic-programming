package com.infy.enterprise.application.enterpriseapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/enterprise/application")
public class ProductController {
	
	@GetMapping("/productlist")
	public String getProductList() {
		
		return "Welcome to product list";
	}

}
