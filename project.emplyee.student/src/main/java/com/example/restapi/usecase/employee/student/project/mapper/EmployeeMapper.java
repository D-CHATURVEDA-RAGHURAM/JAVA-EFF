package com.example.restapi.usecase.employee.student.project.mapper;

import org.springframework.stereotype.Component;

import com.example.restapi.usecase.employee.student.project.dto.EmployeeDto;
import com.example.restapi.usecase.employee.student.project.entity.Employee;


@Component
public class EmployeeMapper {

	public EmployeeDto toEmployeeDto(Employee employee)
	{
		if (employee == null)
		{
			return null;
		}
		return new EmployeeDto(
				employee.getEmployeeId(),
				employee.getEmployeeName(),
				employee.getEmployeeDesig()
			);
	}
	
	public Employee toEmployee(EmployeeDto employeeDto)
	{
		if (employeeDto == null)
		{
			return null;
		}
		return new Employee(
				employeeDto.getEmployeeId(),
				employeeDto.getEmployeeName(),
				employeeDto.getEmployeeDesig()
			);
	}
	
	
}
