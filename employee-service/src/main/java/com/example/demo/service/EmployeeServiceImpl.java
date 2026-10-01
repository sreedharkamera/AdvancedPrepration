package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.client.DepartmentClient;
import com.example.demo.dto.DepartmentResponse;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeRepository employeeRepository;
	DepartmentClient departmentClient;
	
	public EmployeeServiceImpl(	EmployeeRepository employeeRepository,DepartmentClient departmentClient)
	{
		this.employeeRepository = employeeRepository;
		this.departmentClient = departmentClient;
	}
	
	public Employee saveEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public Employee getEmployeeById(Long id)
	{
		return employeeRepository.findById(id).orElseThrow(() 
				 -> new RuntimeException ("Employee not found" +id));
	}
	
     public List<Employee> getAllEmployees()
     {
    	 return employeeRepository.findAll();
     }
     
     public DepartmentResponse getEmployeeDepartment(Long employeeId)
     {
    	
    	 Employee employee = getEmployeeById(employeeId);
    	 Long departmentId = employee.getDepartmentId();
    	 System.out.println("Inside emp service impl departmentId:->"+departmentId);
    	 return departmentClient.getDepartmentById(departmentId);
     }
}
