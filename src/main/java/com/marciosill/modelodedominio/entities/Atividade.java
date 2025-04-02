package com.marciosill.modelodedominio.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_atividades")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private  String descricao;
    private  Double preco;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Atividade() {
    }
}
