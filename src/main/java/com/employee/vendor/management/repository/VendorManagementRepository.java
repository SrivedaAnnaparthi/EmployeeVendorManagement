package com.employee.vendor.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.vendor.management.entity.Vendor;

public interface VendorManagementRepository extends JpaRepository<Vendor, Integer>{

}
