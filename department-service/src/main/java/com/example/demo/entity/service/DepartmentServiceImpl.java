package com.example.demo.entity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.entity.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	
	DepartmentRepository departmentRepository;
	
	public DepartmentServiceImpl(DepartmentRepository departmentRepository)
	{
		System.out.println("dd");
		this.departmentRepository = departmentRepository;
	}
	
	public Department saveDepartment(Department department)
	{
		return departmentRepository.save(department);
	}
	
	public Department getDepartmentById(Long id)
	{
		System.out.println("Inside dept service impl"+id);
		return departmentRepository.findById(id)
				.orElseThrow(() -> 
				new RuntimeException("Department not found" +id));
	}
	
	public List<Department> getAllDepartments()
	{
		return departmentRepository.findAll();
	}

	
}
