package com.hashedin.devd.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.devd.model.GitProject;

@Service
@Repository
public class GitProjectRepositoryImpl implements GitProjectRepository {

	@PersistenceContext
	private EntityManager em;

	@Autowired 
	private IntegrationInterface integrationInterface;
	
	//@Autowired
	//private GitProjectRepository gitProjectRepository;
	
	@Override
	@Transactional
	public void collectProject() {
		List<GitProject> projects =integrationInterface.fetchProject();
		for( GitProject gitproject : projects){
			em.persist(gitproject);
			em.flush();
		}
	}
	
	
	@Override
	public void save(List<GitProject> gitProject) {
		// Saves the given task object and returns the same.
		for( GitProject gitproject : gitProject){
			em.persist(gitproject);
			em.flush();
		}
	}

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
