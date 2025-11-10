package com.example.biblioteca.repository;

import com.example.biblioteca.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    @Override
    List<Libro> findAll();

    @Override
    Optional<Libro> findById(Long aLong);
}
