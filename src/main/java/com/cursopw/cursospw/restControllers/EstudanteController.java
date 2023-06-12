package com.cursopw.cursospw.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursopw.cursospw.entities.Estudantes;
import com.cursopw.cursospw.repositories.EstudanteRepository;

@RestController
@RequestMapping("api/estudante")
public class EstudanteController {
    
    @Autowired
    private EstudanteRepository estudanteRepository;

    @PostMapping
    public ResponseEntity<Object> cadastrarEstudante(@RequestBody Estudantes estudantes){
        var response = estudanteRepository.save(estudantes);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
