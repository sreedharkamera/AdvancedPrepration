package com.example.demo.entity.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {
      Department saveDepartment(Department department);
      Department getDepartmentById(Long Id);
      List<Department> getAllDepartments();
}
