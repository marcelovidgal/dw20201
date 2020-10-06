package com.example.fundamentos.repository;

import com.example.fundamentos.entity.Tiquete;
import org.springframework.data.repository.CrudRepository;

public interface TiqueteRepository extends CrudRepository<Tiquete, Long> {
    
}