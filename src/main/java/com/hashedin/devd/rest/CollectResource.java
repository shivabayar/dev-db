package com.hashedin.devd.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hashedin.devd.model.GitModel;
import com.hashedin.devd.repository.CollectRepository;


//import com.hashedin.devd.service.CollectService;

@Component
@Path("/collects")
public class CollectResource {

	@Autowired
	private CollectRepository collectRepository;
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void listAll() {
		// Handles GET on /alerts. Lists all the alerts we have in our
		// system.
		collectRepository.collect();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/{userId}")
	public List<GitModel> find(@PathParam("userId") Long userId){
		return collectRepository.find(userId);
	}
}
