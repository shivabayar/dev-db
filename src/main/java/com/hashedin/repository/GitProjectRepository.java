package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.GitProject;;

public interface GitProjectRepository {
	GitProject find(Long gitProjectId);

	List<GitProject> findAll();

	GitProject save(GitProject gitProject);

	GitProject update(GitProject gitProject, Long gitProjectId);

	GitProject delete(Long gitProjectId);
}
