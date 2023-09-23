package com.example.btvnn3.service;

import java.util.Optional;

public interface IGenerateService<E>{
    Iterable<E> findAll();
    Optional<E> findOne(Long id);

    void create(E e);

    void update(E e);

    void delete(Long id);
}
