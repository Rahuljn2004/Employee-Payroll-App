package com.example.Employee_Payroll_App.repository;

import com.example.Employee_Payroll_App.dto.EmployeePayrollDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollDTO, Long> {
}
