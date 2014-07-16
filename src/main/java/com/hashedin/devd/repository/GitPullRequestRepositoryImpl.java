package com.hashedin.devd.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.hashedin.devd.model.GitPullRequest;

public class GitPullRequestRepositoryImpl implements GitPullRequestRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public GitPullRequest find(Long gitPullRequestId) {
		// Returns the Task for given taskId.
		return em.find(GitPullRequest.class, gitPullRequestId);
	}

	@Override
	public List<GitPullRequest> findAll() {
		// Returns all the tasks in our system.
		TypedQuery<GitPullRequest> query = em.createNamedQuery(
				"GitPullRequest.findAll", GitPullRequest.class);
		List<GitPullRequest> results = query.getResultList();
		return results;
	}

	@Override
	public GitPullRequest save(GitPullRequest gitPullRequest) {
		// Saves the given task object and returns the same.
		em.persist(gitPullRequest);
		em.flush();
		return gitPullRequest;
	}

	@Override
	public GitPullRequest update(GitPullRequest gitPullRequest,
			Long gitPullRequestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GitPullRequest delete(Long gitPullRequestId) {
		GitPullRequest pullRequestToBeDeleted = em.find(GitPullRequest.class,
				gitPullRequestId);
		em.remove(pullRequestToBeDeleted);
		return pullRequestToBeDeleted;
	}

}
