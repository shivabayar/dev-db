package com.hashedin.devd.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hashedin.devd.repository.CollectRepository;
import com.hashedin.devd.service.CollectService;
import com.hashedin.devd.model.Alert;

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
	
//	@POST
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public Response create(Alert alert,
//			@Context final HttpServletResponse response)
//			throws URISyntaxException {
//		// Handles POST on /alerts. Creates a new alert and adds it into an
//		// repository.
//		collectService.save(alert);
//		response.setStatus(Response.Status.CREATED.getStatusCode());
//		return Response.created(new URI("/collects/" + alert.getAlertId()))
//				.build();
//	}
}
