package com.example.studentmanagementsystem.Service;

import com.example.studentmanagementsystem.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student>  getAllStudents();
    Student saveStudent(Student student);

    Student getById(Long id);
    Student updateStudent(Student student);

    void deleteStudent(Long id);
}
