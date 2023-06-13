package com.cursopw.cursospw.controllers;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cursopw.cursospw.entities.Disciplinas;
import com.cursopw.cursospw.entities.Estudantes;
import com.cursopw.cursospw.entities.Professores;
import com.cursopw.cursospw.repositories.DisciplinaRepository;
import com.cursopw.cursospw.repositories.EstudanteRepository;
import com.cursopw.cursospw.repositories.ProfessorRepository;

import jakarta.transaction.Transactional;

@Controller
public class IndexController {

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private EstudanteRepository estudanteRepository;

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @GetMapping("/")
    public String home(ModelMap model) {
        var listaProf = professorRepository.findAll();
        var listaEstudantes = estudanteRepository.findAll();
        var listaDisciplinas = disciplinaRepository.findAll();

        model.addAttribute("professores", listaProf);
        model.addAttribute("listaDisciplinas", listaDisciplinas);
        model.addAttribute("listaEstudantes", listaEstudantes);
        model.addAttribute("prof", new Professores());
        model.addAttribute("estudante", new Estudantes());
        model.addAttribute("disciplina", new Disciplinas());
        return "index";
    }

    @PostMapping("/matricula")
    @Transactional
    public String matriculaEstudante(@RequestParam Integer disciplina, @RequestParam Integer estudante, Model model) {
        var estudanteMatriculado = estudanteRepository.findById(estudante).get();
        var disciplinaMatriculada = disciplinaRepository.findById(disciplina).get();

        Optional<Disciplinas> disciplinaEncontrada = estudanteMatriculado.getDisciplinas()
                .stream()
                .filter(e -> e.getId() == disciplina)
                .findFirst();

        if (disciplinaEncontrada.isPresent()) {
            model.addAttribute("alertMessage", "Aluno já matriculado na disciplina");
            return "redirect:/";
        }

        estudanteMatriculado.getDisciplinas().add(disciplinaMatriculada);
        return "redirect:/";
    }

    @PostMapping("/professores")
    public String cadastrarProfessor(Professores prof) {
        professorRepository.save(prof);
        return "redirect:/";
    }

    @PostMapping("/estudantes")
    public String cadastrarEstudante(Estudantes estudante) {
        estudanteRepository.save(estudante);
        return "redirect:/";
    }

    @PostMapping("/disciplinas")
    public String cadastrarDisciplina(Disciplinas disciplina, @RequestParam String diaSemana,
            @RequestParam String horario) {
        disciplina.setDatetime(diaSemana + " - " + horario);
        disciplinaRepository.save(disciplina);
        return "redirect:/";
    }
}
