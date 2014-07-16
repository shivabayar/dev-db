package com.hashedin.devd.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.devd.model.GitCommit;

@Repository
@Service
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
	@Transactional
	public void save(List<GitCommit> gitCommit) {
		// Saves the given task object and returns the same.
		for( GitCommit gitcommit : gitCommit){
			em.persist(gitcommit);
			em.flush();
		}
		//return gitCommit;
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
