package com.te.springsecurity.base.dao;

import org.springframework.data.repository.CrudRepository;

import com.te.springsecurity.base.bean.User;



public interface UserDao extends CrudRepository<User, Integer> {

	public User findByUserName(String name);
	public User findByUserId(int  userId);
}
