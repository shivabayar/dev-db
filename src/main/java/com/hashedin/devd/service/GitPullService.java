package com.hashedin.devd.service;

import java.util.List;

import com.hashedin.devd.model.GitPull;

public interface GitPullService {
	GitPull find(Long gitPullRequestId);

	List<GitPull> findAll();

	void save(GitPull gitPull);

	void save(List<GitPull> gitPull);
	
	GitPull update(GitPull gitPull, Long gitPullId);

	GitPull delete(Long gitPullId);
}
