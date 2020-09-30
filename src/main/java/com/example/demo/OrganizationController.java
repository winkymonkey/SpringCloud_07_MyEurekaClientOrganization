package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizationController {

	@RequestMapping("/initOrganization/{id}")
	public String greeting(@PathVariable int id) {
		return "I am OrganizationController" + "---id=" + id;
	}

	
	@Autowired
	EmployeeClient employeeClient;
	
	@Autowired
	DepartmentClient departmentClient;
	
	@RequestMapping("/pingEmployeeService/{id}")
	public String pingEmployeeService(@PathVariable("id") int id) {
		return employeeClient.pingEmployeeService(id);
	}
	
	@RequestMapping("/pingDepartmentService/{id}")
	public String pingDepartmentService(@PathVariable("id") int id) {
		return departmentClient.pingDepartmentService(id);
	}
}
