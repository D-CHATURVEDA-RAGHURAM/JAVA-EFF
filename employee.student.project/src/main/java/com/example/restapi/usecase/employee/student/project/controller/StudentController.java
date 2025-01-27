package com.example.restapi.usecase.employee.student.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.usecase.employee.student.project.entity.Student;
import com.example.restapi.usecase.employee.student.project.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student/insert")
	public void addStudent(@RequestBody Student student)
	{
		studentService.studentAdd(student);
	}
	
	@GetMapping("/student/display")
	public List<Student> printStudent()
	{
		return studentService.studentPrint();
	}
	
}
