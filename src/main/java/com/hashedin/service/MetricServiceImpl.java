package com.hashedin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hashedin.model.GitMetric;
import com.hashedin.repository.MetricRepository;

@Service("metricService")
public class MetricServiceImpl implements MetricService{

	@Autowired
	private MetricRepository metricRepository;

	@Override
	public List<GitMetric> findAll() {
		return metricRepository.findAll();
	}

	@Override
	public GitMetric save(GitMetric metric) {
		metricRepository.save(metric);
		return metric;
	}

}
