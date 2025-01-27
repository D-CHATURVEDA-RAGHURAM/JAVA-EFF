package com.example.restapi.usecase.employee.student.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private long student_id;
	
	private String student_name;
	
	private String student_branch;
	
	private long student_rollno;

	public Student() {
		super();
	}

	public Student(long student_id, String student_name, String student_branch, long student_rollno) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_branch = student_branch;
		this.student_rollno = student_rollno;
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_branch() {
		return student_branch;
	}

	public void setStudent_branch(String student_branch) {
		this.student_branch = student_branch;
	}

	public long getStudent_rollno() {
		return student_rollno;
	}

	public void setStudent_rollno(long student_rollno) {
		this.student_rollno = student_rollno;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_branch="
				+ student_branch + ", student_rollno=" + student_rollno + "]";
	}
	
	
	
}
