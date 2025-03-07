package com.example.Employee_Payroll_App.service;

import com.example.Employee_Payroll_App.dto.EmployeePayrollDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Employee_Payroll_App.repository.EmployeePayrollRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository employeePayrollRepository;

    public void testDatabaseConnection() {
        EmployeePayrollDTO employee = new EmployeePayrollDTO();
        employee.setName("Test Employee");
        employee.setSalary(50000);
        employeePayrollRepository.save(employee);

        System.out.println("Employee saved successfully!");
    }
}