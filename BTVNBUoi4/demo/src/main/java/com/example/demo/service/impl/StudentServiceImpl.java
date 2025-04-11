package com.example.demo.service.impl;

import com.example.demo.model.Student;
import com.example.demo.repsitoty.StudentRepository;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.getReferenceById(id);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        if(student.getId() == null){
            throw new IllegalArgumentException("Id not null");
        }
        Student students = studentRepository.findById(student.getId()).orElseThrow(()-> new RuntimeException("khong tim thay student co id"+student.getId()));
        students.setName(student.getName());
        students.setBirthday(student.getBirthday());
        students.setGender(student.getGender());
        students.setEmail(student.getEmail());
        students.setPhone(student.getPhone());
        students.setClasss(student.getClasss());
        return studentRepository.save(students);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
