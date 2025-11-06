package com.cg.springtest.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "jobs")
public class Jobs {
	@Id
	@Column(name = "job_id")
	private String jobId;

	@Column(name = "job_title")
	private String jobTitle;

	@Column(name = "min_salary")
	private BigDecimal minSalary;

	@Column(name = "max_salary")
	private BigDecimal maxSalary;

	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Employees> employees;

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public BigDecimal getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(BigDecimal minSalary) {
		this.minSalary = minSalary;
	}

	public BigDecimal getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(BigDecimal maxSalary) {
		this.maxSalary = maxSalary;
	}

	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}

	// Getters and Setters
}
