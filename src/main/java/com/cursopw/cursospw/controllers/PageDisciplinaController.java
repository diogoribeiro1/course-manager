package com.cursopw.cursospw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.cursopw.cursospw.repositories.DisciplinaRepository;

@Controller
public class PageDisciplinaController {
    
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @GetMapping("/disciplinaPage")
    public String listaDisciplina(ModelMap modelMap){
        var lista = disciplinaRepository.findAll();
        modelMap.addAttribute("listaDisciplina", lista);
        return "disciplinas";
    }
}
