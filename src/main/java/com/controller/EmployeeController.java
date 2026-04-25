package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.EmployeeService;


@RestController
@RequestMapping("/emp")
@CrossOrigin
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/add")
	public String add(@RequestBody Employee e) {
		return service.add(e);
	}

	@GetMapping("/get")
	public List<Employee> getall() {
		return service.findall();
	}
	
	@DeleteMapping("/deletebyid")
	public String deletebyid(@RequestParam int empid) {
		return service.deletebyid(empid);
	}
	
	@PutMapping("/updatebyid")
	public String updatebyid(@RequestBody Employee e,@RequestParam int empid) {
		return service.updatebyid(empid, e);
	}
	
	@GetMapping("/getbyid")
	public Employee getbyid(@RequestParam int empid) {
		return service.findbyid(empid);
	}
	
	@GetMapping("/getbyfname")
	public List<Employee> getbyfname(@RequestParam String fname){
		return service.findByFirstname(fname);
	}
	
	@GetMapping("/getbylname")
	public List<Employee> findbylname(@RequestParam String lname) {
		return service.findByLastname(lname);
	}
	
	@GetMapping("/getbydesignation")
	public List<Employee> findbydesignation(@RequestParam String designation) {
		return service.findByDesignation(designation);
	}
	
	@GetMapping("/getbydepartment")
	public List<Employee> findbydepartment(@RequestParam String department){
		return service.findByDepartment(department);
	}
}
