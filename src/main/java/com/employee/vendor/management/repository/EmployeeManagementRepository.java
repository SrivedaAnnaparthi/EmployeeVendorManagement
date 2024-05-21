package com.employee.vendor.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.vendor.management.entity.Employee;



public interface EmployeeManagementRepository extends JpaRepository<Employee, Integer>{

}
