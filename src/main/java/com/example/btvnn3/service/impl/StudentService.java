package com.example.btvnn3.service.impl;

import com.example.btvnn3.model.Student;
import com.example.btvnn3.service.IStudentService;

import java.util.Optional;

public class StudentService implements IStudentService {
    @Override
    public Iterable<Student> findAll() {
        return null;
    }

    @Override
    public Optional<Student> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(Long id) {

    }
}
