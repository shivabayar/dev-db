package com.hashedin.devd.repository;

import java.util.List;

import com.hashedin.devd.model.GitCommit;

public interface GitCommitRepository {
	GitCommit find(Long commitId);

	List<GitCommit> findAll();

	GitCommit save(GitCommit gitCommit);

	GitCommit update(GitCommit gitCommit, Long commitId);

	GitCommit delete(Long commitId);

}
