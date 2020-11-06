package edu.pw.projetorest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pw.projetorest.models.Contratos;
import edu.pw.projetorest.repository.ContratosRepository;

@RestController
@RequestMapping(value = "/api")
public class ContratosResource {

    @Autowired
    ContratosRepository contratosRepository;

    // Retorna lista de contratos
    @GetMapping("/contratos")
    public List<Contratos> listaLicitacoes() {
        return contratosRepository.findAll();
    }

    // Retorna contrato por contratoId
    @GetMapping("/contratos/{contratoId}")
    public Optional<Contratos> listaContratoUnico(@PathVariable(value = "contratoId") Integer contratoId) {
        return contratosRepository.findByContratoId(contratoId);
    }

}
