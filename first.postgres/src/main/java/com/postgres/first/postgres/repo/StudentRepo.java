package com.postgres.first.postgres.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.postgres.first.postgres.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long>{

}
