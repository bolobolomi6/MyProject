package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapper.UserMapper;

@RestController
public class UserController {

	// @Autowired
	// private UserService userService;

	@Autowired
	UserMapper userMapper;

	@RequestMapping("getUser/{id}")
	public String GetUser(@PathVariable("id") int id) {
		return userMapper.getUserById(id).toString();
	}

}
