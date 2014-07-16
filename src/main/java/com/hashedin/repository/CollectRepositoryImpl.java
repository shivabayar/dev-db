package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.Alert;

@Repository("collectRepository")

public class CollectRepositoryImpl implements CollectRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Alert> findAll() {
		//call function created by Pavan
		return null;
	}

	@Override
	@Transactional
	public Alert save(Alert alert) {
		em.persist(alert);
		em.flush();
		return alert;
	}

}
