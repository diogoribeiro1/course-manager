package com.cursopw.cursospw.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Professores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricula;
    private String nomeCompleto;
    private String email;
    private LocalDate anoEgresso;
    // Max 10
    @OneToMany(mappedBy = "professor")
    private List<Disciplinas> disciplinas;

    public Professores() {
    }
    

    public Professores(String nomeCompleto, String email, LocalDate anoEgresso) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.anoEgresso = anoEgresso;
    }


    public Professores(Integer matricula, String nomeCompleto, String email, LocalDate anoEgresso,
            List<Disciplinas> disciplinas) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.anoEgresso = anoEgresso;
        this.disciplinas = disciplinas;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getAnoEgresso() {
        return anoEgresso;
    }

    public void setAnoEgresso(LocalDate anoEgresso) {
        this.anoEgresso = anoEgresso;
    }

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplinas> disciplinas) {
        if (disciplinas.size() > 10) {
            throw new IllegalArgumentException("O número máximo de disciplinas que um professor pode lecionar é 10.");
        }
        this.disciplinas = disciplinas;
    }
}
