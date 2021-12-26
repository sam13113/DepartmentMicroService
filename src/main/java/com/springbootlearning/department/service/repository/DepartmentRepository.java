/**
 * 
 */
package com.springbootlearning.department.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootlearning.department.service.entity.Department;

/**
 * Repository interface of Department
 * 
 * @author Sarat
 *
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
