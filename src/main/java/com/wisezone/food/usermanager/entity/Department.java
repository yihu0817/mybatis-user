package com.wisezone.food.usermanager.entity;

import java.util.List;

public class Department {
	private int id;
	private String name;
	private List<Employee> employeeLists;
	
	public Department() {
	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployeeLists() {
		return employeeLists;
	}

	public void setEmployeeLists(List<Employee> employeeLists) {
		this.employeeLists = employeeLists;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employeeLists=" + employeeLists + "]";
	}
	
	
	
}
