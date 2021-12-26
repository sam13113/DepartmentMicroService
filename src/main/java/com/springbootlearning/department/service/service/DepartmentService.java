/**
 * 
 */
package com.springbootlearning.department.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootlearning.department.service.entity.Department;
import com.springbootlearning.department.service.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * Service class for Department
 * 
 * @author Sarat
 *
 */
@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
public Department saveDepartment(Department department) {
	log.info("Inside save method of service class");
	return departmentRepository.save(department);
}

public Department getDepartmentByDepartmentId(Long id) {
	log.info("Inside getDepartmentById method of service class");
	return departmentRepository.findById(id).get();
}
}
