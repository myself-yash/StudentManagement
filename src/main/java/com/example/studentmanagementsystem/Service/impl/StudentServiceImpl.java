package com.example.studentmanagementsystem.Service.impl;

import com.example.studentmanagementsystem.Entity.Student;
import com.example.studentmanagementsystem.Repository.StudentRepo;
import com.example.studentmanagementsystem.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getById(Long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }


}
