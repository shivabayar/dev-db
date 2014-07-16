package com.hashedin.devd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashedin.devd.model.Alert;
import com.hashedin.devd.repository.CollectRepository;

@Service("collectService")
public class CollectServiceImpl implements CollectService {

	@Autowired
	private CollectRepository collectRepository;
	
	@Override
	public List<Alert> findAll() {
		return collectRepository.findAll();
	}

	@Override
	public Alert save(Alert alert) {
		collectRepository.save(alert);
		return alert;
	}

}
