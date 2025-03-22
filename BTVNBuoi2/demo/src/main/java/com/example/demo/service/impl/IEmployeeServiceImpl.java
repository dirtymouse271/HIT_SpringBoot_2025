package com.example.demo.service.impl;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeesRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IEmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeesRepository employeesRepository;

    public IEmployeeServiceImpl(EmployeesRepository employeesRepository){
        this.employeesRepository = employeesRepository;
    }

    @Override
    public Employee createEmployees(Employee employees) {
        return employeesRepository.save(employees);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeesRepository.findAll();
    }

    @Override
    public Employee updateEmployees(Employee employees) {
        if(employees.getId() == null){
            throw new IllegalArgumentException("ID not null!");
        }
        Employee employee = employeesRepository.findById(employees.getId()).orElseThrow(() -> new RuntimeException("Không tìm thấy nhân viên với ID: " + employees.getId()));

        employee.setName(employees.getName());
        employee.setEmail(employees.getEmail());
        employee.setAddress(employees.getAddress());
        employee.setPhone(employees.getPhone());
        employee.setActions(employees.getActions());

        return employeesRepository.save(employee);
    }

    @Override
    public void deleteEmployees(Integer id) {
        employeesRepository.deleteById(id);
    }
}
