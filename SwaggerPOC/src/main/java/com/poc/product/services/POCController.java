package com.poc.product.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POCController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/fetchservice")
	public String getProductInfo() {
		return "Product Information returned";
	}
}
