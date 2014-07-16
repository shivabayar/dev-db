package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.hashedin.model.Alert;
import com.hashedin.model.GitCommit;

public class GitCommitRepositoryImpl implements GitCommitRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public GitCommit find(Long commitId) {
		// Returns the Task for given taskId.
		return em.find(GitCommit.class, commitId);
	}

	@Override
	public List<GitCommit> findAll() {
		// Returns all the tasks in our system.
		TypedQuery<GitCommit> query = em.createNamedQuery("GitCommit.findAll",
				GitCommit.class);
		List<GitCommit> results = query.getResultList();
		return results;
	}

	@Override
	public GitCommit save(GitCommit gitCommit) {
		// Saves the given task object and returns the same.
		em.persist(gitCommit);
		em.flush();
		return gitCommit;
	}

	@Override
	public GitCommit update(GitCommit gitCommit, Long commitId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GitCommit delete(Long commitId) {
		GitCommit commitToBeDeleted = em.find(GitCommit.class, commitId);
		em.remove(commitToBeDeleted);
		return commitToBeDeleted;
	}

}
