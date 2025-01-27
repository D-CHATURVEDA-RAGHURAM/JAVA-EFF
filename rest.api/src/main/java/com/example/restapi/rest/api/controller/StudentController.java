package com.example.restapi.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.rest.api.entity.Student;
import com.example.restapi.rest.api.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/insert")
	public void addStudent(@RequestBody Student student)
	{
		service.studentadd(student);	
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id,@RequestBody Student reqStudent)
	{
		service.studentupdate(id, reqStudent);
	}
	
	@DeleteMapping("/delete/{id}")
	public void removeStudent(@PathVariable int id)
	{
		service.studentdelete(id);
	}
	
	
	@GetMapping("/display")
	public List<Student> printAll()
	{
		return service.studentprint();
	}
	
}
