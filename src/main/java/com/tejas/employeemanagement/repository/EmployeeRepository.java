package com.tejas.employeemanagement.repository;

import com.tejas.employeemanagement.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
