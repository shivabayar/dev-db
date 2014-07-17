package com.hashedin.devd.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hashedin.devd.model.Alert;
import com.hashedin.devd.service.AlertService;

@Component
@Path("/alerts")
public class AlertResource {
	@Autowired
	private AlertService alertService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Alert> list() {
		// Handles GET on /tasks. Lists all the tasks we have in our system.
		return alertService.findAll();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/{alertId}")
	public Alert get(@PathParam("alertId") Long alertId) {
		// Handles GET on /tasks/{taskId}. Returns a single task for the given
		// taskId.
		return alertService.find(alertId);
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response create(Alert alert,
			@Context final HttpServletResponse response)
			throws URISyntaxException {
		// Handles POST on /tasks. Creates a new task and adds it into an
		// repository.
		alertService.save(alert);
		response.setStatus(Response.Status.CREATED.getStatusCode());
		return Response.created(new URI("/alerts/" + alert.getAlertId()))
				.build();
	}

	@PUT
	@Path("/{alertId}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Alert update(Alert alert, @PathParam("alertId") Long alertId) {
		// Handles PUT on /tasks/taskId. Updates the existing task with the new
		// values.
		return alertService.update(alert, alertId);
	}

	@DELETE
	@Path("/{alertId}")
	public Alert delete(@PathParam("alertId") Long alertId) {
		// Handles DELETE on /tasks/taskId. Deletes the existing task and
		// returns the same.
		return alertService.delete(alertId);
	}

}
