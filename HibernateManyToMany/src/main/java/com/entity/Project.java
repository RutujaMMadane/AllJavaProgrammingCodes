package com.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	@Id
	@GeneratedValue
	private int id;
	private String projectTitle;
	@ManyToMany(mappedBy="project",cascade=CascadeType.ALL)
	private Set<Employee> employees=new  HashSet<Employee>();
	public Project() {
		super();
		
	}
	public Project(String projectTitle, Set<Employee> employees) {
		super();
		
		this.projectTitle = projectTitle;
		this.employees = employees;
	}
	
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectTitle=" + projectTitle + ",employees="+employees+"]";
	}
	

}
