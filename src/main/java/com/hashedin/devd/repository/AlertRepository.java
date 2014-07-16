package com.hashedin.devd.repository;

import java.util.List;

import com.hashedin.devd.model.Alert;


public interface AlertRepository {
	List<Alert> findAll();
	void save(List<Alert> alertList);
	Alert update(Alert alert, Long alertId);
	Alert delete(Long alertId);
	Alert find(Long alertId);
	void saveSingleAlert(Alert alert);
}