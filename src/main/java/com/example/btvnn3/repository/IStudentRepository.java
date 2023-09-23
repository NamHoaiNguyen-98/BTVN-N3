package com.example.btvnn3.repository;

import com.example.btvnn3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student,Long> {
}
