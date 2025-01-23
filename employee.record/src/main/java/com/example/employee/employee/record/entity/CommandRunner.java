package com.example.employee.employee.record.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import com.example.employee.employee.record.repo.EmployeeSpringDataJpa;
import com.example.employee.employee.record.repo.EmployeeAttendenceSpringDataJpa;

import java.time.LocalDateTime;

@Repository
public class CommandRunner implements CommandLineRunner {

    @Autowired
    private EmployeeSpringDataJpa employeeSpringDataJpa;

    @Autowired
    private EmployeeAttendenceSpringDataJpa attendanceRepository;

    @Override
    public void run(String... args) throws Exception {
        // Add Employee Details
    	
    	Employee_Details employee1 = new Employee_Details(1l,"Chatur", "Product Intern");
        Employee_Details employee2 = new Employee_Details(2l,"Raghuram", "QA");
        Employee_Details employee3 = new Employee_Details(3l,"Yatin", "BA");

        employeeSpringDataJpa.save(employee1);
        employeeSpringDataJpa.save(employee2);
        employeeSpringDataJpa.save(employee3);
        
        // Add Attendance for Employees
        
        Employee_Attendence attendence1 = new Employee_Attendence(employee1, LocalDateTime.of(2025, 1, 23, 9, 0), LocalDateTime.of(2025, 1, 23, 17, 0));
        Employee_Attendence attendence2 = new Employee_Attendence(employee2, LocalDateTime.of(2025, 1, 23, 10, 0), LocalDateTime.of(2025, 1, 23, 18, 0));
        Employee_Attendence attendence3 = new Employee_Attendence(employee3, LocalDateTime.of(2025, 1, 23, 11, 0), LocalDateTime.of(2025, 1, 23, 19, 0));
        
        attendanceRepository.save(attendence1);
        attendanceRepository.save(attendence2);
        attendanceRepository.save(attendence3);

        System.out.println(employeeSpringDataJpa.findAll());
        System.out.println(attendanceRepository.findAll());
        
    }
}
