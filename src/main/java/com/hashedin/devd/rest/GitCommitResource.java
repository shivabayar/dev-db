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

import com.hashedin.devd.model.GitCommit;
import com.hashedin.devd.service.GitCommitService;;

@Component
@Path("/commits")
public class GitCommitResource {

	@Autowired
	private GitCommitService gitCommitService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<GitCommit> list() {
		// Handles GET on /tasks. Lists all the tasks we have in our system.
		return gitCommitService.findAll();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/{gitCommitId}")
	public GitCommit get(@PathParam("gitCommitId") Long gitCommitId) {
		// Handles GET on /tasks/{taskId}. Returns a single task for the given
		// taskId.
		return gitCommitService.find(gitCommitId);
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response create(GitCommit gitCommit,
			@Context final HttpServletResponse response)
			throws URISyntaxException {
		// Handles POST on /tasks. Creates a new task and adds it into an
		// repository.
		gitCommitService.save(gitCommit);
		response.setStatus(Response.Status.CREATED.getStatusCode());
		return Response.created(new URI("/commits/" + gitCommit.getGitCommitId()))
				.build();
	}

	@PUT
	@Path("/{projectId}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public GitCommit update(GitCommit gitCommit,
			@PathParam("gitCommitId") Long gitCommitId) {
		// Handles PUT on /tasks/taskId. Updates the existing task with the new
		// values.
		return gitCommitService.update(gitCommit, gitCommitId);
	}

	@DELETE
	@Path("/{gitCommitId}")
	public GitCommit delete(@PathParam("gitCommitId") Long gitCommitId) {
		// Handles DELETE on /tasks/taskId. Deletes the existing task and
		// returns the same.
		return gitCommitService.delete(gitCommitId);
	}

}
