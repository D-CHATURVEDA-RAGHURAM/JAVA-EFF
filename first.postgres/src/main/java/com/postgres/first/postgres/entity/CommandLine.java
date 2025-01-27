package com.postgres.first.postgres.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import com.postgres.first.postgres.repo.StudentRepoSpringDataJpa;

@Repository
public class CommandLine implements CommandLineRunner{

	@Autowired
	private StudentRepoSpringDataJpa repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Student(1l, "Chaturved"));
		repository.save(new Student(2l, "Raghu"));
		repository.save(new Student(3l, "Ram"));
		repository.save(new Student(4l,"Yatin"));
		
		System.out.println(repository.findAll());
		
		repository.deleteById(3l);
		System.out.println(repository.findById(3l));
	}

}
