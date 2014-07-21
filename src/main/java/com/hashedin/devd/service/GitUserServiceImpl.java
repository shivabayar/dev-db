package com.hashedin.devd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.devd.model.GitPull;
import com.hashedin.devd.model.GitPush;
import com.hashedin.devd.model.GitUser;
import com.hashedin.devd.repository.GitUserRepository;

@Repository
@Service("gitUserService")
public class GitUserServiceImpl implements GitUserService {
	@Autowired
	private GitUserRepository gitUserRepository;

	@Override
	public GitUser find(Long gitUserId) {
		// Returns the Task for given taskId.
		return gitUserRepository.find(gitUserId);
	}

	@Override
	public List<GitUser> findAll() {
		// Returns all the tasks in our system.
		return gitUserRepository.findAll();
	}

	@Override
	@Transactional
	public GitUser save(GitUser gitUser) {
		// Saves the given task object and returns the same.
		gitUserRepository.save(gitUser);
		return gitUser;
	}

	@Override
	public GitUser update(GitUser gitUser, Long gitUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public GitUser delete(Long gitUserId) {
		// Deletes the task with the give taskId and returns the same.
		return gitUserRepository.delete(gitUserId);
	}

	@Override
	public List<GitPush> findPushListByUserId(Long gitUserId) {
		System.out.println("Git push from gur   ->   "+gitUserRepository.find(gitUserId).getGitPush());
		return gitUserRepository.find(gitUserId).getGitPush();
	}

	@Override
	public List<GitPull> findPullListByUserId(Long gitUserId) {

		return gitUserRepository.find(gitUserId).getGitPull();
	}

}
