package com.example.btvnn3.service.impl;

import com.example.btvnn3.model.Status;
import com.example.btvnn3.service.IStatusService;

import java.util.Optional;

public class StatusService implements IStatusService {
    @Override
    public Iterable<Status> findAll() {
        return null;
    }

    @Override
    public Optional<Status> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(Status status) {

    }

    @Override
    public void update(Status status) {

    }

    @Override
    public void delete(Long id) {

    }
}
