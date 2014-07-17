package com.hashedin.devd.service;

import java.util.List;

import com.hashedin.devd.model.Alert;

public interface AlertService {
	Alert find(Long alertId);

	List<Alert> findAll();

	Alert save(Alert alert);

	Alert update(Alert alert, Long alertId);

	Alert delete(Long alertId);
}
