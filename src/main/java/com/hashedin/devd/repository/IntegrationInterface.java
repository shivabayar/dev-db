package com.hashedin.devd.repository;


import java.util.List;

import com.hashedin.devd.model.GitCommit;

public  interface IntegrationInterface{
	
	List<GitCommit> fetchData();

}
