package com.example.restapi.usecase.employee.student.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.restapi.usecase.employee.student.project.entity.Employee;
import com.example.restapi.usecase.employee.student.project.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public void employeeAdd(@RequestBody Employee employee)
	{
		employeeRepo.save(employee);
	}
	
	public void employeeUpdate(@PathVariable int id, @RequestBody Employee employee)
	{
		Employee emp = employeeRepo.findById((long)id).get();
		emp.setEmployee_name(employee.getEmployee_name());
		emp.setEmployee_desig(employee.getEmployee_desig());
		employeeRepo.save(emp);
	}
	
	public void employeeDelete(@PathVariable int id)
	{
		employeeRepo.deleteById((long)id);
	}
	
	public List<Employee> employeePrint()
	{
		return employeeRepo.findAll();
	}
	
}
