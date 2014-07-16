package com.hashedin.model;

import java.util.List;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@XmlRootElement
@Entity
@Table(name = "gitPullRequest")
@NamedQueries({ @NamedQuery(name = "GitPullRequest.findAll", query = "SELECT r FROM GitPullRequest r") })
public class GitPullRequest {

	@Id
	private long gitPullRequestId;
	private long gitUserId; // owner of the repo
	private long gitProjectId;
	private long requesterId;

	public long getPullRequestId() {
		return gitPullRequestId;
	}

	public void setPullRequestId(long gitPullRequestId) {
		this.gitPullRequestId = gitPullRequestId;
	}

	public long getUserId() {
		return gitUserId;
	}

	public void setUserId(long gitUserId) {
		this.gitUserId = gitUserId;
	}

	public long getGitProjectId() {
		return gitProjectId;
	}

	public void setGitProjectId(long gitProjectId) {
		this.gitProjectId = gitProjectId;
	}

	public long getRequesterId() {
		return requesterId;
	}

	public void setRequesterId(long requesterId) {
		this.requesterId = requesterId;
	}

}
