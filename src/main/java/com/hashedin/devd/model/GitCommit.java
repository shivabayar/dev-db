package com.hashedin.devd.model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@XmlRootElement
@Entity
@Table(name = "gitCommits")
@NamedQueries({ @NamedQuery(name = "GitCommit.findAll", query = "SELECT c FROM GitCommit c") })
public class GitCommit implements GitMetric{

	@Id
	@GeneratedValue
	private long gitCmtId;

	private long gitCommitId;
	private String gitCommitMessage;
	private String timeStamp;
	private long gitUserId; // owner of the repo

	public long getGitCmtId() {
		return gitCmtId;
	}

	public void setGitCmtId(long gitCmtId) {
		this.gitCmtId = gitCmtId;
	}

	public long getGitCommitId() {
		return gitCommitId;
	}

	public void setGitCommitId(long gitCommitId) {
		this.gitCommitId = gitCommitId;
	}

	public String getGitCommitMessage() {
		return gitCommitMessage;
	}

	public void setGitCommitMessage(String gitCommitMessage) {
		this.gitCommitMessage = gitCommitMessage;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public long getGitUserId() {
		return gitUserId;
	}

	public void setGitUserId(long gitUserId) {
		this.gitUserId = gitUserId;
	}

	@Override
	public Long getMetricId() {
		return gitCommitId;
	}
}
