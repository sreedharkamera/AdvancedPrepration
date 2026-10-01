package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.DepartmentResponse;
import com.example.demo.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	Employee getEmployeeById(Long id);
	List<Employee> getAllEmployees();
	
	DepartmentResponse getEmployeeDepartment(Long employeeId);
	
}
