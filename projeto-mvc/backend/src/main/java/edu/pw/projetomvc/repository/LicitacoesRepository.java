package edu.pw.projetomvc.repository;

import edu.pw.projetomvc.entity.Licitacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicitacoesRepository extends JpaRepository<Licitacoes, Long> {
    
}