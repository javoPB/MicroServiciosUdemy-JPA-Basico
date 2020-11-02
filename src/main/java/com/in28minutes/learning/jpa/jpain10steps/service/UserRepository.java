package com.in28minutes.learning.jpa.jpain10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	/**
	 * JpaRepository le proporciona las operaciones básicas para acciones de tipo CRUD.
	 * Si requiere query's más especializados, los deber definir en esta interface.
	 */
}
