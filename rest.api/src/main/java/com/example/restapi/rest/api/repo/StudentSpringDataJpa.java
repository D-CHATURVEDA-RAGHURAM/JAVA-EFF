package com.example.restapi.rest.api.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.rest.api.entity.Student;

public interface StudentSpringDataJpa extends JpaRepository<Student, Long>{

}
