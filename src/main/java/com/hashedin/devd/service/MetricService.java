package com.hashedin.devd.service;

import java.util.List;

import com.hashedin.devd.model.GitMetric;

public interface MetricService {
	List<GitMetric> findAll();
	GitMetric save(GitMetric metric);

}
