package com.example.restapi.usecase.employee.student.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
	
	@Id
	private long student_id;
	
	private String student_name;
	
	private String student_branch;
	
	private long student_rollno;	
}
