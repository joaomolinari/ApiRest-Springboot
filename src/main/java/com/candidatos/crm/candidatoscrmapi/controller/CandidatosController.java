package com.candidatos.crm.candidatoscrmapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.candidatos.crm.candidatoscrmapi.model.Inscritos;
import com.candidatos.crm.candidatoscrmapi.repository.CandidatosRepository;

@RestController
@RequestMapping("/candidatos")
public class CandidatosController {
    
    @Autowired
    private CandidatosRepository candidatosRepository;

    @GetMapping
    public List <Inscritos> listar(){
        return candidatosRepository.findAll();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Inscritos adicionar(@RequestBody Inscritos inscritos){
        return candidatosRepository.save(inscritos);
    }
    
}
