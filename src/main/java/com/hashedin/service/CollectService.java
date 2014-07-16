package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Alert;

public interface CollectService {

	List<Alert> findAll();
	Alert save(Alert alert);
}
