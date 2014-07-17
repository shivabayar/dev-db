package com.hashedin.devd.alert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hashedin.devd.integration.CommitedAt;
import com.hashedin.devd.model.Alert;
import com.hashedin.devd.model.GitCommit;


@Service
@Repository
public class AlertFilter {

	public Alert createFilter(){

		CommitedAt c = new CommitedAt();
		Alert a = new Alert();
		a.setLastCommitedAt(c.lastCommitedAt("tanwanirahul"));
		
		

		return a;
	}

	public List<Alert> createAlerts(List<GitCommit> commits) {
		// TODO Auto-generated method stub
		return null;
	}
}