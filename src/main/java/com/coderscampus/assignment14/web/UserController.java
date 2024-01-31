package com.coderscampus.assignment14.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment14.domain.User;
import com.coderscampus.assignment14.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/welcome")
	public User createUser(@RequestBody String name) {
		User user = userService.createUser(name);
		return user;
		
	}

}
