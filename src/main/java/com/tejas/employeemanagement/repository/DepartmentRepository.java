package com.tejas.employeemanagement.repository;

import com.tejas.employeemanagement.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

