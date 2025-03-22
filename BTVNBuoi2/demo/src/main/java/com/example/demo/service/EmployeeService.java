package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployees(Employee employees);
    List<Employee> getEmployees();
    Employee updateEmployees(Employee employees);
    void deleteEmployees(Integer id);
}
