package com.hashedin.devd.repository;

import com.hashedin.devd.model.GitCommit;

import java.util.ArrayList;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Repository;

@Repository
@Service
public class IntegrationImpl implements IntegrationInterface {

	@Override
	public List<GitCommit> fetchData() {
		

		List<GitCommit> list = new ArrayList<GitCommit>();
		GitCommit object = new GitCommit();

		// replace this with a function to return original data

		for (int i = 0; i < 3; i++) {
			object.setGitCommitId(i);
			object.setTimeStamp("12-12-12");
			object.setGitCommitMessage("first commit");
			object.setGitUserId(1223);
			// add to database

			list.add(object);

		}
		return list;
	}

}
