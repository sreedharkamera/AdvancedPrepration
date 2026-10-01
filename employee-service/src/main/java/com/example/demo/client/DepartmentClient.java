package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.DepartmentResponse;

@FeignClient(
		name = "department-service",
		url = "http://localhost:8082"
		)


public interface DepartmentClient {
	
	
	
	@GetMapping("/departments/{id}")
	DepartmentResponse getDepartmentById(@PathVariable("id") Long id);
	
}
