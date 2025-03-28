package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/select")
    public String getAllStudent(Model model){
        List<Student> list = studentService.getAllStudent();
        model.addAttribute("student", list);
        return "student";
    }

    @PostMapping("/create")
    public String createStudent(@ModelAttribute Student student){
        studentService.createStudent(student);
        return "redirect:/student";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student){
        studentService.updateStudent(student);
        return "redirect:/student";
    }

    @PostMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/student";
    }

}
