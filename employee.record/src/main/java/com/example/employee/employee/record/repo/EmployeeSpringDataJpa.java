package com.example.employee.employee.record.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.employee.record.entity.Employee_Details;

public interface EmployeeSpringDataJpa extends JpaRepository<Employee_Details, Long>{

}
