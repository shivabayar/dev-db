package com.hashedin.devd.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.hashedin.devd.model.Alert;

@Repository("alertRepository")
public class AlertRepositoryImpl implements AlertRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Alert find(Long alertId) {
		// Returns the Task for given taskId.
		return em.find(Alert.class, alertId);
	}

	@Override
	public List<Alert> findAll() {
		// Returns all the tasks in our system.
		TypedQuery<Alert> query = em.createNamedQuery("Alert.findAll",
				Alert.class);
		List<Alert> results = query.getResultList();
		return results;
	}

	@Override
	public Alert save(Alert alert) {
		// Saves the given task object and returns the same.
		em.persist(alert);
		em.flush();
		return alert;
	}

	@Override
	public Alert update(Alert alert, Long alertId) {
		return null;
	}

	@Override
	public Alert delete(Long alertId) {
		Alert taskToBeDeleted = em.find(Alert.class, alertId);
		em.remove(taskToBeDeleted);
		return taskToBeDeleted;
	}

}
