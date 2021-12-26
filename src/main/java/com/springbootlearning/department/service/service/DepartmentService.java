/**
 * 
 */
package com.springbootlearning.department.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootlearning.department.service.entity.Department;
import com.springbootlearning.department.service.repository.DepartmentRepository;

/**
 * Service class for Department
 * 
 * @author Sarat
 *
 */
@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
public Department saveDepartment(Department department) {
	return departmentRepository.save(department);
}

public Department getDepartmentByDepartmentId(Long id) {
	return departmentRepository.findById(id).get();
}
}
