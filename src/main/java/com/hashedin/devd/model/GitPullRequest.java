package com.hashedin.devd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "gitPullRequest")
@NamedQueries({ @NamedQuery(name = "GitPullRequest.findAll", query = "SELECT r FROM GitPullRequest r") })
public class GitPullRequest implements GitMetric{

	@Id
	@GeneratedValue
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

	@Override
	public Long getMetricId() {
		// FIXME : Need to generate and use a long database id here
		return this.gitProjectId;
	}

}
