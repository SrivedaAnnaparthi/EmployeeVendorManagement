package com.employee.vendor.management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.vendor.management.entity.Employee;
import com.employee.vendor.management.service.EmployeeManagementService;

@RestController
@RequestMapping("/employeeVendorManagement")
public class EmployeeManagementController {

	@Autowired(required = true)
	private EmployeeManagementService employeeManagementService;

	@GetMapping("/hello")
	public static String sample() {
		return "Hello world";
	}

	@PostMapping("/createEmployee")
	public void createEmployee(@RequestBody Employee employee) {
		employeeManagementService.createEmployee(employee);
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeManagementService.getAllEmployees();
		return employees;
	}

	@GetMapping("/getEmployeeById/{employeeId}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer employeeId) {
		Optional<Employee> returnedRequest = employeeManagementService.getEmployeeById(employeeId);
		return returnedRequest;
	}
}
