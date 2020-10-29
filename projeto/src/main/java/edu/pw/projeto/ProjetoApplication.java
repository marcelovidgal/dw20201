package edu.pw.projeto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import edu.pw.projeto.entity.Entes;
import edu.pw.projeto.entity.Servidores;
import edu.pw.projeto.entity.NaturezaCargo;
import edu.pw.projeto.entity.Unidade;
import edu.pw.projeto.repository.EntesRepository;
import edu.pw.projeto.repository.NaturezaCargoRepository;
import edu.pw.projeto.repository.UnidadeRepository;
import edu.pw.projeto.repository.ServidoresRepository;
import java.util.*;


import com.fasterxml.jackson.core.*;
import com.google.gson.Gson;
import java.net.URL;
import java.net.URI;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

@SpringBootApplication
public class ProjetoApplication {

	private static final Logger log = LoggerFactory.getLogger(ProjetoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate, EntesRepository entesRepository, ServidoresRepository servidoresRepository, 
								NaturezaCargoRepository naturezaCargoRepository, UnidadeRepository unidadeRepository) throws Exception {
		Gson gson = new Gson();

		return args -> {
			/*Entes[] entes  = restTemplate.getForObject("http://app.tce.ma.gov.br:8889/tce/api/entes", Entes[].class);

			for (Entes ente : entes) {
				entesRepository.save(new Entes(ente.getEnteId(), ente.getNome(), ente.getOrgaos()));
			}*/
			
			//URL jsonUrl = new URL("http://app.tce.ma.gov.br:8889/tce/api/entes");
			//ObjectMapper mapper = new ObjectMapper();
			//Entes[] entes = mapper.readValue(jsonUrl, Entes[].class);
			
			/*URL jsonUrl = new URL("http://app.tce.ma.gov.br:8889/tce/api/servidores/2100055");
		

			final JsonFactory factory = new JsonFactory();
			final JsonParser parser = factory.createParser(jsonUrl);

			// avança o stream até chegar no array
			while (parser.nextToken() != JsonToken.START_ARRAY) {
			    parser.nextToken();
			}

			final ObjectMapper objectMapper = new ObjectMapper();

			final List<Servidores> servidores = objectMapper.readValue(parser, new TypeReference<List<Servidores>>() {});

			for (Servidores servidor : servidores) {
				ObjectMapper mapper = new ObjectMapper();			
				NaturezaCargo naturezaCargo = mapper.readValue(servidor.getNaturezaCargo().toString(), NaturezaCargo.class);		
				Unidade unidade = mapper.readValue(servidor.getUnidade().toString(), Unidade.class);			


				servidoresRepository.save(new Servidores(servidor.getServidorId(), servidor.getNome(), servidor.getCargo(),  servidor.getCnpj(), 
				servidor.getCpf(), servidor.getMes(), servidor.getAno(), servidor.getValorBruto(), servidor.getUnidade(), servidor.getNaturezaCargo(),
				naturezaCargo, unidade,
				servidor.getAcumulos(), servidor.getValorBrutoTotal(), servidor.getNomeUnidadeLotacao()));*/
			ResponseEntity<Fornecedores[]> r = restTemplate.getForEntity("http://app.tce.ma.gov.br:8889/tce/api/fornecedores?filtro=", Fornecedores[].class);

			for(Fornecedores f : r.getBody()){
				System.out.println(f.toString());
			}
		};
	}

}