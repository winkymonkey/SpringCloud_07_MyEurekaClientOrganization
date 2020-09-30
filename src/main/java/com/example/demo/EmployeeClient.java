package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "employee-service")
public interface EmployeeClient {
	
	@GetMapping("/initEmployee/{id}")
	public String pingEmployeeService(@PathVariable("id") int id);
}
