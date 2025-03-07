package com.mvc.orm.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.orm.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public int store(User user) {
		entityManager.persist(user); // Persist the user entity
        return user.getId(); 
	}

}
