package edu.pw.projetomvc.repository;

import edu.pw.projetomvc.entity.Servidores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServidoresRepository extends JpaRepository<Servidores, Long> {
    
}