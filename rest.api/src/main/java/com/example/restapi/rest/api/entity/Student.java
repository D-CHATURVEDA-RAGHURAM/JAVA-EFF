package com.example.restapi.rest.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private long id;
	
	private String name;

	private String branch;
	
	private int age;
	
	public Student() {
		super();
	}

	public Student(long id, String name, String branch, int age) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", age=" + age + "]";
	}
	
	
	
}
