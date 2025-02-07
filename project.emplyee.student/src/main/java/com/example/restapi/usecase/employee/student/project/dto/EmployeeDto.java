package com.example.restapi.usecase.employee.student.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
	
	private long employeeId;
	
	private String employeeName;
	
	private String employeeDesig;

	
}
