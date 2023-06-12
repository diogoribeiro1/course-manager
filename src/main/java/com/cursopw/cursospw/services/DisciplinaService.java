package com.cursopw.cursospw.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursopw.cursospw.entities.Disciplinas;
import com.cursopw.cursospw.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {
    
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public Disciplinas cadastrarDisciplina(Disciplinas disciplina){
        return disciplinaRepository.save(disciplina);
    }

}
