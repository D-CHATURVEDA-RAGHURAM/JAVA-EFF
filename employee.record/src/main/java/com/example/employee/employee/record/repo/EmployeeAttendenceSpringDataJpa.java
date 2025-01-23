package com.example.employee.employee.record.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.employee.record.entity.Employee_Attendence;

public interface EmployeeAttendenceSpringDataJpa extends JpaRepository<Employee_Attendence, Long>{
	
}
