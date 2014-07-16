package com.hashedin.devd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashedin.devd.repository.MetricRepository;
import com.hashedin.devd.model.GitMetric;

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
