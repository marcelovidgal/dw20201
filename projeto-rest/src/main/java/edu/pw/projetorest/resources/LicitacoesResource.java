package edu.pw.projetorest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import edu.pw.projetorest.models.Licitacoes;
import edu.pw.projetorest.repository.LicitacoesRepository;

@RestController
@RequestMapping(value = "/api")
public class LicitacoesResource {
    @Autowired
    LicitacoesRepository licitacoesRepository;

    @GetMapping("/licitacoes")
    public List<Licitacoes> listaLicitacoes() {
        return (List<Licitacoes>) licitacoesRepository.findAll();
    }
}
