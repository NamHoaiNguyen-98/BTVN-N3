package com.example.btvnn3.repository;

import com.example.btvnn3.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectRepository extends JpaRepository<Subject,Long> {
}
