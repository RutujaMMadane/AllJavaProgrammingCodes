package com.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="empdetail")
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	@ManyToMany(cascade=CascadeType.ALL)
	
	@JoinTable(name="employee_project",joinColumns= {
			@JoinColumn(name="employee_id")}
	,inverseJoinColumns= {
			@JoinColumns(name="project_id")})
	Set<Project> projects=new HashSet<Project>();
	public Employee()
	{
		super();
	}
	public Employee(String firstName, String lastName, Set<Project> projects) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.projects = projects;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", projects" + projects +"]";
	}
	

}
