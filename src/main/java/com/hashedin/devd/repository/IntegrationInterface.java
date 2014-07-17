package com.hashedin.devd.repository;


import java.util.List;

import com.hashedin.devd.model.GitCommit;
import com.hashedin.devd.model.GitProject;

public  interface IntegrationInterface{
	
	List<GitCommit> fetchData();
	List<GitProject> fetchProject();

}
