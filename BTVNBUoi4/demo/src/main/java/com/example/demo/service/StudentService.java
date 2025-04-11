package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student getStudentById(int id);
    Student createStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(int id);
}
