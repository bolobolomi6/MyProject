package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}

}
