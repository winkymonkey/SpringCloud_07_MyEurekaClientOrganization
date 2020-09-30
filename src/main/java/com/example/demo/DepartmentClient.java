package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "department-service")
public interface DepartmentClient {
	
	@GetMapping("/initDepartment/{id}")
	public String pingDepartmentService(@PathVariable("id") int id);
}
