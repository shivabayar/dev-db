package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import com.hashedin.model.GitProject;

public class GitProjectRepositoryImpl implements GitProjectRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public GitProject find(Long gitProjectId) {
		// Returns the Task for given taskId.
		return em.find(GitProject.class, gitProjectId);
	}

	@Override
	public List<GitProject> findAll() {
		// Returns all the tasks in our system.
		TypedQuery<GitProject> query = em.createNamedQuery(
				"GitProject.findAll", GitProject.class);
		List<GitProject> results = query.getResultList();
		return results;
	}

	@Override
	public GitProject save(GitProject gitProject) {
		// Saves the given task object and returns the same.
		em.persist(gitProject);
		em.flush();
		return gitProject;
	}

	@Override
	public GitProject update(GitProject gitProject, Long gitProjectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GitProject delete(Long gitProjectId) {
		GitProject projectToBeDeleted = em.find(GitProject.class, gitProjectId);
		em.remove(projectToBeDeleted);
		return projectToBeDeleted;
	}

}
