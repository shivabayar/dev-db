package com.hashedin.repository;

import java.util.List;
import com.hashedin.model.GitUser;

public interface GitUserRepository {
	GitUser find(Long gitUserId);

	List<GitUser> findAll();

	GitUser save(GitUser gitUser);

	GitUser update(GitUser gitUser, Long gitUserId);

	GitUser delete(Long gitUserId);
}
