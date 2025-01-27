package com.example.restapi.usecase.employee.student.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private long employee_id;
	
	private String employee_name;
	
	private String employee_desig;

	
	
	public Employee() {
		super();
	}



	public Employee(long employee_id, String employee_name, String employee_desig) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_desig = employee_desig;
	}



	public long getEmployee_id() {
		return employee_id;
	}



	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}



	public String getEmployee_name() {
		return employee_name;
	}



	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}



	public String getEmployee_desig() {
		return employee_desig;
	}



	public void setEmployee_desig(String employee_desig) {
		this.employee_desig = employee_desig;
	}



	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_desig="
				+ employee_desig + "]";
	}

	
	

}
