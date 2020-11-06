package edu.pw.projetorest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pw.projetorest.models.Servidores;
import edu.pw.projetorest.repository.ServidoresRepository;

@RestController
@RequestMapping(value = "/api")
public class ServidoresResource {
    @Autowired
    ServidoresRepository servidoresRepository;

    // Retorna lista de servidores
    @GetMapping("/servidores")
    public List<Servidores> listaLicitacoes() {
        return servidoresRepository.findAll();
    }

    // Retorna servidor por servidorId
    @GetMapping("/servidores/{servidorId}")
    public Optional<Servidores> listaServidorUnica(@PathVariable(value = "servidorId") Integer servidorId) {
        return servidoresRepository.findByServidorId(servidorId);
    }

}
