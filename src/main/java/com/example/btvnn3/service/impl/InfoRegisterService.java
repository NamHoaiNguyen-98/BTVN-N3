package com.example.btvnn3.service.impl;

import com.example.btvnn3.model.InfoRegister;
import com.example.btvnn3.service.IInfoRegisterService;

import java.util.Optional;

public class InfoRegisterService implements IInfoRegisterService {
    @Override
    public Iterable<InfoRegister> findAll() {
        return null;
    }

    @Override
    public Optional<InfoRegister> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void create(InfoRegister infoRegister) {

    }

    @Override
    public void update(InfoRegister infoRegister) {

    }

    @Override
    public void delete(Long id) {

    }
}
