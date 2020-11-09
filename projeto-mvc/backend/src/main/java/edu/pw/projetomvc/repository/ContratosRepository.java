package edu.pw.projetomvc.repository;

import edu.pw.projetomvc.entity.Contratos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratosRepository extends JpaRepository<Contratos, Long> {
    
}