package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.hashedin.model.GitMetric;

public class GitMetricRepositoryImpl implements GitMetricRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public GitMetric find(Long gitMetricId) {
		return em.find(GitMetric.class, gitMetricId);
	}

	@Override
	public List<GitMetric> findAll() {
		TypedQuery<GitMetric> query = em.createNamedQuery("GitMetric.findAll",
				GitMetric.class);
		List<GitMetric> results = query.getResultList();
		return results;
	}

	@Override
	public GitMetric save(GitMetric gitMetric) {
		// Saves the given task object and returns the same.
		em.persist(gitMetric);
		em.flush();
		return gitMetric;
	}

	@Override
	public GitMetric update(GitMetric gitMetric, Long gitMetricId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GitMetric delete(Long gitMetricId) {
		GitMetric gitMetricToBeDeleted = em.find(GitMetric.class, gitMetricId);
		em.remove(gitMetricToBeDeleted);
		return gitMetricToBeDeleted;
	}

}
