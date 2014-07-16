package com.hashedin.model;

import java.util.List;
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
	private String userGitUrl;
	private List<String> projectUrl;
	private String lastCommitedAt;
	private int frequency;
	private boolean brokeBuild;

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

	public List<String> getProjectUrl() {
		return projectUrl;
	}

	public void setProjectUrl(List<String> projectUrl) {
		this.projectUrl = projectUrl;
	}

	public String getLastCommitedAt() {
		return lastCommitedAt;
	}

	public void setLastCommitedAt(String lastCommitedAt) {
		this.lastCommitedAt = lastCommitedAt;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public boolean isBrokeBuild() {
		return brokeBuild;
	}

	public void setBrokeBuild(boolean brokeBuild) {
		this.brokeBuild = brokeBuild;
	}

}
