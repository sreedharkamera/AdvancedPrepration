package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DepartmentResponse;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private final EmployeeService employeeService;
	
	public EmployeeController(	EmployeeService employeeService) {
	      this.employeeService = employeeService;
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
	         return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeebyId(@PathVariable Long id)
	{
		return employeeService.getEmployeeById(id);
	}
	@GetMapping
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	@GetMapping("/{id}/department")
	public DepartmentResponse getDepartment(@PathVariable Long id)
	{
		
		return employeeService.getEmployeeDepartment(id);
	}
}
