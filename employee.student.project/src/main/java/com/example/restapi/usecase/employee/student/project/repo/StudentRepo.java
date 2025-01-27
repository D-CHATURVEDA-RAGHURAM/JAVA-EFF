package com.example.restapi.usecase.employee.student.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.usecase.employee.student.project.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
