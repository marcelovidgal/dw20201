package edu.pw.projetorest.repository;

import edu.pw.projetorest.models.Licitacoes;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LicitacoesRepository extends JpaRepository<Licitacoes, Long> {

    Optional<Licitacoes> findByLicitacaoId(Integer licitacaoId);

}