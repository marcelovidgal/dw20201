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
import edu.pw.projeto.repository.EntesRepository;


@SpringBootApplication
public class ProjetoApplication {

	public String listEntes;
	private static final Logger log = LoggerFactory.getLogger(ProjetoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);

	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate, EntesRepository repository) throws Exception {
		

		return args -> {
			Entes[] entes  = restTemplate.getForObject("http://app.tce.ma.gov.br:8889/tce/api/entes", Entes[].class);

			for (Entes ente : entes) {
				repository.save(new Entes(ente.getEnteId(), ente.getNome(), ente.getOrgaos()));
			}

		};
	}

}