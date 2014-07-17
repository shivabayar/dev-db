package com.hashedin.devd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.devd.model.GitPullRequest;
import com.hashedin.devd.repository.GitPullRequestRepository;

@Service("gitPullRequestService")
public class GitPullRequestServiceImpl implements GitPullRequestService {

	@Autowired
	private GitPullRequestRepository gitPullRequestRepository;

	@Override
	public GitPullRequest find(Long gitPullRequestId) {
		// Returns the Task for given taskId.
		return gitPullRequestRepository.find(gitPullRequestId);
	}

	@Override
	public List<GitPullRequest> findAll() {
		// Returns all the tasks in our system.
		return gitPullRequestRepository.findAll();
	}

	@Transactional
	public GitPullRequest save(GitPullRequest gitPullRequest) {
		// Saves the given task object and returns the same.
		gitPullRequestRepository.save(gitPullRequest);
		return gitPullRequest;
	}

	@Override
	public GitPullRequest update(GitPullRequest gitPullRequest,
			Long gitPullRequestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public GitPullRequest delete(Long gitPullRequestId) {
		// Deletes the task with the give taskId and returns the same.
		return gitPullRequestRepository.delete(gitPullRequestId);
	}

}
