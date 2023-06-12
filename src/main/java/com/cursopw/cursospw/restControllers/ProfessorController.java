package com.cursopw.cursospw.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursopw.cursospw.entities.Professores;
import com.cursopw.cursospw.repositories.ProfessorRepository;

@RestController
@RequestMapping("api/professor")
public class ProfessorController {
    
    @Autowired
    private ProfessorRepository professorRepository;

    @PostMapping 
    public ResponseEntity<Object> cadastrarProfessor(@RequestBody Professores professor){
        // var model = new Professores(null, null, null)
        var response = professorRepository.save(professor);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
