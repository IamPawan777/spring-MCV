package com.mvc.orm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.orm.entity.User;


@Repository
public class UserDao implements UserDaoInterface  {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int savaUser(User user) {
		int insertID = (Integer)this.hibernateTemplate.save(user);
		return insertID;
	}
	
}
