package com.candidatos.crm.candidatoscrmapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Inscritos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String vaga;

    @Column(nullable = false)
    private String data_nascimento;
    
}
