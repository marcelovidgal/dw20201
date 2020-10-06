package com.example.fundamentos.repository;

import com.example.fundamentos.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
    
}