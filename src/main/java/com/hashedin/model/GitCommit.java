package com.hashedin.model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@XmlRootElement
@Entity
@Table(name = "gitCommits")
@NamedQueries({ @NamedQuery(name = "GitCommit.findAll", query = "SELECT gc FROM GitCommit gc") })
public class GitCommit {

	@Id
	private long gitCommitId;

	private String gitCommitMessage;

	private String timeStamp;

	private long gitUserId; // owner of the repo

	public String getCommitMessage() {
		return gitCommitMessage;
	}

	public void setCommitMessage(String gitCommitMessage) {
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
}
