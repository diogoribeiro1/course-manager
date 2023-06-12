package com.cursopw.cursospw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cursopw.cursospw.repositories.ProfessorRepository;

@Controller
public class IndexController {

    @Autowired
    private ProfessorRepository professorRepository;
    
    @GetMapping("/")
    public String home(ModelMap model) {
        var listaProf = professorRepository.findAll();
        model.addAttribute("professores", listaProf);
        return "index";
    }

    @PostMapping("/professores")
    public String cadastrarProfessor(ModelMap model) {
        return "index";
    }

    @PostMapping("/estudantes")
    public String cadastrarEstudante(ModelMap model) {
        return "index";
    }

    @PostMapping("/disciplina")
    public String cadastrarDisciplina(ModelMap model) {
        return "index";
    }
}
