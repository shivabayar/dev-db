package com.hashedin.devd.repository;

import com.hashedin.devd.model.GitCommit;
import com.hashedin.devd.model.GitProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

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
		for(GitCommit p : list){
			System.out.println(p);
		}
		return list;
	}

	@Override
	public List<GitProject> fetchProject() {
		List<GitProject> list = new ArrayList<GitProject>();
		GitProject gitProject = new GitProject();
		for(int i=1; i<4; i++){
			gitProject.setGitPrjId(i);
			System.out.println("/n"+i);
			gitProject.setCreatedAt("12-12-2013");
			gitProject.setGitUserId(i);
			gitProject.setProjectUrl("http://github/devDash");
			gitProject.setUserUrl("http://github/Masroor");
			gitProject.setUpdatedAt("12-12-2013");
			//add to database
			list.add(gitProject);
		}
		for(GitProject p : list){
			System.out.println(p);
		}
		return list;
	}

}
