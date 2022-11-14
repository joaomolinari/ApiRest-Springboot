package com.candidatos.crm.candidatoscrmapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.candidatos.crm.candidatoscrmapi.model.Inscritos;

@Repository
public interface CandidatosRepository extends JpaRepository <Inscritos, Long> {
    
}
