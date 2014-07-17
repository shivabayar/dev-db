package com.hashedin.devd.service;

import java.util.List;

import com.hashedin.devd.model.GitCommit;

public interface GitCommitService {
	GitCommit find(Long gitCommitId);

	List<GitCommit> findAll();

	GitCommit save(GitCommit gitCommit);

	GitCommit update(GitCommit gitCommit, Long gitCommitId);

	GitCommit delete(Long gitCommitId);
}
