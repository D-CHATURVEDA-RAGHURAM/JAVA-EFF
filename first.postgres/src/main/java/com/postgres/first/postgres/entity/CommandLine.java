package com.postgres.first.postgres.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import com.postgres.first.postgres.repo.StudentRepo;

@Repository
public class CommandLine implements CommandLineRunner{

	@Autowired
	private StudentRepo repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Student(1, "Chaturved"));
		System.out.println(repository.findAll());
	}

}
