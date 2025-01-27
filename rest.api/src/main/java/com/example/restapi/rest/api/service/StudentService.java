package com.example.restapi.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.restapi.rest.api.entity.Student;
import com.example.restapi.rest.api.repo.StudentSpringDataJpa;

@Service
public class StudentService {

	@Autowired
	private StudentSpringDataJpa dataJpa;
	
	public void studentadd(@RequestBody Student student)
	{
		dataJpa.save(student);
	}
	
	public List<Student> studentprint()
	{
		return dataJpa.findAll();
	}
	
	public void studentupdate(@PathVariable int id, @RequestBody Student student)
	{
		Student stu = dataJpa.findById((long)id).get();
		stu.setAge(student.getAge());
		stu.setBranch(student.getBranch());
		stu.setName(student.getName());
		dataJpa.save(stu);
	}
	
	public void studentdelete(@PathVariable int id)
	{
		dataJpa.deleteById((long)id);
	}
	
}
