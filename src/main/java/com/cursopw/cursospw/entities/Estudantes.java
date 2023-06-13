package com.cursopw.cursospw.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Estudantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricula;
    private String nomeCompleto;
    private String email;
    private Integer anoEgresso;
    // Max 10
    @ManyToMany
    private List<Disciplinas> disciplinas;

    public Estudantes() {
    }

    public Estudantes(String nomeCompleto, String email, Integer anoEgresso) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.anoEgresso = anoEgresso;
    }

    public Estudantes(Integer matricula, String nomeCompleto, String email, Integer anoEgresso,
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

    public Integer getAnoEgresso() {
        return anoEgresso;
    }

    public void setAnoEgresso(Integer anoEgresso) {
        this.anoEgresso = anoEgresso;
    }

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
