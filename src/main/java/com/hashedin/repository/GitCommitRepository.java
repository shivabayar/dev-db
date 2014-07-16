package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.GitCommit;;

public interface GitCommitRepository {
	GitCommit find(Long commitId);

	List<GitCommit> findAll();

	GitCommit save(GitCommit gitCommit);

	GitCommit update(GitCommit gitCommit, Long commitId);

	GitCommit delete(Long commitId);

}
