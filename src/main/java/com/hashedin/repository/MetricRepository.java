package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.GitMetric;

public interface MetricRepository {

	List<GitMetric> findAll();
	GitMetric save(GitMetric metric);
}
