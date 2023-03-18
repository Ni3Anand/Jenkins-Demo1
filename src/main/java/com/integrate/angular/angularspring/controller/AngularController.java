package com.integrate.angular.angularspring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integrate.angular.angularspring.model.Home;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class AngularController {
	
	@RequestMapping("hello")
	public Home sayHello(){
		return new Home("Lallalalallall !");
	}
	
}
