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
@Table(name = "gitmetrics")
@NamedQueries({ @NamedQuery(name = "GitMetric.findAll", query = "SELECT gm FROM GitMetric gm") })
public class GitMetric {

	@Id
	@GeneratedValue
	private long metricId;

	private List<GitUser> usersList;
	private List<GitProject> projectsList;

	public long getMetricId() {
		return metricId;
	}

	public void setMetricId(long metricId) {
		this.metricId = metricId;
	}

	public List<GitProject> getProjectsList() {
		return projectsList;
	}

	public void setProjectsList(List<GitProject> projectsList) {
		this.projectsList = projectsList;
	}

	public List<GitUser> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<GitUser> usersList) {
		this.usersList = usersList;
	}

}
