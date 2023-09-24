package com.example.btvnn3.service.impl;

import com.example.btvnn3.model.Filter;
import com.example.btvnn3.model.Student;
import com.example.btvnn3.repository.IStudentRepository;
import com.example.btvnn3.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
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

    @Override
    public Page<Student> searchByName(String name, Pageable pageable) {
        return studentRepository.searchByName(name, pageable);
    }

    @Override
    public Page<Student> searchByStatus(Long id, Pageable pageable) {
        return studentRepository.searchByStatus(id, pageable);
    }

    @Override
    public Page<Student> searchBySubject(Long id, Pageable pageable) {
        return studentRepository.searchBySubject(id, pageable);
    }

    @Override
    public Page<Student> searchByAddress(String address, Pageable pageable) {
        return studentRepository.searchByAddress(address, pageable);
    }

    @Override
    public Page<Student> searchByFilter(Filter filter, Pageable pageable) {
        String sex ;
        if(filter.getSex() == 1){
            sex = "nam" ;
        }else {
            sex = "nữ" ;
        }
        return studentRepository.searchByFilter(filter.getSubject(),filter.getStatus(),sex,filter.getName(), pageable);
    }
}
