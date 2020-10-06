package com.example.fundamentos.repository;

import com.example.fundamentos.entity.Aplicacao;
import org.springframework.data.repository.CrudRepository;

public interface AplicacaoRepository extends CrudRepository<Aplicacao, Long> {
    
}