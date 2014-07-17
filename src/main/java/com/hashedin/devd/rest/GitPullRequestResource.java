package com.hashedin.devd.rest;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hashedin.devd.model.GitPullRequest;
import com.hashedin.devd.service.GitPullRequestService;
@Component
@Path("/gitPullRequests")
public class GitPullRequestResource {
	@Autowired
	private GitPullRequestService gitPullRequestService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<GitPullRequest> list() {
		// Handles GET on /tasks. Lists all the tasks we have in our system.
		return gitPullRequestService.findAll();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/{gitPullRequestId}")
	public GitPullRequest get(
			@PathParam("gitPullRequestId") Long gitPullRequestId) {
		// Handles GET on /tasks/{taskId}. Returns a single task for the given
		// taskId.
		return gitPullRequestService.find(gitPullRequestId);
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response create(GitPullRequest gitPullRequest,
			@Context final HttpServletResponse response)
			throws URISyntaxException {
		// Handles POST on /tasks. Creates a new task and adds it into an
		// repository.
		gitPullRequestService.save(gitPullRequest);
		response.setStatus(Response.Status.CREATED.getStatusCode());
		return Response
				.created(
						new URI("/gitPullRequests/"
								+ gitPullRequest.getPullRequestId())).build();
	}

	@PUT
	@Path("/{gitPullRequestId}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public GitPullRequest update(GitPullRequest gitPullRequest,
			@PathParam("gitPullRequestId") Long gitPullRequestId) {
		// Handles PUT on /tasks/taskId. Updates the existing task with the new
		// values.
		return gitPullRequestService.update(gitPullRequest, gitPullRequestId);
	}

	@DELETE
	@Path("/{gitPullRequestId}")
	public GitPullRequest delete(
			@PathParam("gitPullRequestId") Long gitPullRequestId) {
		// Handles DELETE on /tasks/taskId. Deletes the existing task and
		// returns the same.
		return gitPullRequestService.delete(gitPullRequestId);
	}

}
