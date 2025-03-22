package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;



import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private EmployeeService employeesService;

    @GetMapping("/select")
    public String getEmloyee(Model model){
        List<Employee> list = employeesService.getEmployees();
        model.addAttribute("employees", list);
        return "employees";
    }

    @PostMapping("/insert")
    public String insertEmployee(@ModelAttribute Employee employee){
        employeesService.createEmployees(employee);
        return "redirect:/employees";
    }

    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute Employee employee){
        employeesService.updateEmployees(employee);
        return "redirect:/employees";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        employeesService.deleteEmployees(id);
        return "redirect:/employees";
    }
}
