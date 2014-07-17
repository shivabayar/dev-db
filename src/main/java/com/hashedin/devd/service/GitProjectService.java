package com.hashedin.devd.service;

import java.util.List;

import com.hashedin.devd.model.GitProject;

public interface GitProjectService {
	GitProject find(Long gitProjectId);

	List<GitProject> findAll();

	GitProject save(GitProject gitProject);

	GitProject update(GitProject gitProject, Long gitProjectId);

	GitProject delete(Long gitProjectId);
}
