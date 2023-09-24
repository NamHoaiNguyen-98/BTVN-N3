package com.example.btvnn3.service;

import com.example.btvnn3.model.Student;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface IGenerateService<E>{
    Iterable<E> findAll();
    Optional<E> findOne(Long id);

    void create(E e);

    E update(E e);

    void delete(Long id);


}
