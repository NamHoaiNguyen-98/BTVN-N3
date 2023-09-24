package com.example.btvnn3.service.impl;

import com.example.btvnn3.model.Subject;
import com.example.btvnn3.repository.ISubjectRepository;
import com.example.btvnn3.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SubjectService implements ISubjectService {

    @Autowired
    private ISubjectRepository subjectRepository;
    @Override
    public Iterable<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Optional<Subject> findOne(Long id) {
        return subjectRepository.findById(id);
    }

    @Override
    public void create(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public Subject update(Subject subject) {

        return subjectRepository.save(subject);
    }

    @Override
    public void delete(Long id) {
        subjectRepository.deleteById(id);
    }


}
