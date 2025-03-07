package com.mvc.orm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.orm.dao.UserDao;
import com.mvc.orm.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		int i =  userDao.store(user);
		return i;
	}
}
