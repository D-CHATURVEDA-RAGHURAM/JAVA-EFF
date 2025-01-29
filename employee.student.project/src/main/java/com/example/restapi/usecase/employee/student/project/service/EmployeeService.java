package com.example.restapi.usecase.employee.student.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.restapi.usecase.employee.student.project.entity.Employee;
import com.example.restapi.usecase.employee.student.project.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public void employeeAdd( Employee employee)
	{
		employeeRepo.save(employee);
		
	}
	
	public void employeeUpdate(int id, Employee employee)
	{
		Employee emp = employeeRepo.findById((long)id).get();
		emp.setEmployee_name(employee.getEmployee_name());
		emp.setEmployee_desig(employee.getEmployee_desig());
		employeeRepo.save(emp);
		
	}
	
	public ResponseEntity<String> employeeDeleteByName(String name) {
	    try {
	        Optional<Employee> emp = employeeRepo.findByName(name);

	        if (emp.isPresent()) {
	            employeeRepo.deleteByName(name);
	            return ResponseEntity.ok("Employee with name '" + name + "' deleted successfully.");
	        } else {
	            return ResponseEntity.status(404).body("Employee with name '" + name + "' not found.");
	        }
	    } catch (Exception e) {
	        return ResponseEntity.status(500).body("An error occurred: " + e.getMessage());
	    }
	}


	
	public void employeeDeleteByDesig(String desig)
	{
		employeeRepo.deleteByDesig(desig);
	}
	
	public void employeeDelete(int id){
		Employee emp = employeeRepo.findById((long)id).get();
		if (emp == null)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		else
		{
			employeeRepo.deleteById((long)id);	
		}
	}
	
	public List<Employee> employeePrint()
	{
		return employeeRepo.findAll();
	}
	
}
