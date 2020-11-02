package com.in28minutes.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

@Repository
@Transactional
public class UserDAOService {

	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Métodon con el que generamos una inserción en la base de datos.
	 * @param user
	 * @return ID del user persistido.
	 */
	public long insert(User user) {
		entityManager.persist(user);
		
		return user.getId();
	}
}
