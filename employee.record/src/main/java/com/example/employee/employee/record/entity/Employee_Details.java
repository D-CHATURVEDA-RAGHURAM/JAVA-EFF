package com.example.employee.employee.record.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee_Details {
	
	@Id
	private long employee_id;
	
	private String employee_name;
	
	private String employee_designation;
	
	public Employee_Details() {
		super();
	}

	
	
	public Employee_Details(Long id,String name, String designation) {
		super();
		this.employee_id = id;
		this.employee_name = name;
		this.employee_designation = designation;
	}



	public long getId() {
		return employee_id;
	}

	public void setId(long id) {
		this.employee_id = id;
	}

	public String getName() {
		return employee_name;
	}

	public void setName(String name) {
		this.employee_name = name;
	}

	public String getDesignation() {
		return employee_designation;
	}

	public void setDesignation(String designation) {
		this.employee_designation = designation;
	}

	@Override
	public String toString() {
		return "Employee_Details [id=" + employee_id + ", name=" + employee_name + ", designation=" + employee_designation + "]";
	}
	
	
	
}
