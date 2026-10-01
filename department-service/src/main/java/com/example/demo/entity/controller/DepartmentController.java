package com.example.demo.entity.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.entity.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	DepartmentService departmentService;
	
	public DepartmentController(DepartmentService departmentService)
	{
		this.departmentService = departmentService;
	}

	@PostMapping
	public Department saveDepartment(@RequestBody Department department)
	{
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable Long id)
	{
		System.out.println("Inside dept controller"+id);
		return departmentService.getDepartmentById(id);
	}
	@GetMapping
	public List<Department> findAllDepartments()
	{
		return departmentService.getAllDepartments();
	}
}
