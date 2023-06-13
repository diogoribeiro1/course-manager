package com.cursopw.cursospw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.cursopw.cursospw.repositories.EstudanteRepository;

@Controller
public class PageEstudanteController {
    
    @Autowired
    private EstudanteRepository estudanteRepository;

    @GetMapping("/estudantesPage")
    public String listarEstudante (ModelMap modelMap){
        var lista = estudanteRepository.findAll();
        modelMap.addAttribute("listaEstudante", lista);
        return "estudantes";
    }
}
