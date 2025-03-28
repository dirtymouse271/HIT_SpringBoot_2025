package com.example.demo.service;

import com.example.demo.model.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student createStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
