package com.hashedin.model;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@XmlRootElement
@Entity
@Table(name = "users")
@NamedQueries({ @NamedQuery(name = "GitUser.findAll", query = "SELECT u FROM GitUser u") })
public class GitUser {

	@Id
	private long gitUserId; // owner of the repo
	private String email;
	private String apiKey;
	private String userProfileUrl;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserProfileUrl() {
		return userProfileUrl;
	}

	public void setUserProfileUrl(String userProfileUrl) {
		this.userProfileUrl = userProfileUrl;
	}

	public long getUserId() {
		return gitUserId;
	}

	public void setUserId(long gitUserId) {
		this.gitUserId = gitUserId;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

}
