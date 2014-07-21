package com.hashedin.devd.service;

import java.util.List;

import com.hashedin.devd.model.GitPull;
import com.hashedin.devd.model.GitPush;
import com.hashedin.devd.model.GitUser;;

public interface GitUserService {
	GitUser find(Long gitUserId);

	List<GitUser> findAll();

	GitUser save(GitUser gitUser);

	GitUser update(GitUser gitUser, Long gitUserId);

	GitUser delete(Long gitUserId);

	List<GitPush> findPushListByUserId(Long gitUserId);

	List<GitPull> findPullListByUserId(Long gitUserId);
}
