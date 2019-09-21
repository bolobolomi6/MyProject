package com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.entity.User;

@Mapper
public interface UserMapper {

	User getUserById(int id);

}
