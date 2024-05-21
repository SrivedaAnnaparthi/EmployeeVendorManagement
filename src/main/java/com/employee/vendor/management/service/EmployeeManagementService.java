package com.employee.vendor.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.vendor.management.entity.Employee;
import com.employee.vendor.management.repository.EmployeeManagementRepository;

@Service
public class EmployeeManagementService {

	@Autowired
	private EmployeeManagementRepository employeeManagementRepository;

	public void createEmployee(Employee employee) {
		employeeManagementRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeManagementRepository.findAll();
		return employees;
	}

	public Optional<Employee> getEmployeeById(int employeeId) {
		Optional<Employee> employeeById = employeeManagementRepository.findById(employeeId);
		return employeeById;
	}
}
