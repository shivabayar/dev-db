package main.java.com.hashedin.repository;

import java.util.List;
import com.hashedin.model.Alert;

public interface AlertRepository {

	Alert find(Long alertId);

	List<Alert> findAll();

	Alert save(Alert alert);

	void saveListOfAlerts(List<Alert> listOfAlerts);

	Alert update(Alert alert, Long alertId);

	Alert delete(Long alertId);
}