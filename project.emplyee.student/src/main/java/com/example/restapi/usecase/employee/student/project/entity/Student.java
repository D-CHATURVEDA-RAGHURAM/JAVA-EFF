package com.example.restapi.usecase.employee.student.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_branch")
	private String studentBranch;
	
	@Column(name = "student_rollno")
	private long studentRollno;

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	public long getStudentRollno() {
		return studentRollno;
	}

	public void setStudentRollno(long studentRollno) {
		this.studentRollno = studentRollno;
	}

	public Student(long studentId, String studentName, String studentBranch, long studentRollno) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.studentRollno = studentRollno;
	}

	public Student() {
		super();
	}
	
	
}
