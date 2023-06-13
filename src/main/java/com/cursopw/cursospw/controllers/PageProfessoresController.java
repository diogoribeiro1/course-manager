package com.cursopw.cursospw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.cursopw.cursospw.repositories.ProfessorRepository;

@Controller
public class PageProfessoresController {
    
    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/professorPage")
    public String listarProfessor(ModelMap modelMap){
        var listaProf = professorRepository.findAll();
        modelMap.addAttribute("listaProf", listaProf);
        return "professores";
    }
}
