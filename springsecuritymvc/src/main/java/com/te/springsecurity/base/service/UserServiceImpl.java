package com.te.springsecurity.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.te.springsecurity.base.bean.MyUserDetails;
import com.te.springsecurity.base.bean.User;
import com.te.springsecurity.base.dao.UserDao;

@Service
public class UserServiceImpl implements UserDetailsService{

	@Autowired
	private UserDao dao;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=dao.findByUserName(username);
		if(user!=null) {
			return new  MyUserDetails(user);
		}
		throw new UsernameNotFoundException(username);
	}
	
	public List<User> findAllUserDetails() {
		return (List<User>) dao.findAll();
		
	}
	public User getData(int id) {
		return dao.findByUserId(id);
		
	}

}
