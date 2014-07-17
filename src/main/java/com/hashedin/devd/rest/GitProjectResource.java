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

import com.hashedin.devd.model.GitProject;
import com.hashedin.devd.service.GitProjectService;

@Component
@Path("/projects")
public class GitProjectResource {
	
	@Autowired
	private GitProjectService gitProjectService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<GitProject> list() {
		// Handles GET on /tasks. Lists all the tasks we have in our system.
		return gitProjectService.findAll();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/{gitProjectId}")
	public GitProject get(@PathParam("gitProjectId") Long gitProjectId) {
		// Handles GET on /tasks/{taskId}. Returns a single task for the given
		// taskId.
		return gitProjectService.find(gitProjectId);
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response create(GitProject gitProject,
			@Context final HttpServletResponse response)
			throws URISyntaxException {
		// Handles POST on /tasks. Creates a new task and adds it into an
		// repository.
		gitProjectService.save(gitProject);
		response.setStatus(Response.Status.CREATED.getStatusCode());
		return Response.created(new URI("/projects/" + gitProject.getProjectId()))
				.build();
	}

	@PUT
	@Path("/{gitProjectId}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public GitProject update(GitProject gitProject,
			@PathParam("gitProjectId") Long gitProjectId) {
		// Handles PUT on /tasks/taskId. Updates the existing task with the new
		// values.
		return gitProjectService.update(gitProject, gitProjectId);
	}

	@DELETE
	@Path("/{gitProjectId}")
	public GitProject delete(@PathParam("gitProjectId") Long gitProjectId) {
		// Handles DELETE on /tasks/taskId. Deletes the existing task and
		// returns the same.
		return gitProjectService.delete(gitProjectId);
	}



}
