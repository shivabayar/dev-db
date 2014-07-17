package com.hashedin.devd.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hashedin.devd.alert.AlertFilter;
import com.hashedin.devd.model.Alert;
import com.hashedin.devd.model.GitCommit;


@Repository("collectRepository")
@Service
public class CollectRepositoryImpl implements CollectRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired 
	private IntegrationInterface integrationInterface;
	
	@Autowired
	private GitCommitRepository gitCommitRepository;
	
	@Autowired
	private AlertFilter alertFilter;
	
	@Autowired
	private AlertRepository alertRepository;
	@Override
	public void collect() {
		List<GitCommit> commits =integrationInterface.fetchData();
		gitCommitRepository.save(commits);
		List<Alert> alertList = alertFilter.createAlerts(commits);
		alertRepository.save(alertList);
	}
}
