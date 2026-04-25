package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public List<Employee> findByFirstname(String fname);
	
	public List<Employee> findByLastname(String lname);
	
	public List<Employee> findByDesignation(String designation);
	
	public List<Employee> findByDepartment(String department);

}
