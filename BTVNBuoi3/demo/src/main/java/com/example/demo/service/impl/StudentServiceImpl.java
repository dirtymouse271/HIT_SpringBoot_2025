package com.example.demo.service.impl;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        if(student.getId() == null){
            throw new IllegalArgumentException("ID not null!");
        }
        Student students = studentRepository.findById(student.getId()).orElseThrow(() -> new RuntimeException("Không tìm thấy sinh viên với ID: " + student.getId()));

        students.setName(student.getName());
        students.setEmail(student.getEmail());
        students.setPhone(student.getPhone());
        students.setAddress(student.getAddress());

        return studentRepository.save(students);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
