package com.employee.vendor.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "vendor")
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vendorId;
	
	private String vendor_Email;
	private String vendor_UPI;
	private String vendor_BankId;
	private String vendor_TerminalId;
	private String vendor_Host;
	
	private String vendor_Name;
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendor_Name() {
		return vendor_Name;
	}
	public void setVendor_Name(String vendor_Name) {
		this.vendor_Name = vendor_Name;
	}
	public String getVendor_Email() {
		return vendor_Email;
	}
	public void setVendor_Email(String vendor_Email) {
		this.vendor_Email = vendor_Email;
	}
	public String getVendor_UPI() {
		return vendor_UPI;
	}
	public void setVendor_UPI(String vendor_UPI) {
		this.vendor_UPI = vendor_UPI;
	}
	public String getVendor_BankId() {
		return vendor_BankId;
	}
	public void setVendor_BankId(String vendor_BankId) {
		this.vendor_BankId = vendor_BankId;
	}
	public String getVendor_TerminalId() {
		return vendor_TerminalId;
	}
	public void setVendor_TerminalId(String vendor_TerminalId) {
		this.vendor_TerminalId = vendor_TerminalId;
	}
	public String getVendor_Host() {
		return vendor_Host;
	}
	public void setVendor_Host(String vendor_Host) {
		this.vendor_Host = vendor_Host;
	}
	
	
}
