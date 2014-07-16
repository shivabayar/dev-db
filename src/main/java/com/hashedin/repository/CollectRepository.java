package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.Alert;

public interface CollectRepository {

	List<Alert> findAll();
	Alert save(Alert alert);
}
