package com.example.btvnn3.service.impl;

import com.example.btvnn3.model.Subject;
import com.example.btvnn3.service.ISubjectService;

import java.util.Optional;

public class SubjectService implements ISubjectService {
    @Override
    public Iterable<Subject> findAll() {
        return null;
    }

    @Override
    public Optional<Subject> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(Subject subject) {

    }

    @Override
    public Subject update(Subject subject) {

        return subject;
    }

    @Override
    public void delete(Long id) {

    }
}
