package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.GitMetric;

public interface GitMetricRepository {

	GitMetric find(Long gitMetricId);

	List<GitMetric> findAll();

	GitMetric save(GitMetric gitMetric);

	GitMetric update(GitMetric gitMetric, Long gitMetricId);

	GitMetric delete(Long gitMetricId);

}
