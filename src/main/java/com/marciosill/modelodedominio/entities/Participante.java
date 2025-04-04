package com.marciosill.modelodedominio.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_participantes")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(unique = true) //para se um email unico
    private String email;

    @ManyToMany(mappedBy = "participantes")
    private Set<Atividade> atividades= new HashSet<>();

    public Participante() {
    }

    public Participante(Integer id, String name, String email, Set<Atividade> atividades) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.atividades = atividades;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
