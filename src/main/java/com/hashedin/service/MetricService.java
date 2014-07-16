package com.hashedin.service;

import java.util.List;

import com.hashedin.model.GitMetric;

public interface MetricService {
	List<GitMetric> findAll();
	GitMetric save(GitMetric metric);

}
