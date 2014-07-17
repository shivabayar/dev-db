package com.hashedin.devd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.devd.model.GitProject;
import com.hashedin.devd.repository.GitProjectRepository;

@Service("gitProjectService")
public class GitProjectServiceImpl implements GitProjectService {
	@Autowired
	private GitProjectRepository gitProjectRepository;

	@Override
	public GitProject find(Long gitProjectId) {
		// Returns the Task for given taskId.
		return gitProjectRepository.find(gitProjectId);
	}

	@Override
	public List<GitProject> findAll() {
		// Returns all the tasks in our system.
		return gitProjectRepository.findAll();
	}

	@Transactional
	public GitProject save(GitProject gitProject) {
		// Saves the given task object and returns the same.
		gitProjectRepository.save(gitProject);
		return gitProject;
	}

	@Override
	public GitProject update(GitProject gitProject, Long gitProjectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public GitProject delete(Long gitProjectId) {
		// Deletes the task with the give taskId and returns the same.
		return gitProjectRepository.delete(gitProjectId);
	}

}
