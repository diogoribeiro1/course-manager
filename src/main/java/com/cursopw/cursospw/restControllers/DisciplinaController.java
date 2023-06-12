package com.cursopw.cursospw.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursopw.cursospw.entities.Disciplinas;
import com.cursopw.cursospw.services.DisciplinaService;

@RestController
@RequestMapping("api/disciplina")
public class DisciplinaController {
    
    @Autowired
    private DisciplinaService disciplinaService;

    @PostMapping
    public ResponseEntity<Object> cadastrarDisciplina(@RequestBody Disciplinas disciplinas){
        var response = disciplinaService.cadastrarDisciplina(disciplinas);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}