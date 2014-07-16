package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.hashedin.model.Alert;
import com.hashedin.model.GitUser;

public class GitUserRepositoryImpl implements GitUserRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public GitUser find(Long gitUserId) {
		// Returns the Task for given taskId.
		return em.find(GitUser.class, gitUserId);
	}

	@Override
	public List<GitUser> findAll() {
		// Returns all the tasks in our system.
		TypedQuery<GitUser> query = em.createNamedQuery("GitUser.findAll",
				GitUser.class);
		List<GitUser> results = query.getResultList();
		return results;
	}

	@Override
	public GitUser save(GitUser gitUser) {
		// Saves the given task object and returns the same.
		em.persist(gitUser);
		em.flush();
		return gitUser;
	}

	@Override
	public GitUser update(GitUser gitUser, Long gitUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GitUser delete(Long gitUserId) {
		GitUser userToBeDeleted = em.find(GitUser.class, gitUserId);
		em.remove(userToBeDeleted);
		return userToBeDeleted;
	}

}
