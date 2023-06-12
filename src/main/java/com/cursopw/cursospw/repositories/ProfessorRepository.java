package com.cursopw.cursospw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursopw.cursospw.entities.Professores;

public interface ProfessorRepository extends JpaRepository<Professores, Integer> {
    
}
