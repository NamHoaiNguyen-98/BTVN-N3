package com.example.btvnn3.service.impl;

import com.example.btvnn3.model.Student;
import com.example.btvnn3.repository.IStudentRepository;
import com.example.btvnn3.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findOne(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void create(Student student) {
        studentRepository.save(student);

    }

    @Override
    public Student update(Student student) {
        studentRepository.save(student);

        return student;
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
