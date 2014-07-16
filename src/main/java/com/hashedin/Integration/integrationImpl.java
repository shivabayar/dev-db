package com.hashedin.Integration;
import 	com.hashedin.model.GitCommit ;
import 	java.util.ArrayList;
import 	java.util.List;

public class integrationImpl implements IntegrationInterface {


	@Override
	public GitCommit IDataFetch() {

		List<GitCommit> list = new ArrayList<GitCommit>();	
		GitCommit  object = new GitCommit();
		
		//replace this with a function to return original data
		
		for(int i=0;i<3;i++){
		
		object.setTimeStamp("12-12-12");
		object.setCommitMessage("first commit");
		object.setGitUserId(1223);
		//add to database
		
		list.add(object);
		
		}
		return object;
	}

}
	