package com.cursopw.cursospw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursopw.cursospw.entities.Estudantes;

public interface EstudanteRepository extends JpaRepository<Estudantes, Integer> {
    
}
