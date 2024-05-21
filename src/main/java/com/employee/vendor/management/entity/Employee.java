package com.employee.vendor.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	
	private String employee_emailId;
	private String employee_designation;
	private String employee_reportingManager;
	private String employee_yearsOfExperience;
	private String employee_ctc;	
	private String employee_name;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_emailId() {
		return employee_emailId;
	}
	public void setEmployee_emailId(String employee_emailId) {
		this.employee_emailId = employee_emailId;
	}
	public String getEmployee_designation() {
		return employee_designation;
	}
	public void setEmployee_designation(String employee_designation) {
		this.employee_designation = employee_designation;
	}
	public String getEmployee_reportingManager() {
		return employee_reportingManager;
	}
	public void setEmployee_reportingManager(String employee_reportingManager) {
		this.employee_reportingManager = employee_reportingManager;
	}
	public String getEmployee_yearsOfExperience() {
		return employee_yearsOfExperience;
	}
	public void setEmployee_yearsOfExperience(String employee_yearsOfExperience) {
		this.employee_yearsOfExperience = employee_yearsOfExperience;
	}
	public String getEmployee_ctc() {
		return employee_ctc;
	}
	public void setEmployee_ctc(String employee_ctc) {
		this.employee_ctc = employee_ctc;
	}
	
	
	
	
	
	
	
	
	
}

