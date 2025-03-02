package com.example.restapi.usecase.employee.student.project.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class EmployeeDto {
	
	private long employeeId;
	
	private String employeeName;
	
	private String employeeDesig;

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesig() {
		return employeeDesig;
	}

	public void setEmployeeDesig(String employeeDesig) {
		this.employeeDesig = employeeDesig;
	}

	public EmployeeDto(long employeeId, String employeeName, String employeeDesig) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesig = employeeDesig;
	}

	public EmployeeDto() {
		super();
	}
	
	
	
}
