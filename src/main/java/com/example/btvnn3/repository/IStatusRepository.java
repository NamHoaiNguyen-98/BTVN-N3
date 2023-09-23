package com.example.btvnn3.repository;

import com.example.btvnn3.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStatusRepository extends JpaRepository<Status,Long> {
}
