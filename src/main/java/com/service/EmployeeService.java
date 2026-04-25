package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository erepo;
	
	public String add(Employee e) {
		erepo.save(e);
		return "record added successfully";
	}
	
	public List<Employee> findall(){
		return erepo.findAll();
	}
	
	public String deletebyid(int id) {
		Employee e =erepo.findById(id).orElse(null);
		if(e!=null)
		{
			erepo.deleteById(id);
			return "record deleted successfully";
		}else {
			return "No record found for updation";
		}
	}
	
	//update
	
	public String updatebyid(int id,Employee newemployee) {
		Employee oldemployee = erepo.findById(id).orElse(null);
		if(oldemployee==null) {
			return "No record found for updation";
		}
		if(newemployee.getFirstname()==null && newemployee.getLastname()==null && newemployee.getEmail()==null && newemployee.getDepartment()==null && newemployee.getContactno()==0 && newemployee.getGender()==null & newemployee.getDesignation()==null && newemployee.getDob()==null && newemployee.getJoindate()==null && newemployee.getReportingauthority()==null && newemployee.getExp()==0 && newemployee.getAdharcardno()==0 && newemployee.getPanno()==null && newemployee.getImg()==null && newemployee.getSalary()==0.0) {
			return "Np record provided for updation";
		}
		
		if(newemployee.getFirstname()!=null) {
			oldemployee.setFirstname(newemployee.getFirstname());
		}
		if(newemployee.getLastname()!=null) {
			oldemployee.setLastname(newemployee.getLastname());
		}
		if(newemployee.getEmail()!=null) {
			oldemployee.setEmail(newemployee.getEmail());
		}
		if(newemployee.getDepartment()!=null) {
			oldemployee.setDepartment(newemployee.getDepartment());
		}
		if(newemployee.getContactno()!=0) {
			oldemployee.setContactno(newemployee.getContactno());
		}
		if(newemployee.getGender()!=null) {
			oldemployee.setGender(newemployee.getGender());
		}
		if(newemployee.getDesignation()!=null) {
			oldemployee.setDesignation(newemployee.getDesignation());
		}
		if(newemployee.getDob()!=null) {
			oldemployee.setDob(newemployee.getDob());
		}
		if(newemployee.getJoindate()!=null) {
			oldemployee.setJoindate(newemployee.getJoindate());
		}
		if(newemployee.getReportingauthority()!=null) {
			oldemployee.setReportingauthority(newemployee.getReportingauthority());
		}
		if(newemployee.getExp()!=0) {
			oldemployee.setExp(newemployee.getExp());
		}
		if(newemployee.getAdharcardno()!=0) {
			oldemployee.setAdharcardno(newemployee.getAdharcardno());
		}
		if(newemployee.getPanno()!=null) {
			oldemployee.setPanno(newemployee.getPanno());
		}
		if(newemployee.getImg()!=null) {
			oldemployee.setImg(newemployee.getImg());
		}
		if(newemployee.getSalary()!=0) {
			oldemployee.setSalary(newemployee.getSalary());
		}
		
		erepo.save(oldemployee);
		return "Record updated successfully";
	}
	
	public Employee findbyid(int empid) {
		return erepo.findById(empid).orElse(null);
	}
	
	public List<Employee> findByFirstname(String fname){
		return erepo.findByFirstname(fname);
	}
	
	public List<Employee> findByLastname(String lname){
		return erepo.findByLastname(lname);
	}
	
	public List<Employee> findByDesignation(String designation){
		return erepo.findByDesignation(designation);
	}
	
	public List<Employee> findByDepartment(String department){
		return erepo.findByDepartment(department);
	}
}
