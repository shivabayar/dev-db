package com.hashedin.repository;

import java.util.List;
import com.hashedin.model.Alert;

public interface AlertRepository {

	Alert find(Long alertId);

	List<Alert> findAll();

	Alert save(Alert alert);

	Alert update(Alert alert, Long alertId);

	Alert delete(Long alertId);
}
