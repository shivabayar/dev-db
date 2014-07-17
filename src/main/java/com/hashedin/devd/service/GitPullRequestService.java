package com.hashedin.devd.service;

import java.util.List;

import com.hashedin.devd.model.GitPullRequest;;

public interface GitPullRequestService {
	GitPullRequest find(Long gitPullRequestId);

	List<GitPullRequest> findAll();

	GitPullRequest save(GitPullRequest gitPullRequest);

	GitPullRequest update(GitPullRequest gitPullRequest, Long gitPullRequestId);

	GitPullRequest delete(Long gitPullRequestId);
}
