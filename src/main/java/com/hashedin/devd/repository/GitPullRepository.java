package com.hashedin.devd.repository;

import java.util.List;

import com.hashedin.devd.model.GitPull;

public interface GitPullRepository {
	GitPull find(Long gitPullId);

	List<GitPull> findAll();

	GitPull save(GitPull gitPull);
	
	void save(List<GitPull> gitPullList);

	GitPull update(GitPull gitPull, Long gitPullId);

	GitPull delete(Long gitPullId);

}
