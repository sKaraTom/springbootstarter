package com.capgemini.springbootstarter.repository.custom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserCustomRepositoryImpl implements UserCustomRepository {

	private static final Logger log = LoggerFactory.getLogger(UserCustomRepositoryImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}


}
