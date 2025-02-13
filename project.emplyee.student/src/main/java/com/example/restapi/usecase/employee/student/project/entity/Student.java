package com.example.restapi.usecase.employee.student.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< HEAD
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
=======
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@Column(name = "student_id")
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.IDENTITY)
=======
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
	private long studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_branch")
	private String studentBranch;
	
	@Column(name = "student_rollno")
	private long studentRollno;
<<<<<<< HEAD

//	public long getStudentId() {
//		return studentId;
//	}
//
//	public void setStudentId(long studentId) {
//		this.studentId = studentId;
//	}
//
//	public String getStudentName() {
//		return studentName;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
//	public String getStudentBranch() {
//		return studentBranch;
//	}
//
//	public void setStudentBranch(String studentBranch) {
//		this.studentBranch = studentBranch;
//	}
//
//	public long getStudentRollno() {
//		return studentRollno;
//	}
//
//	public void setStudentRollno(long studentRollno) {
//		this.studentRollno = studentRollno;
//	}
//
//	public Student(long studentId, String studentName, String studentBranch, long studentRollno) {
//		super();
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.studentBranch = studentBranch;
//		this.studentRollno = studentRollno;
//	}
//
//	public Student() {
//		super();
//	}
//	
//	
	
=======
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
}
