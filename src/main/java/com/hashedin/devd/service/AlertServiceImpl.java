package com.hashedin.devd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.devd.model.Alert;
import com.hashedin.devd.repository.AlertRepository;

@Service("alertService")
public class AlertServiceImpl implements AlertService {

	@Autowired
	private AlertRepository alertRepository;

	@Override
	public Alert find(Long alertId) {
		// Returns the Task for given taskId.
		return alertRepository.find(alertId);
	}

	@Transactional
	public Alert save(Alert alert) {
		// Saves the given task object and returns the same.
		alertRepository.save(alert);
		return alert;
	}

	@Override
	public List<Alert> findAll() {
		// Returns all the tasks in our system.
		return alertRepository.findAll();
	}

	@Override
	public Alert update(Alert alert, Long alertId) {
		// Updates the task with the given taskId;
		return null;
	}

	@Transactional
	public Alert delete(Long alertId) {
		// Deletes the task with the give taskId and returns the same.
		return alertRepository.delete(alertId);
	}

}
