package com.cursopw.cursospw.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Disciplinas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String datetime;
    @ManyToOne
    private Professores professor;

    public Disciplinas() {
    }

    public Disciplinas(Integer id, String nome, String datetime, Professores professor) {
        this.id = id;
        this.nome = nome;
        this.datetime = datetime;
        this.professor = professor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professores getProfessor() {
        return professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Disciplinas [id=" + id + ", nome=" + nome + ", datetime=" + datetime + ", professor=" + professor + "]";
    }

    
}