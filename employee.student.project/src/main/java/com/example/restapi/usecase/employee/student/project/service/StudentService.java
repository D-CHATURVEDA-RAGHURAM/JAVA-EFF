package com.example.restapi.usecase.employee.student.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.restapi.usecase.employee.student.project.entity.Student;
import com.example.restapi.usecase.employee.student.project.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	public void studentAdd(@RequestBody Student student)
	{
		studentRepo.save(student);
	}
	
	public List<Student> studentPrint()
	{
		return studentRepo.findAll();
	}
	
	public void studentUpdate(@PathVariable int id, @RequestBody Student student)
	{
		Student stu = studentRepo.findById((long)id).get();
		stu.setStudent_branch(student.getStudent_branch());
		stu.setStudent_name(student.getStudent_name());
		stu.setStudent_rollno(student.getStudent_rollno());
		studentRepo.save(stu);
	}
	
	
}
