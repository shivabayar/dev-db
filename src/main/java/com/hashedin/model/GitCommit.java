package com.hashedin.model;

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
@NamedQueries({ @NamedQuery(name = "GitCommit.findAll", query = "SELECT gc FROM GitCommit gc") })
public class GitCommit {

	@Id
	@GeneratedValue
	private long commitId;

	private String commitMessage;

	private String timeStamp;

	private GitUser gitUser;

	public String getCommitMessage() {
		return commitMessage;
	}

	public void setCommitMessage(String commitMessage) {
		this.commitMessage = commitMessage;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public GitUser getGitUser() {
		return gitUser;
	}

	public void setGitUser(GitUser gitUser) {
		this.gitUser = gitUser;
	}
}
