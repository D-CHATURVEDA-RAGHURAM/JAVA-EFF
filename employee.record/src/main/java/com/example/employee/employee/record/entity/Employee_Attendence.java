package com.example.employee.employee.record.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee_Attendence {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "employee_id",nullable = false)
    private Employee_Details employee;

    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    
    
    
	public Employee_Attendence() {
		super();
	}
	
	
	public Employee_Attendence(Employee_Details employee, LocalDateTime checkIn, LocalDateTime checkOut) {
		super();
		this.employee = employee;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Employee_Details getEmployee() {
		return employee;
	}
	public void setEmployee(Employee_Details employee) {
		this.employee = employee;
	}
	public LocalDateTime getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(LocalDateTime checkIn) {
		this.checkIn = checkIn;
	}
	public LocalDateTime getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(LocalDateTime checkOut) {
		this.checkOut = checkOut;
	}

    

	
}
