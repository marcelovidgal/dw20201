package edu.pw.projetorest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.pw.projetorest.models.Licitacoes;
import edu.pw.projetorest.repository.LicitacoesRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API Restful Licitações")
@CrossOrigin(origins = "*")
public class LicitacoesResource {
    @Autowired
    LicitacoesRepository licitacoesRepository;

    // Retorna lista de licitações
    @GetMapping("/licitacoes")
    @ApiOperation(value = "Retorna lista de licitações")
    public List<Licitacoes> listaLicitacoes() {
        return licitacoesRepository.findAll();
    }

    // Retorna licitação por licitacaoId
    @GetMapping("/licitacoes/{licitacaoId}")
    @ApiOperation(value = "Retorna um registro por Id da licitação")
    public Optional<Licitacoes> listaLicitacaoUnica(@PathVariable(value = "licitacaoId") Integer licitacaoId) {
        return licitacoesRepository.findByLicitacaoId(licitacaoId);
    }
}
