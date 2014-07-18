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
@Table(name = "gitProject")
@NamedQueries({ @NamedQuery(name = "GitProject.findAll", query = "SELECT p FROM GitProject p") })
public class GitProject {

	@Override
	public String toString() {
		return "GitProject [gitProjectId=" + gitProjectId + ", gitPrjId="
				+ gitPrjId + ", projectUrl=" + projectUrl + ", gitUserId="
				+ gitUserId + ", userUrl=" + userUrl + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}
	@Id
	@GeneratedValue
	private long gitProjectId;
	
	private long gitPrjId;
	private String projectUrl;
	private long gitUserId;	//owner of the repo
	private String userUrl;
	private String createdAt;
	private String updatedAt;
	public long getGitProjectId() {
		return gitProjectId;
	}
	public void setGitProjectId(long gitProjectId) {
		this.gitProjectId = gitProjectId;
	}
	public long getGitPrjId() {
		return gitPrjId;
	}
	public void setGitPrjId(long gitPrjId) {
		this.gitPrjId = gitPrjId;
	}
	public String getProjectUrl() {
		return projectUrl;
	}
	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}
	public long getGitUserId() {
		return gitUserId;
	}
	public void setGitUserId(long gitUserId) {
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
