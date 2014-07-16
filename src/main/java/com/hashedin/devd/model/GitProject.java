package com.hashedin.devd.model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@XmlRootElement
@Entity
@Table(name = "gitProject")
@NamedQueries({ @NamedQuery(name = "GitProject.findAll", query = "SELECT p FROM GitProject p") })
public class GitProject {

	@Id
	private long gitProjectId;
	private String projectUrl;
	private long gitUserId;	//owner of the repo
	private String userUrl;
	private String createdAt;
	private String updatedAt;

	public long getProjectId() {
		return gitProjectId;
	}

	public void setProjectId(long gitProjectId) {
		this.gitProjectId = gitProjectId;
	}

	public String getProjectUrl() {
		return projectUrl;
	}

	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}

	public long getUserId() {
		return gitUserId;
	}

	public void setUserId(long gitUserId) {
		this.gitUserId = gitUserId;
	}

	public String getUserUrl() {
		return userUrl;
	}

	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

}
