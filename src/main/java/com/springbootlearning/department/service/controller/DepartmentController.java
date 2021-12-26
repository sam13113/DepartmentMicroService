/**
 * 
 */
package com.springbootlearning.department.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootlearning.department.service.entity.Department;
import com.springbootlearning.department.service.service.DepartmentService;

/**
 * The controller class for Department services.
 * 
 * @author Sarat
 *
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/")
	public Department getDepartmentById(@RequestParam Long id) {
		return departmentService.getDepartmentByDepartmentId(id);
	}

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}

}
