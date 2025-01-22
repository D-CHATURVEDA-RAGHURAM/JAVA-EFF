package com.springboot.jpa.learn_spring_boot_jpa.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private long id;
	
//	@Column(name="name")      ---> in the table, the column same is same as the string variable name, so @Column is not mandatory.
	private String name;
	
//	@Column(name="author")
	private String author;
	
	public Course()
	{
		
	}


	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}


	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
	
	
	public void setId(long id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
