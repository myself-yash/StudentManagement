package com.example.studentmanagementsystem.Repository;

import com.example.studentmanagementsystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {



}
