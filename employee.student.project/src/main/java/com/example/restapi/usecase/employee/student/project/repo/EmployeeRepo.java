package com.example.restapi.usecase.employee.student.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.usecase.employee.student.project.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
