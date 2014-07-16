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
@Table(name = "alerts")
@NamedQueries({ @NamedQuery(name = "Alert.findAll", query = "SELECT a FROM Alert a") })
public class Alert {

	@Id
	@GeneratedValue
	private long alertId;
	private long gitUserId;
	private long gitProjectId;
	private long gitCommitId;
	private long gitPullrequestId;
	private long requesterId;
	private boolean isBrokeBuild;
	private boolean isFrequentCommits;
	private String userGitUrl;
	private String projectUrl;
	private String lastCommitedAt;
	
	public long getGitUserId() {
		return gitUserId;
	}

	public void setGitUserId(long gitUserId) {
		this.gitUserId = gitUserId;
	}

	public long getGitProjectId() {
		return gitProjectId;
	}

	public void setGitProjectId(long gitProjectId) {
		this.gitProjectId = gitProjectId;
	}

	public long getGitCommitId() {
		return gitCommitId;
	}

	public void setGitCommitId(long gitCommitId) {
		this.gitCommitId = gitCommitId;
	}

	public long getGitPullrequestId() {
		return gitPullrequestId;
	}

	public void setGitPullrequestId(long gitPullrequestId) {
		this.gitPullrequestId = gitPullrequestId;
	}

	public long getRequesterId() {
		return requesterId;
	}

	public void setRequesterId(long requesterId) {
		this.requesterId = requesterId;
	}

	

	public long getAlertId() {
		return alertId;
	}

	public void setAlertId(long alertId) {
		this.alertId = alertId;
	}

	public String getUserGitUrl() {
		return userGitUrl;
	}

	public void setUserGitUrl(String userGitUrl) {
		this.userGitUrl = userGitUrl;
	}

	public String getLastCommitedAt() {
		return lastCommitedAt;
	}

	public void setLastCommitedAt(String lastCommitedAt) {
		this.lastCommitedAt = lastCommitedAt;
	}

	public String getProjectUrl() {
		return projectUrl;
	}

	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}

	public boolean isBrokeBuild() {
		return isBrokeBuild;
	}

	public void setBrokeBuild(boolean isBrokeBuild) {
		this.isBrokeBuild = isBrokeBuild;
	}

	public boolean isFrequentCommits() {
		return isFrequentCommits;
	}

	public void setFrequentCommits(boolean isFrequentCommits) {
		this.isFrequentCommits = isFrequentCommits;
	}



}
