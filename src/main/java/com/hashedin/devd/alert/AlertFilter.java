package com.hashedin.devd.alert;

import java.util.ArrayList;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Repository;

import com.hashedin.devd.model.Alert;
import com.hashedin.devd.model.GitCommit;

@Service
@Repository
public class AlertFilter {

	public List<Alert> createAlerts(List<GitCommit> gitCommit) {
		//Compute Alert on the basis of commits
		List<Alert> alertsList = new ArrayList<Alert>();
		alertsList.add(new Alert());
		alertsList.add(new Alert());

	return alertsList;
	}
}