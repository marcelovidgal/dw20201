package edu.pw.projetomvc.repository;

import edu.pw.projetomvc.entity.Fornecedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedoresRepository extends JpaRepository<Fornecedores, Long> {
    
}