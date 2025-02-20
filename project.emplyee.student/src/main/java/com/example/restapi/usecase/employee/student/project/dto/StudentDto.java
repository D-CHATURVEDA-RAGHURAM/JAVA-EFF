package com.example.restapi.usecase.employee.student.project.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

	@Id
	private long studentIdDto;
	
	private String studentNameDto;
	
	private String studentBranchDto;
	
	private long studentRollnoDto;

//	public long getStudentIdDto() {
//		return studentIdDto;
//	}
//
//	public void setStudentIdDto(long studentIdDto) {
//		this.studentIdDto = studentIdDto;
//	}
//
//	public String getStudentNameDto() {
//		return studentNameDto;
//	}
//
//	public void setStudentNameDto(String studentNameDto) {
//		this.studentNameDto = studentNameDto;
//	}
//
//	public String getStudentBranchDto() {
//		return studentBranchDto;
//	}
//
//	public void setStudentBranchDto(String studentBranchDto) {
//		this.studentBranchDto = studentBranchDto;
//	}
//
//	public long getStudentRollnoDto() {
//		return studentRollnoDto;
//	}
//
//	public void setStudentRollnoDto(long studentRollnoDto) {
//		this.studentRollnoDto = studentRollnoDto;
//	}
//
//	public StudentDto(long studentIdDto, String studentNameDto, String studentBranchDto, long studentRollnoDto) {
//		super();
//		this.studentIdDto = studentIdDto;
//		this.studentNameDto = studentNameDto;
//		this.studentBranchDto = studentBranchDto;
//		this.studentRollnoDto = studentRollnoDto;
//	}
//
//	public StudentDto() {
//		super();
//	}
//	
//	
}
