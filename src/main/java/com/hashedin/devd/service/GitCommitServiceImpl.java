package com.hashedin.devd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.devd.model.GitCommit;
import com.hashedin.devd.repository.GitCommitRepository;

@Service("gitCommitService")
public class GitCommitServiceImpl implements GitCommitService {

	@Autowired
	private GitCommitRepository gitCommitRepository;

	@Override
	public GitCommit find(Long gitCommitId) {
		// Returns the Task for given taskId.
		return gitCommitRepository.find(gitCommitId);
	}

	@Override
	public List<GitCommit> findAll() {
		// Returns all the tasks in our system.
		return gitCommitRepository.findAll();
	}

	@Transactional
	public GitCommit save(GitCommit gitCommit) {
		// Saves the given task object and returns the same.
		gitCommitRepository.save(gitCommit);
		return gitCommit;
	}

	@Override
	public GitCommit update(GitCommit gitCommit, Long gitCommitId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public GitCommit delete(Long gitCommitId) {
		// Deletes the task with the give taskId and returns the same.
		return gitCommitRepository.delete(gitCommitId);
	}

}
