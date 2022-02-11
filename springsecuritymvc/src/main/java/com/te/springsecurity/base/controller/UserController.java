package com.te.springsecurity.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.springsecurity.base.bean.User;
import com.te.springsecurity.base.service.UserServiceImpl;


@Controller
public class UserController {

	@Autowired
	private UserServiceImpl service;
	
	@GetMapping("/home")
	public String home() {
		return "home";
		
	}
	@GetMapping("/user")
	public String user() {
		return "user";
		
	}
	@GetMapping("/admin")
	public String admin() {
		return "admin";
		
	}
	@GetMapping("/seeAll")
	public String seeAllUserDetails(ModelMap map) {
		List<User> users = service.findAllUserDetails();
		map.addAttribute("users", users);
		return "seeAll";
		
	}
	@GetMapping("/seeById")
	public String getData() {
		return "getData";	
		
	}
	@PostMapping("/seeById")
	public String getData(int id,ModelMap map) {
		User user = service.getData(id);
		map.addAttribute("user", user);
		return "getData";
		
		
	}
	
}
