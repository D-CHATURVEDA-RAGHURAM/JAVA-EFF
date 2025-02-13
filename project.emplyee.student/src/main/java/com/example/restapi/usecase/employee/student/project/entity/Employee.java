<<<<<<< HEAD
package com.example.restapi.usecase.employee.student.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "employee_desig")
	private String employeeDesig;
	
	
}
=======
	package com.example.restapi.usecase.employee.student.project.entity;
	
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	@Table(name = "Employee")
	public class Employee {
	
		@Id
		@Column(name = "employee_id")
		private long employeeId;
		
		@Column(name = "employee_name")
		private String employeeName;
		
		@Column(name = "employee_desig")
		private String employeeDesig;	
	
	}
>>>>>>> f2c74ba4b5f2d570e666875c8d33be62127bcd2e
